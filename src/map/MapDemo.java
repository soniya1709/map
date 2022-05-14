package map;

import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	TreeMap<String,String> m=new TreeMap();
	m.put("AAA", "BBB");
	m.put("BBB", "BBB");
	m.put("CCC", "BBB");
	m.put("DDD", "BBB");
	m.put("EEE", "BBB");
	System.out.println(m);
	System.out.println("containsKey ="+m.containsKey("BBB"));
	System.out.println("entrySet() ="+m.entrySet());
	System.out.println("get() ="+m.get("DDD"));
	System.out.println("values() ="+m.values());
	System.out.println("keySet() ="+m.keySet());
	System.out.println("put() ="+m.put("AAA", "BBB"));
	
}
}
