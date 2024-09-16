package chapter19;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		// 소켓 생성
		ServerSocket server = null;
		
		try {
			
			server = new ServerSocket(9999);
			
			// 무한 반복 (클라이언트 접속 대기)
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
