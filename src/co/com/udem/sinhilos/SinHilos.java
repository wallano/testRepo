package co.com.udem.sinhilos;

public class SinHilos {

	String atributo;

	public SinHilos(int i) {
		atributo = "algo" + i;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			SinHilos sh = new SinHilos(i);
			sh.run();
		}
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ": " + atributo);
		}
	}
}
