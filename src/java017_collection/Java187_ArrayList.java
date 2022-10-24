package java017_collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Enumeration은 Vector와 Hashtable에서만 제공이 되는 인터페이스이다.
public class Java187_ArrayList {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println("=== 일반 for ===");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("=== Enumeration ===");

		// 열거형
		Enumeration<Integer> enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		System.out.println("=== Iterator ===");

		// 반복자
		Iterator<Integer> ite = v.iterator();
		while (ite.hasNext())
			System.out.println(ite.next());

		System.out.println("=== 개선된 루프 ===");

		for (Integer ig : v)
			System.out.println(ig);

		System.out.println("=== ArrayList ===");

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		// ArrayList는 enumeration이 제공되지 않는다.

		System.out.println("=== 일반 for ===");
		for (int i = 0; i < aList.size(); i++)
			System.out.println(aList.get(i));

		System.out.println("=== Iterator ===");

		// 반복자 Iterator : 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 그 중 하나.
		Iterator<Integer> ite2 = aList.iterator();
		while (ite2.hasNext()) // hasNext() : 읽어올 요소가 남아있는지 확인하는 메서드.
			System.out.println(ite2.next());

		System.out.println("=== 개선된 루프 ===");
		for (Integer it2 : aList)
			System.out.println(it2);
	} // end main()

} // end class