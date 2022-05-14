package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WaystoIterateHashMap {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap();
	hm.put("Sachin", "Ckricet");
	hm.put("Zidane", "Football");
	hm.put("Sayana", "Tennis");
	System.out.println(hm);
	
	System.out.println("First Way :entrySet ->Iterator");
	Set<Map.Entry<String,String>> entries=hm.entrySet();
	Iterator<Map.Entry<String,String>> itr=entries.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("************");
	System.out.println("Second way : KeySet ->Iterator");
	Set<String> entries1=hm.keySet();
	Iterator<String> itr1=entries1.iterator();
	while(itr1.hasNext())
	{     String key=itr1.next();
		System.out.println(key+ "="+hm.get(key));
		
	}
	System.out.println("***********");
	System.out.println("Third way :EntrySet ->for-each");
	Set<Map.Entry<String,String>> entries2=hm.entrySet();
	for(Map.Entry<String,String> s:entries2)
	{
		System.out.println(s);
	}
	System.out.println("***********");
	System.out.println("fourth Way :keySet ->for-each");
	Set<String> entries3=hm.keySet();
	for(String s1:entries3)
	{
		String key=s1;
		System.out.println(s1+"="+hm.get(key));
	}
	
}
}
