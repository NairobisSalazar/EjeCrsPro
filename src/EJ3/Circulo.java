/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.Scanner;

/**
 *
 * @author Nairo
 */
public class Circulo implements Calculo{
    
    private Integer radio;
    private Integer diametro;
    public Circulo() {
    }

   
    public void CalcularElArea() {
        Scanner leer = new Scanner (System.in);
        int radio;
       
        double area;
        System.out.println("Ingrese el radio de su circulo ");
        radio = leer.nextInt();
        area = (3.14)*(radio*radio);
        System.out.println("-Area- "+area);
        //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    }

   
    public void CalcularElPerimetro() {
        Scanner leer = new Scanner (System.in);
        int diametro;
        double perimetro;
        System.out.println("Ingrese el diametro");
        diametro = leer.nextInt();
        perimetro = (3.14*diametro);
        System.out.println("-Perimetro- "+perimetro);
    }

   
    
    
}
