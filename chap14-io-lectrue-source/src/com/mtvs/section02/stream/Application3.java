package com.mtvs.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
	public static void main(String[] args) {

		/* FileOutputStream */
		/*
		 * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 * 1바이트 단위로 데이터를 처리한다.
		 */
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/com/mtvs/section02/stream/testOutputStream.txt");
			
//			fout.write(97);
//			fout.write('a');
//			fout.write('b');
			
//			byte[] bar = new byte[] {'a', 'b', 'c', 'd', 10, 'e'};
//			fout.write(bar);
			
//			fout.write(bar, 2, 4);		// 'c'부터 'e'까지 출력 됨
			
			fout.write('김');			// 한글 문자는 byte로 내보낼 수 없음(1byte만 출력됨)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fout != null) {
					fout.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








