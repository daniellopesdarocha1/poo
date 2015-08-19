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
public class Motorcycle {
    String maker;
    String color;
    boolean engineState;

    void startEngine()	{
            if (engineState == true)
                    System.out.println("The engine is already on.");
            else {
                    engineState = true;
                    System.out.println("The engine is now on.");
            }
    }

    void showAtts () {
            System.out.println ("This motor cycle is a " + color + " " + maker);
            if (engineState == true)
                    System.out.println ("The engine is on.");
            else System.out.println ("The engine is off.");
    }
}
