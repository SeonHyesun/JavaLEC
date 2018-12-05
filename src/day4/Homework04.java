package day4;

import ba.coder.hyesun.day2.InputVal;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0보다 큰 정수 한개를 입력하시요");
		int num1 =  InputVal.getInt();
		if(num1>0) {
			if(num1%2==0) {
				System.out.println("양수입니다. 짝수입니다.");
			}else {
				System.out.println("양수입니다. 홀수입니다.");
			}
		}else {
			if(num1%2!=0) {
				System.out.println("음수입니다. 홀수입니다.");
			}else 
				System.out.println("음수입니다. 짝수입니다.");
		}
	}
}