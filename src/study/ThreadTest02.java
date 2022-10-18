package study;

import java.util.Calendar;
class PrintTimea implements Runnable
{
	public void run(){	
		while(true){
			Calendar now = Calendar.getInstance();
			int hours = now.get(Calendar.HOUR);
			int minutes = now.get(Calendar.MINUTE);
			int seconds = now.get(Calendar.SECOND);
			System.out.printf("안녕하세요 %d:%d:%d\n",hours,minutes,seconds);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class ThreadTest02 
{
	public static void main(String[] args) 
	{
		PrintTime pt = new PrintTime();
		new Thread(pt).start();
	}
}
