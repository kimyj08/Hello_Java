package chapter19;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString():" + conn);
			System.out.println("getAllowUserInteraction():" + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout():" + conn.getConnectTimeout());
			System.out.println("getContent():" + conn.getContent());
			System.out.println("getContentEncoding():" + conn.getContentEncoding());
			System.out.println("getContentLength():" + conn.getContentLength());
			System.out.pirnltn("getContentType():" + conn.getContentType());
		}

	}

}
