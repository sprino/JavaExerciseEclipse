

public class ContenitoreMain {

	public static void main(String[] args) {

		Contenitore<Integer> c = new Contenitore<Integer>();

		c.setObject(500);

		Integer object = c.getObject();

		System.out.println(object);
	}
}