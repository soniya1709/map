package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArraylistInHashMapDemo {
public static void main(String[] args) {
	Employee e1=new Employee(10,"Ram","Pune");
	Employee e2=new Employee(20,"Sham","Mumbai");
	Employee e3=new Employee(30,"Krushna","Nashik");
	ArrayList al1=new ArrayList();
	al1.add(9146244775L);
	ArrayList al2=new ArrayList();
	al1.add(7507068798L);
	ArrayList al3=new ArrayList();
	al1.add(9403553504L);
	HashMap<Employee,ArrayList> hm=new HashMap();
	hm.put(e1, al1);
	hm.put(e2, al2);
	hm.put(e3, al3);
	System.out.println(hm);
	Set<Map.Entry<Employee,ArrayList>> entries=hm.entrySet();
	Iterator<Map.Entry<Employee,ArrayList>> itr=entries.iterator();
	while(itr.hasNext())
	{
		Map.Entry<Employee,ArrayList> entry=itr.next();
		System.out.println("Key="+entry.getKey()+ " "+"Values="+entry.getValue());
}

	
}
}
