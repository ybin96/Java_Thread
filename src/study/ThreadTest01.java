package study;

import java.util.Date;
class PrintTime extends Thread
{
	public void run(){
		while(true){
			Date now = new Date();
			int hours = now.getHours();
			int minutes = now.getMinutes();
			int seconds = now.getSeconds();
			System.out.printf("안녕하세요 ? %d:%d:%d\n",hours,minutes,seconds);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class ThreadTest01 
{
	public static void main(String[] args) 
	{
		PrintTime pt = new PrintTime();
		pt.start();
	}
}
