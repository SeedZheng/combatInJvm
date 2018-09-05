package com.cap4;

public class Exce {
	
	public static void main(String[] args) {
		try {
			int i=1/0;
		} catch (Exception e) {
			e=null;
			System.out.println(e);
		}
	}

}
