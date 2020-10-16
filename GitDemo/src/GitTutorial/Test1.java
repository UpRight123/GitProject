package GitTutorial;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> number= new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		System.out.println(number);
		System.out.println(number.get(1));
		System.out.println(number.set(0,5));
		System.out.println(number);
		System.out.println(number.remove(2));
		System.out.println(number);
		
		ArrayList<String> name=new ArrayList<String>();
		name.add(0,"Java");
		name.add(1,"C++");
		System.out.println(name);

	}

}
