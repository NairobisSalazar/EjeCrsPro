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
public class Lavadora extends Electrodomesticos{
    
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Integer precio, String CEnergetico, String color, Integer peso) {
        super(precio, CEnergetico, color, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
   /* Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.*/
    
    public void CrearLavadora(){
        System.out.println("LAVADORA");
      CrearElectrodomesticos();
      Scanner leer = new Scanner (System.in);
      System.out.println("-Ingrese los kg de carga-");
      carga = leer.nextInt();
    }
    
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.*/
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
        
            if (carga >30 ){
               preciofinal = (preciofinal+500);
            }
            precio = preciofinal;
        System.out.println("El precio final es: $"+preciofinal);
     
       
   }
}
        
              
              
   
    
}
