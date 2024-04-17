package retosdeprogramacion;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */
public class BalancedExpressions {

	public static void main(String[] args) {
		printNonCommon("El que no arriesga", "De todos los vicios");
		printNonCommon("Más vale prevenir ", "ue curar");
		printNonCommon("A quien madruga", "Dios le ayuda.");
		System.out.println("-----------------");
		printNonCommonWithLoop("La vida es un viaje", "disfrútalo al máximo");

	}

	private static void printNonCommon(String str1, String str2) {
		System.out.println("out1: " + findNonCommon(str1, str2));
		System.out.println("out2: " + findNonCommon(str2, str1));
	}

	private static String findNonCommon(String str1, String str2) {
		StringBuilder out = new StringBuilder();

		for (char c : str1.toLowerCase().toCharArray()) {
			if (str2.toLowerCase().indexOf(c) == -1) {
				out.append(c);
			}
		}
		return out.toString();

	}
	
	private static void printNonCommonWithLoop(String str1, String str2) {
		System.out.println("out1: " + getNonCommonCharacters(str1, str2));
		System.out.println("out2: " + getNonCommonCharacters(str2, str1));
	}
	
	private static String getNonCommonCharacters(String str1, String str2) {
		StringBuilder out = new StringBuilder();
		
		for (char c : str1.toLowerCase().toCharArray()){
			if (!str2.toLowerCase().contains(String.valueOf(c))) {
				out.append(c);
			}
		}
		return out.toString();
	}

}
