package ba.coder.hyesun.day7;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,3,4,5,6,7,8,9};

		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
		for(int num:array) {
			System.out.println("num: "+num);
		}
		int i=0;
		while(i !=array.length) {
			System.out.println("array["+i+"]="+array[i++]);
		}

	}

}
