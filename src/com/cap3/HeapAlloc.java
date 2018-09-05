package com.cap3;

public class HeapAlloc {
	
	public static void main(String[] args) {
		System.out.print("max  mermory==");
		System.out.println(Runtime.getRuntime().maxMemory()+" bytes");
		System.out.print("free mermory==");
		System.out.println(Runtime.getRuntime().freeMemory()+" bytes");
		System.out.print("total mermory==");
		System.out.println(Runtime.getRuntime().totalMemory()+" bytes");
		
		byte[] b=new byte[1024*1024];
		System.out.println("给系统分配了1MB空间");
		//b=null;
		//System.gc();
		
		System.out.print("max  mermory==");
		System.out.println(Runtime.getRuntime().maxMemory()+" bytes");
		System.out.print("free mermory==");
		System.out.println(Runtime.getRuntime().freeMemory()+" bytes");
		System.out.print("total mermory==");
		System.out.println(Runtime.getRuntime().totalMemory()+" bytes");
		
		b=new byte[4*1024*1024];
		System.out.println("给系统分配了4MB空间"); 
		
		System.out.print("max  mermory==");
		System.out.println(Runtime.getRuntime().maxMemory()+" bytes");
		System.out.print("free mermory==");
		System.out.println(Runtime.getRuntime().freeMemory()+" bytes");
		System.out.print("total mermory==");
		System.out.println(Runtime.getRuntime().totalMemory()+" bytes");
	}

}
