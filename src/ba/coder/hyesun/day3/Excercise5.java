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
		System.out.println("0에서 10까지의 수를 입력하세요");
		int input=InputVal.getInt();
		if(input>0 && input<=10) {
			System.out.println("참입니다 ");
		}else {
			System.out.println("거짓입니다");
		}
	}
	public void practice03() {
		System.out.println("2개의 정수를 입력하십시요");
		
		int input01 =InputVal.getInt();
		int input02 = InputVal.getInt();
		if(input01==input02) {
			System.out.println("두개의 숫자는 같습니다");
		}else if(input01>input02) {
			System.out.println(input02 +"보다"+input01+"이 큽니다");
		}else if(input01<input02) {
			System.out.println(input01 +"보다"+input02+"이 큽니다");
		}
		
	}
}