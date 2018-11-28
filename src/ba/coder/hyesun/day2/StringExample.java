package ba.coder.hyesun.day2;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = new String();
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.substring(1,3));
		System.out.println(str1.replaceAll("l", "o"));
	}

}
