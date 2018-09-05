package com.cap5;

public class BigObjTest {
	
	public static void main(String[] args) {
		byte[] b=new byte[6*1024*1024];
		byte[] b1=new byte[6*1024*1024];
		//byte[] b=new byte[8*1024*1024];
	}
	
	//-Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+UseSerialGC 
	//判断在survivor空间不足的清空下是否会马上进入老年代 是
	//-Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+UseSerialGC
	//判断在eden空间不足，Eden+survivor空间足够的情况下是否会马上进入老年代 是

}
