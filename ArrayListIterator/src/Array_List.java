
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {

		// List <Integer> list = new ArrayList <> (3);
		// List list = new ArrayList ();

		Collection<String> list = new HashSet<>();

		list.add("ciao");
		list.add("Mare");
		list.add("CiaoCiao");

		// int size = list.size();

		// for(int i = 0; i < size; i++) {
		// System.out.println(list.get(i));
		// }

		// for(Integer temp : list) {
		// System.out.println(temp);
		// }

		// for(Object temp : list) {
		// System.out.println(temp);
		// }

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
