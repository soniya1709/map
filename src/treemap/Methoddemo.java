package treemap;

import java.util.TreeMap;

public class Methoddemo {
public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap();
	tm.put(10,"AAA");
	tm.put(20, "BBB");
	tm.put(30, "CCC");
	tm.put(40, "DDD");
	tm.put(50, "EEE");
	System.out.println(tm);
	System.out.println(tm.lowerKey(20));
	System.out.println("lowerEntery="+tm.lowerEntry(30));
}
}
