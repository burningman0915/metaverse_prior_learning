package com.mtvs.section07.initblock;

public class EnumEx {
    public static void main(String[] args) {

        for(EnumType type : EnumType.values()){
            System.out.println("type = " + type);
        }

				EnumType[] enumArr = EnumType.values();
				for(int i = 0; i < enumArr.length; i++) {
						System.out.println("type = " + enumArr[i]);
        }

    }
}

enum EnumType {
    JAVA, SPRING, ORACLE, MYSQL 
}
