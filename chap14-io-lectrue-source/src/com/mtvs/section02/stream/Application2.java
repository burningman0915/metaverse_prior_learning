package com.mtvs.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
	public static void main(String[] args) {
		
		/* FileReader */
		/*
		 * FileInputStream과 사용하는 방법이 거의 동일하다.
		 * 단, byte단위가 아닌 character단위(인코딩 방식에 맞춰서)로 인지하고 읽어들인다는 부분이 차이점이다.
		 * 따라서 2바이트이던 3바이트이던 해당 인코딩 방식의 문자 단위로 읽어오기 때문에 한글을 정상적으로
		 * 읽어올 수 있다.
		 */
		
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/mtvs/section02/stream/testReader.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
