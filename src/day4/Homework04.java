package day4;

import ba.coder.hyesun.day2.InputVal;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0���� ū ���� �Ѱ��� �Է��Ͻÿ�");
		int num1 =  InputVal.getInt();
		if(num1>0) {
			if(num1%2==0) {
				System.out.println("����Դϴ�. ¦���Դϴ�.");
			}else {
				System.out.println("����Դϴ�. Ȧ���Դϴ�.");
			}
		}else {
			if(num1%2!=0) {
				System.out.println("�����Դϴ�. Ȧ���Դϴ�.");
			}else 
				System.out.println("�����Դϴ�. ¦���Դϴ�.");
		}
	}
}