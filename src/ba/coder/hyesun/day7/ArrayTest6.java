package ba.coder.hyesun.day7;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=JOptionPane.showInputDialog("input");
		
		char inputArr[]=new char[input.length()];
		for(int i=0;i<inputArr.length;i++) {
			inputArr[i]=input.charAt(i);
		}
		boolean isPalindrome=true;
		for(int i=0;i<inputArr.length/2;i++) {
			System.out.println(inputArr[i]+"/"+inputArr[inputArr.length-1-i]);
			if(inputArr[i]!=inputArr[inputArr.length-1-i]) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(input+"은 회문입니다.");
		}else
			System.out.println(input+"은 회문이 아닙니다.");
	}
}
