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
public class Colaborador {
    
    private double provento;
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){ //setter
        this.nome = nome;
    }
    
    public void setProvento (double provento){
        this.provento = provento;
    }
    
    public double getProvento() { //getter
        return provento;
    }
}
