package com.cap3;

public class RefReveal {
	
	public static void main(String[] args) {
		byte[] b1=new byte[3*1024*1024];
		System.out.println("b1分配完毕");
		byte[] b2=b1;
		System.out.println("b2分配完毕");
		b1=null;
		System.out.println("b1置空");
		System.out.println(b2.length);
	}

}
