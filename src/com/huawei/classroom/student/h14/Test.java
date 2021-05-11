package com.huawei.classroom.student.h14;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 阅读Test类，在MyTools 中完成相应代码 
 * @author cjy 
 *
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			/**
			 * 现在所有学生的名单students.txt（为了避免乱码问题，文件中不包含汉字），其中每行为一个学生信息，包括学号、姓名、班级，以tab符号分割(\t)，
			 * 学院要求所有同学把自己一寸照片发给辅导员，图片命名规则为 “学号.jpg” 
			 * 
			 * 现在存在下列问题。请用编程的方式帮助辅导员解决如下问题：
			 *  1) 找出那些同学的照片没有交照片； 
			 *  2) 在目标目录下每个班级建立一个字目录，把上交的同学的照片，统一按 学号_姓名.jpg 方式拷贝到各自班级目录下，原来的文件不要删除. 
			 **/
			// 实际测试中，文件存放位置可能改变，学生数量也可能改变
			// 其中每行为一个学生信息，包括学号、姓名、班级，以tab符号分割(\t)，
			String studentListFileName="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/students.txt";
			// 学生照片存放的目录，不会包含子目录，本目录的pic给出了存放图片的目录示例，实际测试中，pic 位置可能改变，其下面文件数量也会改变
			String picDir="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/pic/";
			String targetDir="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/target/";
					
			MyTools tools = new MyTools(  );
			
			// nopicsIds返回所有没有上交照片的学生ID（）
			Set<String> nopicsIds = tools.copyToTargetDirAndReturnNoExist(studentListFileName,picDir,targetDir);
			Set<String> test=new HashSet<String>();
			System.out.println(nopicsIds);
			test.add("3016218088");
			test.add("3016218009");
			 if(test.equals(nopicsIds)) {
				 System.out.println("如果target下面也像这个例子一样按班级整理好了学生文件，那么就做对了");	 
			 }
			 //2
			String studentListFileName2="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/students_test.txt";
			// 学生照片存放的目录，不会包含子目录，本目录的pic给出了存放图片的目录示例，实际测试中，pic 位置可能改变，其下面文件数量也会改变
			String picDir2="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/pic_test/";
			String targetDir2="/Users/super/IdeaProjects/OOP_homeworks/src/com/huawei/classroom/student/h14/target_test/";

			MyTools tools2 = new MyTools(  );

			// nopicsIds返回所有没有上交照片的学生ID（）
			Set<String> nopicsIds2 = tools.copyToTargetDirAndReturnNoExist(studentListFileName2,picDir2,targetDir2);
			Set<String> test2=new HashSet<String>();
			System.out.println(nopicsIds2);
			test2.add("3016218014");
			test2.add("3016218015");
			if(test2.equals(nopicsIds2)) {
				System.out.println("如果target下面也像这个例子一样按班级整理好了学生文件，那么就做对了2");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
