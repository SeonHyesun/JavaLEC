package ba.coder.hyesun.day3;
import ba.coder.hyesun.day2.InputVal;
public class Excercise5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excercise5 exr = new Excercise5();
//		exr.practice04();
		exr.practice03();
	}	
	public void practice04() {
		System.out.println("0���� 10������ ���� �Է��ϼ���");
		int input=InputVal.getInt();
		if(input>0 && input<=10) {
			System.out.println("���Դϴ� ");
		}else {
			System.out.println("�����Դϴ�");
		}
	}
	public void practice03() {
		System.out.println("2���� ������ �Է��Ͻʽÿ�");
		
		int input01 =InputVal.getInt();
		int input02 = InputVal.getInt();
		if(input01==input02) {
			System.out.println("�ΰ��� ���ڴ� �����ϴ�");
		}else if(input01>input02) {
			System.out.println(input02 +"����"+input01+"�� Ů�ϴ�");
		}else if(input01<input02) {
			System.out.println(input01 +"����"+input02+"�� Ů�ϴ�");
		}
		
	}
}