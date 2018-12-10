package ba.coder.hyesun.day5;

import ba.coder.hyesun.day2.InputVal;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=1;
		int sum = 0;
		int count = 0;
		double avg = 0;

		while(input != 0) {
			input = InputVal.getInt();
			sum =sum+input;
			count =count+1;
		}
		avg=(double)sum/(count-1);
		System.out.print("ÇÕ°è="+sum+"\t");
		System.out.println("Æò±Õ="+avg);
		System.out.println(count);
	}
}
