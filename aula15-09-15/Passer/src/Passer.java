
public class Passer {


	void toUpperCase(String[] text){
		for (int i = 0; i < text.length; i++){
			text[i] = text[i].toUpperCase();
		}
	}
	
	public static void main(String[] args) {
		
		/*para este programa funcionar
		digitar Run-run Configuration-arguments (no Eclipse);
		executar-configurar-personalizar-argumentos (no netbeans)
		*/
		
		Passer passer = new Passer();
		passer.toUpperCase (args);
		
		for (int i=0; i < args.length; i++){
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}
}
