/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiveisportres;

/**
 *
 * @author daniel
 */
public class DivisiveisPorTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Efetuar a soma do 10º elemento com o 25º elemento de uma série de números divisíveis por 3;
        int [] vet = new int [100];
        int valor = 1;
        int i, divisiveis = 0;
        
        for (i = 1; i <= 76; i++){
            if (i % 3 == 0){
                vet[i] = valor;
            }
            valor = valor + 1;
        }
        
        for (i = 1; i <= 76; i++){
            //System.out.println(vet[i]);
            if (vet[i] != 0){
                divisiveis += 1;
            }
        }
        
        System.out.println("qtd: " + divisiveis);
        
        int [] divTres = new int [26]; 
        int j = 0;
        
        for (i = 1; i <= 76; i++){
            
            if (vet[i]!= 0){
                divTres[j] = vet[i];
                System.out.println("divisivel por 3: " + divTres[j] + " posição [" + j + "]");
                j++;
            }
        }
        
        int soma = divTres[9] + divTres[24];
        
        System.out.println("A soma do 10º elemento com o 25º foi: " + soma);
            
    }
    
}
