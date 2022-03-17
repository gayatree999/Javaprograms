package javaprogprac;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Hash Table is similar as Hash map
		//difference betwn hash map and hash table: hash map is non synchronous and hash table follows Synchronization or Thread safe
		//Null key and null values- hash map allows one null key and any number of null values, but hash table doesn't
		//there is no iterator in hash table(instad you have to use enumerator)
		
		Hashtable<String, String> hm2 = new Hashtable<String, String>(); // hash table
		
		hm.put(0, "test1");
		hm.put(1, "test2");
		hm.put(2, "test3");
		hm.put(4, "test4");

		System.out.println(hm.get(0)); // value using key

		/* System.out.println(hm.get(2)); 
		 hm.remove(2); 
		 System.out.println(hm.get(2)); */
		
		// interview que- create hastable, and pass that table to set collection and print key & value using iterator

		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
