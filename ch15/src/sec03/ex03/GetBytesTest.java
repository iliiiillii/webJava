package sec03.ex03;

import java.io.UnsupportedEncodingException;

public class GetBytesTest {

	public static void main(String[] args) {
		String name = "이순신";
		byte[] encodeBytes = {};
		
		try {
			encodeBytes = name.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		try {
			String decodeName1 = new String(encodeBytes, "UTF-8");
			System.out.println(decodeName1);
			
			byte[] b ="hello".getBytes();
			System.out.println(b.length);
			String decodeName2 = new String(b, 2, 3,"UTF-8");
			System.out.println(decodeName2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		

	}

}
