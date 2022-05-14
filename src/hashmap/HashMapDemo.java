package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	Employee e=new Employee(10,"Ram","Pune");
	Employee e1=new Employee(20,"Sham","Mumbai");
	Employee e2=new Employee(30,"Krushna","Nashik");
	
	HashMap<Integer,Employee> hm=new HashMap();
	hm.put(1, e);
	hm.put(2, e1);
	hm.put(3, e2);
	System.out.println(hm);
	Set<Map.Entry<Integer,Employee>> entries=hm.entrySet();
	
	Iterator<Map.Entry<Integer,Employee>> itr=entries.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
