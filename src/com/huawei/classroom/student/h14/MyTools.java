package com.huawei.classroom.student.h14;

import java.io.*;
import java.util.*;
/**
 * 在本包下增加合适的类和方法， 本程序不但要测试通过，还需要写适当的注释
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author super
 *
 */
public class MyTools {
	public static int CHUNK_SIZE = 4096;

	public MyTools( ) {
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	 * @param studentListFile  存放学生名单的文件名
	 * @param srcDir 图片存放的目录（不会包含子目录）
	 */
	public Set<String> copyToTargetDirAndReturnNoExist(String studentListFile,String srcDir,String target) throws Exception {
		List<String[]> nameList = getNameList(studentListFile);
		List<String> fileIdList = getValidFileIdList(srcDir);
		Set<String> noExistIdSet = new HashSet<>();

		for (String[] stu : nameList) {
			File targetDir = new File(target, stu[2]);
			if (!targetDir.exists()) {
				targetDir.mkdirs();
			}
		}
		int i;
		for (i = 0; i < nameList.size(); i++) {
			String id = nameList.get(i)[0];
			String name = nameList.get(i)[1];
			String classNo = nameList.get(i)[2];

			if (!fileIdList.contains(id)) {
				noExistIdSet.add(id);
			} else {
				String srcPath = srcDir + id + ".jpg";
				String targetPath = target + classNo + "/" + id + "_" + name + ".jpg";
				copyFile(srcPath, targetPath);
			}
		}
		return noExistIdSet;
	}

	/**
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 */
 	public List<String> getValidFileIdList(String filename) throws FileNotFoundException {
		List<String> result = new ArrayList<>();
		File file = new File(filename);
		File[] fileList = file.listFiles();
		if (fileList == null) {
			throw new FileNotFoundException();
		}
		for (File fileEle : fileList) {
			String name = fileEle.getName();
			if (name.matches("[0-9]{10}.jpg")) {
				result.add(name.substring(0, 10));
			}
		}
		return result;
	}

	/**
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public List<String[]> getNameList(String filename) throws IOException {
		String line = "";
		Reader reader;
		List<String[]> result = new ArrayList<>();
		reader = new FileReader(filename);
		LineNumberReader lineReader = new LineNumberReader(reader);
		while (true) {
			line = lineReader.readLine();
			if (line == null) {
				break;
			}
			result.add(line.split("\t"));
		}
		return result;
	}

	/**
	 * 复制IO流
	 *
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static void copyIO(InputStream in, OutputStream out)
			throws IOException {
		byte[] buf = new byte[CHUNK_SIZE];
		/**
		 * 从输入流读取内容并写入到另外一个流的典型方法
		 */
		int len = in.read(buf);
		while (len != -1) {
			out.write(buf, 0, len);
			len = in.read(buf);
		}
	}

	/**
	 * 复制文件
	 *
	 * @param fsrc
	 * @param fdest
	 * @throws IOException
	 */
	public static void copyFile(String fsrc, String fdest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(fsrc);
			out = new FileOutputStream(fdest, true);
			copyIO(in, out);
		} finally {
			close(in);
			close(out);
		}
	}

	/**
	 * 关闭一个输入 输出流
	 *
	 * @param inout
	 */
	public static void close(Closeable inout) {
		if (inout != null) {
			try {
				inout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
