/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class TestaNumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //enunciado: Listar os 5 primeiros números primos;
        
        int numPrimo;
        int numDivisores = 0;
        int i;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        numPrimo = teclado.nextInt();
        
        //System.out.println("O número digitado foi: " + numPrimo);
        
        //o i começa com 1, pois não é possivel dividir por zero!!!
        for (i = 1; i <= numPrimo; i++){
            
            if (numPrimo % i == 0){
                numDivisores++;
            }
            
        }
        
        if (numDivisores == 2){
            System.out.println("é um número primo!");
        } else {
            System.out.println("Não é num número primo!");
        }        
        
        
    }
    
}