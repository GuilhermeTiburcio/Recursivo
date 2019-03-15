import java.math.BigInteger;

/**
 * 
 */

/**
 * @author Laboratorio101
 *
 */
public class Serie1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 100;
		System.out.println(somaRecursiva(valor));
		int valor2 = 5;
		System.out.println(serie2Recursiva(valor2));
		double valor3 = 3;
		System.out.println(serie3Recursiva(valor3));
		double valor4 = 4, aux = 1;
		System.out.println(serie4Recursiva(valor4, aux));
		long valor5 = 5;
		System.out.println(serie5Recursiva(valor5));
	}

	public static int somaRecursiva(int valor) {
		return valor == 1 ? 1 : valor + somaRecursiva(valor - 1);
	}

	public static int serie2Recursiva(int valor2) {
		return valor2 == 1 ? 1 : valor2 + serie2Recursiva(valor2 - 1);

	}

	public static double serie3Recursiva(double valor3) {
		return valor3 < 1 ? 0 : 1 / valor3 + serie3Recursiva(valor3 - 1);
	}

	public static double serie4Recursiva(double valor4, double aux) {
		return valor4 < 1 ? 0 : (valor4 / aux) + serie4Recursiva((valor4 - 1), (aux + 1));
	}

	public static long serie5Recursiva(long valor5) {
		return valor5 < 1 ? 0 : fatRecursivo(valor5) + serie5Recursiva(valor5 - 1);
	}
	
	public static long fatRecursivo(long fat) {
		return fat == 1 ? 1 : fat * fatRecursivo(fat - 1);
	}
}
