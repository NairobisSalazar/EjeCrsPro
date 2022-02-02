/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej;

/**
 *
 * @author Nairo
 */
public class Gato extends Animal{
    
     private String tamaño;
     private Integer Fnaci;

    public Gato() {
    }

    public Gato(String tamaño) {
        this.tamaño = tamaño;
        
    }

    public Gato(String tamaño, String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.tamaño = tamaño;
       
    }

     
     @Override
    public void Alimento(){
    System.out.println("El animal "+nombre+ " se alimenta de: "+alimento);
    } 
    
}
