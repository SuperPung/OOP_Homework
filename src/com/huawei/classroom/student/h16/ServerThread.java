/**
 * 
 */
package com.huawei.classroom.student.h16;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author super
 *
 */
public class ServerThread extends Thread {
	private final int port;
	private ServerSocket server;
	private Socket socket;
	private InputStream in;
	private OutputStream out;
	private static final int MAX_LEN = 100;
	private static final String STOP_STRING = "bye" + "\r\n";

	public ServerThread(int port) {
		server = null;
		socket = null;
		in = null;
		out = null;
		this.port = port;
	}

	@Override
	public void run() {
		try {
			server = new ServerSocket(port);
			socket = server.accept();
			in = socket.getInputStream();
			out = socket.getOutputStream();
			byte[] data = new byte[MAX_LEN];
			int readed = in.read(data);
			String line = new String(data, 0, readed);
			while (!STOP_STRING.equals(line)) {
				out.write(line.getBytes());
				readed = in.read(data);
				line = new String(data, 0, readed);
			}
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(in);
			close(out);
			close(socket);
			close(server);
		}
	}
	public void close(Closeable inout) {
		if (inout != null) {
			try {
				inout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
