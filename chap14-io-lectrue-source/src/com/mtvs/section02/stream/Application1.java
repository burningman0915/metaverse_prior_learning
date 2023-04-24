package com.mtvs.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
	public static void main(String[] args) {
		
		/* FileInputStream */
		FileInputStream fin = null;
		try {
			
			/* 같은 패키지에 존재하는 testInputStream.txt 파일을 대상으로 파일을 읽어오기 위한 InputStream 생성 */
			fin = new FileInputStream("src/com/mtvs/section02/stream/testInputStream.txt");
			
			/*
			 * read(): 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1을 반환
			 *         읽어온 한 바이트는 문자를 int로 반환하며 해당 문자의 유니코드 번호에 해당된다.
			 */
			int value = 0;
			while((value = fin.read()) != -1) {			// 1바이트씩 읽어온 정수를 변수에 대입하고 파일의 끝까지 반복시키는 조건식
				System.out.println((char)value);		// int 값을 유니코드의 문자로 변환하기 위한 char 다운 캐스팅
			}
			
			/*
			 * 한글은 한 글자에 utf-8 인코딩 방식의 경우 3바이트이기 때문에 3바이트의 데이터를
			 * 1바이트씩 끊어서 읽어오면 글자가 깨지게 된다.
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fin != null) {	// 스트림 객체가 생성 되었다면(스트림이 열렸다면)
					
					/*
					 * 자원 반납을 해야 하는 이유
					 * 1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서
					 *    누수(leak)가 발생한다.(메모리 낭비)
					 * 2. 만약 잔류 데이터가 남은 상황에서 추가로 같은 스트림을 사용한다면 데드락
					 *    (deadlock) 상태가 된다.
					 *    close() 메소드에는 flush()를 통해 남은 잔류 데이터를 내보내 줄 수 있으므로
					 *	  반드시 마지막에 close()를 호출해 주어야 한다.
					 */
					fin.close();	// 스트림 객체를 반환한다(스트림을 닫는다)
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
