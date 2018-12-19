package ba.coder.hyesun.day8;

import javax.swing.JOptionPane;

public class number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		int input=Integer.parseInt(JOptionPane.showInputDialog("B;"));
		int BB=input;
		int count=0;
		
		while(input !=0) {
			array[count++]=input%2;
			input /=2;
			
		}
		System.out.println("BB: "+BB);
		for(int i=count-1;i>=0;i--) {
			System.out.print(array[i]);
		}

	}

}
