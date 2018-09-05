package com.cap4;

import java.util.HashMap;

public class StopWorldTest {
	public static class MyThread extends Thread{
		HashMap map=new HashMap<>();
		@Override
		public void run() {
			try {
				while(true) {//如果map占用的大小达到900MB，则清空map
					if(map.size() *512/1024/1024>=900) {
						map.clear();
						System.out.println("map cleared");
					}
					byte[] b1;
					for(int i=0;i<100;i++) {
						b1=new byte[512];//每次往map里放512字节的数据
						map.put(System.nanoTime(), b1);
					}
					Thread.sleep(1);
				}
			} catch (Exception e) {
				
			}
		}
	}
	public static class PrintThread extends Thread{
		public static final long startTime=System.currentTimeMillis();

		@Override
		public void run() {
			try {
				while(true) {
					long t=System.currentTimeMillis()-startTime;
					System.out.println(t/1000+"."+t%1000);
					Thread.sleep(100);
				}
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		PrintThread t2=new PrintThread();
		t1.start();
		t2.start();
	}

}

//-Xmx1g -Xms1g -Xmn512k -XX:+UseSerialGC -Xloggc:gc.log -XX:+PrintGCDetails
//-Xmx1g -Xms1g -Xmn900m -XX:SurvivorRatio=1 -XX:+UseSerialGC -Xloggc:gc.log -XX:+PrintGCDetails
