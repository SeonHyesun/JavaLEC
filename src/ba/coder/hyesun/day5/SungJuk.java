package ba.coder.hyesun.day5;

public class SungJuk {

	public String Std_num;
	public String Std_name;
	public int kor, eng, mat;
	public int Sum(){
		System.out.println("합계는 "+(kor+eng+mat)+"입니다");
		return kor+eng+mat;
	}
	public void Ave() {
		System.out.println("평균은 "+Sum()/3+"입니다");
	}

}
