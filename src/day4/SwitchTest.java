package day4;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int In_Num;
		In_Num=Integer.parseInt(JOptionPane.showInputDialog("��ȣ�Է�:"));

		switch(In_Num) {
		case 1:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");break;
		case 2:
			System.out.println("������ݸ� �����ϼ̽��ϴ�.");break;
		case 3:
			System.out.println("�����Աݸ� �����ϼ̽��ϴ�.");break;
		case 4:
			System.out.println("������ü�� �����ϼ̽��ϴ�.");break;
		default:
			System.out.println("��ȣ�� �߸� �����̽��ϴ�.");
		}

	}

}
