/**
 * 
 */
package com.huawei.classroom.student.h16;


/**
 * @author super
 *
 */
public class MyServer {

	
	public MyServer() {
	}
	
	public void startListen(int port) {
		Thread serverThread = new ServerThread(port);
		serverThread.start();
	}
}
