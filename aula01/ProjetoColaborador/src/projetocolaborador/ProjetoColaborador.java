/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocolaborador;

/**
 *
 * @author Daniel
 */
public class ProjetoColaborador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Colaborador colab = new Colaborador();
        colab.setNome ("Manoel Santos");
        colab.setProvento (5700);
        System.out.println(colab.getNome());
        System.out.println(colab.getProvento());
    }
    
}
