package setex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest4 {

	public static void main(String[] args) {
		HashSet<Integer> setA = new HashSet<>();
		setA.add(1);		setA.add(2);		setA.add(3);
		setA.add(4);		setA.add(5);		setA.add(6);
		
		HashSet<Integer> setB = new HashSet<>();
		setB.add(4);		setB.add(5);		setB.add(6);
		setB.add(7);		setB.add(8);		setB.add(9);
		
		// 4 5 6 �� ��ģ�� : ������     A-B   1 2 3 : ������
		// 1~9 : ������
		HashSet<Integer> setKyo = new HashSet<>();
		HashSet<Integer> setCha = new HashSet<>();
		HashSet<Integer> setHap = new HashSet<>();
		
		//������ :  add ��  !true
		Iterator<Integer> iter = setA.iterator();
		while(iter.hasNext()){
			Integer toInt = iter.next();
			if(setB.contains(toInt)){
				setKyo.add(toInt);
			}
		}
		System.out.println("������ : " + setKyo);
		
		
		//������
		iter = setA.iterator();
		Iterator<Integer> iter2 = setB.iterator();
		while(iter.hasNext()){
			Integer toInt = iter.next();
			if(!(setB.contains(toInt)))
				setCha.add(toInt);
		}
		while(iter2.hasNext()){
			Integer toInt = iter2.next();
			if(!(setA.contains(toInt)))
				setCha.add(toInt);
		}
		System.out.println("������ : " + setCha);
		
		//������
		iter = setA.iterator();
		while(iter.hasNext())
			setHap.add(iter.next());
		iter2 = setB.iterator();
		while(iter2.hasNext())
			setHap.add(iter2.next());
		System.out.println("������ : "+setHap);

		
	}

}


