package experiencias.io.altar.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStrings= new ArrayList<>();
		
		
listStrings.add("ze carlos");
listStrings.add("ze manel");

Iterator<String> it=listStrings.iterator();

while(it.hasNext()){
	String elements=it.next();
System.out.println(listStrings);
}
	}

}
