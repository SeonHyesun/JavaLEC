package ba.coder.hyesun.day7;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {20,50,77,98,46,13,24,65,64,51};
		int sum=0;
		double averg=0;

		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
		averg=(double)sum/array.length;
		System.out.println(averg);
	}
}
