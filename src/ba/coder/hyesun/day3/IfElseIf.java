package ba.coder.hyesun.day3;

import ba.coder.hyesun.day2.InputVal;

public class IfElseIf {
	public static void main(String[] args) {
		int JumSu ;
		char HakJum;
		JumSu=InputVal.getInt();

		if(JumSu>=90) {
			HakJum='A';
		}else if(JumSu>=80) {
			HakJum='B';
		}else if(JumSu>=70) {
			HakJum='C';
		}else {
			HakJum='F';
		}
		System.out.println("취득한 학점은 "+HakJum+" 입니다");

	}

}
