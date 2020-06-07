package com.machuxin.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


//同步阻塞IO模型
public class BIOServer {

	//服务端网络IO模型的封装对象
	ServerSocket server;
	//服务器
	public BIOServer(int port){
		try {
			//Tomcat 默认端口8080
			server = new ServerSocket(port);
			System.out.println("BIO服务已启动，监听端口是：" + port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 开始监听，并处理逻辑
	 * @throws IOException 
	 */
	public void listen() throws IOException{
		//循环监听
		while(true){
			//等待客户端连接，阻塞方法
			//Socket数据发送者在服务端的引用
			Socket client = server.accept();
			System.out.println(client.getPort());

			//获取客户端数据
			InputStream is = client.getInputStream();

			//网络客户端把数据发送到网卡，机器所得到的数据读到了JVM内中
			byte [] buff = new byte[1024];
			int len = is.read(buff);
			if(len > 0){
				String msg = new String(buff,0,len);
				System.out.println("收到" + msg);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		new BIOServer(8080).listen();
	}
	
}
