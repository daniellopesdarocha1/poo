/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomotorcycle;

/**
 *
 * @author Daniel
 */
public class ProjetoMotorcycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motorcycle m = new Motorcycle ();
		
		m.maker = "Yamaha RZ350";
		m.color = "Red";
		System.out.println ("Calling showAtts...");
		m.showAtts();
		System.out.println ("--------");
		System.out.println ("Starting engine...");
		
		System.out.println ("--------");
		System.out.println ("Calling showAtts...");
		m.showAtts ();
		System.out.println ("--------");
		System.out.println ("Starting engine...");
		m.startEngine();
    }
    
}
