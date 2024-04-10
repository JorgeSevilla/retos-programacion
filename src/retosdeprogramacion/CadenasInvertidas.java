/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

package retosdeprogramacion;

public class CadenasInvertidas {

	public static void main(String[] args) {
		StringBuilder message = new StringBuilder("Hola Mundo");
		String revertMessage = message.reverse().toString();
		
		System.out.println(revertMessage);
		System.out.println(reverse("Hola Mundo Dos"));
		System.out.println(reverseWithoutCharacter("Hola Mundo tres"));

	}
	
	private static String reverse(String text) {
		StringBuilder reversedText = new StringBuilder();
		for(int i = text.length() -1; i >= 0; i--) {
			reversedText.append(text.charAt(i));
		}
		
		return reversedText.toString();
	}
	
	private static String reverseWithoutCharacter(String text) {
		String reversedText = "";
		for(int i = text.length() -1; i >= 0; i--) {
			reversedText += text.charAt(i);
		}
		
		return reversedText;
		
	}

}
