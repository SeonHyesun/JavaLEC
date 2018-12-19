package ba.coder.hyesun.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>();

		ls.add("Hi!");
		ls.add("Have");
		ls.add("a nice day!");

		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());

		}
		System.out.println();

		ls.add(3, "Everybody~");
		for(int i=0;i<ls.size();i++)
			System.out.print(i+":"+ls.get(i).toString());
		System.out.println();

		ls.remove(0);
		for(int i=0;i<ls.size();i++)
			System.out.println(i+":"+ls.get(i).toString());
		System.out.println();

		Iterator<String> iter=ls.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		ls.clear();
		if(ls.isEmpty()) {
			System.out.println("list empty");
		}

	}

}
