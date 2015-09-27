public class NumerosPerfeitos {

	public static void main(String[] args) {
		
		//6, 28, 496, 8128
		
		int num = 8128;
		int i;
		int soma = 0;
				
		int[] vet = new int[num];
		
		//para jogar as posições dentro do vetor 
		for (i = num-1; i > 0; i--){
			if (num % i == 0){
				vet[i] = i;
				soma += vet[i];
			}
			
		}
		
		if (soma != num){
			System.out.println(num + " Não é numero perfeito.");
		}else{
			System.out.println("Divisores de " + num);
			for (i = 0; i < vet.length; i++){
				if (vet[i] != 0){
					System.out.println(vet[i]);
				}
			}
		}
		
		
	}				
}