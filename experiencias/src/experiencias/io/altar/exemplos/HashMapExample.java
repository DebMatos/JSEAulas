package experiencias.io.altar.exemplos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> stringMap=new HashMap<String, String>();
		stringMap.put("1","ze carlos");
		stringMap.put("2","ze Manel");
		
		Iterator<String>  stringIterator=stringMap.values().iterator();
		while(stringIterator.hasNext() ){ 
			System.out.println("String Value:"+stringIterator.next());
		}
		
		Iterator<String>  stringKeyIterator=stringMap.keySet().iterator();
		while(stringIterator.hasNext() ){ 
			System.out.println("String Value:"+stringIterator.next());
		}
	}

}
