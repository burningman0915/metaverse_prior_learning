package com.mtvs.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
	public static void main(String[] args) {
		
		/*
		 * 버퍼를 이용해서 성능 향상을 시키는 보조 스트림을 사용해 보자. (Reader나 Writer 기준)
		 * BufferedWriter / BufferedReader
		 */
		
		/* Buffered 보조스트림을 활용한 출력 */
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(
					new FileWriter("src/com/mtvs/section03/filterstream/testBuffered.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("만나서\n");
			bw.write("반갑소~");
			
			/*
			 * 버퍼를 이용하는 경우 버퍼가 가득 차면 자동으로 내보내기를 하지만
			 * 버퍼가 가득 차지 않은 상태에서는 강제로 내보내기를 해야 한다.
			 * close()를 하지 않고 확인해 보면 파일에 기록되지 않는 것을 볼 수 있는데
			 * 이 때 flush()를 해 주면 파일에 버퍼에 있던 출력한 내용이 기록된다.
			 */
//			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					
					/* 보조스트림의 close()를 호출하면 내부적으로 flush()를 하고
					 *  기본 스트림 및 보조 스트림의 자원을 반납한다. */
					bw.close();	
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/* Buffered 보조스트림을 활용한 입력 */
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(
					new FileReader("src/com/mtvs/section03/filterstream/testBuffered.txt"));
			
			String temp = "";
			while((temp = br.readLine()) != null) {		// readLine()메소드는 한줄 씩 읽어오고 끝을 만나면 null을 반환
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}







