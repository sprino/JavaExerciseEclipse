

public class While {
	public void somma_elem_numero(int n) {
		int i = 0;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("La somma dei 10 numeri è: " + sum + "\n");
	}
}
