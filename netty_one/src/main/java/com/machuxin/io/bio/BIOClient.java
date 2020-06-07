package com.machuxin.io.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.UUID;

public class BIOClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// 连接服务端
		Socket client = new Socket("localhost", 8080);

		// 获取输出流（相对于内存输入或输出）
		OutputStream os = client.getOutputStream();

		//生成一个随机的ID
		String name = UUID.randomUUID().toString();

		System.out.println("客户端发送数据：" + name);
		//传说中的101011010
		os.write(name.getBytes());
		os.close();
		client.close();

	}
	
}
