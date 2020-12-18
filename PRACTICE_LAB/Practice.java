import java.util.*;
import java.lang.*;

class Sum_1 extends Thread {
	int sum_of_odd=0;
	Sum_1(){
		super("Sum_1");
		System.out.println("Child Thread: "+this);
		start();
	}
	public void run(){
		try{
			for(int i=1;i<=100;i++){
				if(i%2 != 0){
						 sum_of_odd= sum_of_odd + i;
					Thread.sleep(100);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("Sum of Odd Numbers from 1 to 100: "+	 sum_of_odd);
	}
}

class Practice {
	public static void main(String args[]){
		int sum_of_even=0;
		new Sum_1();
		try{
			for(int i=1;i<=100;i++){
				if(i%2 == 0){
					sum_of_even = sum_of_even + i;
					Thread.sleep(200);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Sum of Even Numbers from 1 to 100: "+sum_of_even);
	}
}
