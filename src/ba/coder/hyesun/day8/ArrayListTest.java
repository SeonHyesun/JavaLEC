package ba.coder.hyesun.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ls=new ArrayList<Integer>();
		int sum=0;
		double averg=0;
		

		for(int i=1;i<10;i++) {
			ls.add(i);
//			sum=sum+i;

		}
		for(int j=0;j<ls.size();j++) {
			sum=sum+ls.get(j);
		}
		System.out.println(sum);
		averg=(double)sum/ls.size();
		System.out.println(averg);
	}
}
