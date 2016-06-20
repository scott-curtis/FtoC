
public class main {

	public static void main(String[] args) {
		float fahrenheit, celsius;
		fahrenheit = Integer.parseInt(args[0]);
		celsius = (float) ((fahrenheit - 32.0) * (5.0 / 9.0));
		System.out.println(celsius);
	}

}
