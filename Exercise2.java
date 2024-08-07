package loopingExercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		int OrgNum = num;
		int result =1;
		while (num>0) {
			result *=num;
			num--;
		}
		input.close();
		System.out.print("The factorial of "+OrgNum+" is "+result);
	}
	

}
/*
 * To Trace:
 * If num = 5;
 * while num=5 ; result = 1*5 =5 then num = 5-1=4
 * while num=4 ; result = 5*4 =20 then num=3
 * while num=3 ; result = 20*3 =60 then num=2
 * while num=2 ; result = 60*2 =120 then num=1
 * while num=1 ; result = 120*1 =120 then num=0 and loop stops
 
 */
