/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

/**
 *
 * @author daniel
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, c, i;
        int tamanho = 10;
        a = 1;
        b = 1;

        System.out.print("1, 1, ");
        for (i = 0; i < tamanho; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }
                
        
    }
    
}