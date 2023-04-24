package com.mtvs.section03.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.mtvs.section03.filterstream.dto.MemberDTO;

public class Application4 {
	public static void main(String[] args) {
		
		/*
		 * 객체 단위로 입출력을 하기 위한 스트림
		 * ObjectInputStream / ObjectOutputStream
		 */
		ArrayList<MemberDTO> arr = new ArrayList<>();
		arr.add(new MemberDTO("user01", "pass01", "홍길동", "hong777@greedy.com", 25, '남', 1250.7));
		arr.add(new MemberDTO("user02", "pass02", "유관순", "korea31@greedy.com", 16, '여', 1221.6));
		arr.add(new MemberDTO("user03", "pass03", "이순신", "leesoonsin@greedy.com", 22, '남', 1234.3));
		
		/* 직렬화를 통한 객체단위 출력 */
		ObjectOutputStream objOut = null;
		try {
			objOut = new ObjectOutputStream(new BufferedOutputStream(
			new FileOutputStream("src/com/mtvs/section03/filterstream/testObjectStream.txt")));
			
			for(int i = 0; i < arr.size(); i++) {
				objOut.writeObject(arr.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(objOut != null) {
					objOut.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		ArrayList<MemberDTO> inputArr = new ArrayList<>();
		
		/* 직렬화를 통한 객체 단위 입력 */
		ObjectInputStream objIn = null;
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/com/mtvs/section03/filterstream/testObjectStream.txt");
			bis = new BufferedInputStream(fis);
			objIn = new ObjectInputStream(bis);
			
			while(true) {
//				System.out.println(objIn.readObject());
				Object obj = objIn.readObject();
				if(obj instanceof MemberDTO) {
					inputArr.add((MemberDTO)obj);
				}
			}
		} catch (EOFException e) {
			System.out.println("파일의 객체들 읽기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(objIn != null) {
					objIn.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(MemberDTO member : inputArr) {
			System.out.println(member);
		}
	}
}








