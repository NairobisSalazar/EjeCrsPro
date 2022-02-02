/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Nairo
 */
public class EJ2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Electrodomesticos> electro = new ArrayList();
        int suma=0;
       Lavadora lavadora1 = new Lavadora();
       Televisor televisor1 = new Televisor();
       Lavadora lavadora2 = new Lavadora();
       Televisor televisor2 = new Televisor();
       
       lavadora1.CrearLavadora();
       lavadora1.ComprobarColor();
       lavadora1.ComprobarConsumoEnergetico();
       lavadora1.PrecioFinal();
       electro.add(lavadora1);
       
       televisor1.CrearTelevisor();
       televisor1.ComprobarColor();
       televisor1.ComprobarConsumoEnergetico();
       televisor1.PrecioFinal();
       electro.add(televisor1);
       
       lavadora2.CrearLavadora();
       lavadora2.ComprobarColor();
       lavadora2.ComprobarConsumoEnergetico();
       lavadora2.PrecioFinal();
       electro.add(lavadora2);
       
       televisor2.CrearTelevisor();
       televisor2.ComprobarColor();
       televisor2.ComprobarConsumoEnergetico();
       televisor2.PrecioFinal();
       electro.add(televisor2);
       
       
       
        for (Electrodomesticos electrodomesticos : electro) {
           System.out.println(electrodomesticos);
        }
        
      suma = (televisor1.getPrecio()+ televisor2.getPrecio()+lavadora1.getPrecio()+lavadora2.getPrecio());
      System.out.println("");
      System.out.println("LAVADORAS");
      System.out.println("Lava1 : $"+lavadora1.getPrecio());
      System.out.println("Lava2 : $"+lavadora2.getPrecio());
      System.out.println("LAVADORAS");
      System.out.println("Tv1 : $"+televisor1.getPrecio());
      System.out.println("Tv2 : $"+televisor2.getPrecio());
      System.out.println("");
      System.out.println("los electrodomesticos dan una suma de : $"+suma);  
       /*Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
       
    }
    
}
