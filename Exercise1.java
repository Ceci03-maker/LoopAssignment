package loopingExercises;

public class Exercise1 {

	public static void main(String[] args) {
		int i =0;
		int sum=0;
		while (i<=10) {
			sum+=i;
			i++;
		}
		System.out.print("The sum of numbers from 1 to 10 is :" + sum);

	}

}
/*
 * To Trace:
 * while i=0 ; sum = 0+0=0 then i=0+1=1
 * while i=1 ; sum = 0+1=1 then i=1+1=2
 * while i=2 ; sum = 1+2=3 then i=2+1=3
 * while i=3 ; sum = 3+3=6 then i=3+1=4
 * while i=4 ; sum = 6+4=10 then i=4+1=5
 * while i=5 ; sum = 10+5=15 then i=5+1=6
 * while i=6 ; sum = 15+6=21 then i=6+1=7
 * while i=7 ; sum = 21+7=28 then i=7+1=8
 * while i=8 ; sum = 28+8=36 then i=8+1=9
 * while i=9 ; sum = 36+9=45 then i=9+1=10
 * while i=10 ; sum = 45+10=55 then i=10+1=11 then loop stops
 
 */