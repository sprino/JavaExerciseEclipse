

import java.util.HashMap;
import java.util.Map;

public class MappaMain {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(0, "Ciao");
		map.put(1, "Mare");

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
	}
}
