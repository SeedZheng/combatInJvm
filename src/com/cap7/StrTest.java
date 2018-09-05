package com.cap7;

public class StrTest {
	
	public static void main(String[] args) {
		char[] chars=new char[10];
		for(int i=48;i<58;i++) {
			chars[i-48]=(char) i;
		}
		System.out.println(chars);
	}

}
