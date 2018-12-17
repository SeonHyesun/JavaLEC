package ba.coder.hyesun.day7;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};

		int length=arr.length;
		System.out.println("배열의 길이:"+length);

		int i;
		System.out.println("배열 원소의 값출력");
		for(i=0;i<arr.length;i++) {
			System.out.println(
					"arr["
							+i+
							"]="
							+arr[i]
					);

		}
	}

}
