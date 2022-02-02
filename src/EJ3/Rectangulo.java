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
public class Rectangulo implements Calculo{
    
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    
    public void CalcularElArea() {
       Scanner leer = new Scanner (System.in);
        
       
        double area;
        System.out.println("Ingrese la base de su rectangulo ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura de su rectangulo ");
        this.altura = leer.nextInt();
        area = (base*altura);
        System.out.println("-Area- "+area);  
    }

    
    public void CalcularElPerimetro() {
       double perimetro;
        perimetro = ((base+altura)*2);
        System.out.println("-perimetro- "+perimetro);
    }
    //base * altura / Perímetro rectángulo: (base + altura) * 2
}
