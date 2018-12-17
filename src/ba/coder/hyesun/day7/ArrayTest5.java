package ba.coder.hyesun.day7;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {70,80,60,90,70};
		int max=0;
		int min=0;

		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		min=max;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);


	}

}
