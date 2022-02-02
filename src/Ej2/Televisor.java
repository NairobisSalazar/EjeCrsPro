/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author Nairo
 */
public class Televisor extends Electrodomesticos {
     private Boolean TDT;
     private Integer pulgadas;

    public Televisor() {
    }

    public Televisor(Boolean TDT, Integer pulgadas) {
        this.TDT = TDT;
        this.pulgadas = pulgadas;
    }

    public Televisor(Boolean TDT, Integer pulgadas, Integer precio, String CEnergetico, String color, Integer peso) {
        super(precio, CEnergetico, color, peso);
        this.TDT = TDT;
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }
     
   public void CrearTelevisor(){
       System.out.println("TELEVISOR");
   CrearElectrodomesticos();
   String resp;
    Scanner leer = new Scanner (System.in);
    System.out.println("-Ingrese las pulgadas de su televisor-");
        pulgadas = leer.nextInt();
    System.out.println("-Sintonizador SI/NO-");
        resp = leer.next();
        if (resp.equals("SI")){
          TDT= true;
        }else{
         TDT= false;
        }
        
   }  
   @Override
   public void PrecioFinal(){
   int aux=0;
   int preciofinal=0;
     for(int i = 0; i < CEnergetico.length(); i++){      
       if (CEnergetico.equals("A")){
          precio= precio+aux;
        }
          aux=200;
        if (CEnergetico.equals("B")){
          precio = precio-aux;
        }
          aux=400;
        if (CEnergetico.equals("C")){
           precio = precio-aux;
        }
          aux=500;
        if (CEnergetico.equals("D")){
           precio = precio-aux;
        }
          aux=700;
        if (CEnergetico.equals("E")){
           precio = precio-aux;
        }
          aux=900;
        if (CEnergetico.equals("F")){
           precio = precio-aux;
        }
        
        for(int j = 0; i < peso.longValue(); i++){      
          if((peso >=1) && (peso <=19)){
           preciofinal =( precio+100);
          }
          if((peso >=20) && (peso <=49)){
           preciofinal =( precio+500);
          }
          if((peso >=50) && (peso <=79)){
           preciofinal =( precio+800);
          }
          if((peso >80)){
           preciofinal =( precio+1000);
          }
        } 
        
        if (pulgadas > 40 ){
         preciofinal = preciofinal+((preciofinal*30)/100);
        }
        if (TDT == true ){
        preciofinal = preciofinal+500;
        }
        
        precio=preciofinal;
        System.out.println("El precio final es: $"+preciofinal);
     
       
   }
   
   } 
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.*/
}
