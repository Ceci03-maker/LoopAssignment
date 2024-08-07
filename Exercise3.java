package loopingExercises;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		int i=1;
		int result;
		while(i<=10) {
			result = i*num;
			System.out.println(num +" * " + i +" = "+ result);
			i+=1;
		}

	}

}
/*
 * To Trace:
 * If num = 5;
 * while i =1; result = 5*1 =5 then i = 1+1=2
 * while i=2 ; result = 5*2 =10 then num=3
 * while i=3; result = 5*3 =15 then num=4
 * while i=4; result = 5*4=20 then num=5
 * while i=5; result = 5*5=25 then num=6
 * while i=6; result = 5*6=30 then num=7
 * while i=7; result = 5*7=35 then num=8
 * while i=8; result = 5*8=40 then num=9
 * while i=9; result = 5*9=45 then num=10
 * while i=10; result = 5*10=50 then num=11 and the loop stops
 
 */
