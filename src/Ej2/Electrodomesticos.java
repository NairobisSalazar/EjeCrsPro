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
public class Electrodomesticos {
    //precio, color, consumo energético (letras entre A y F) y peso.
    protected Integer precio;
    protected String color;
    protected String CEnergetico;
    protected Integer peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Integer precio,String CEnergetico, String color, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.CEnergetico = CEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCEnergetico() {
        return CEnergetico;
    }

    public void setCEnergetico(String CEnergetico) {
        this.CEnergetico = CEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", CEnergetico=" + CEnergetico + ", peso=" + peso + '}';
    }

  // Método comprobarConsumoEnergetico(char letra): comprueba que la letra
  //es correcta, sino es correcta usara la letra F por defecto. Este método se debe
  //invocar al crear el objeto y no será visible.
    
    public void ComprobarConsumoEnergetico(){
        
        
        for (int i = 0; i < CEnergetico.length(); i++) {
            if (CEnergetico.equals("A") || CEnergetico.equals("B") || CEnergetico.equals("C") || CEnergetico.equals("D") || CEnergetico.equals("E") || CEnergetico.equals("F")){
            }else{
            CEnergetico= "F";
            }  
           
        }
         
        
    }
   /* Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.*/
    public void ComprobarColor(){
     
        for (int i = 0; i < color.length(); i++) {
            if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")){
            }else{
            color= "blanco";
            }  
           
        }
         
    }
  /* Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/
    public void CrearElectrodomesticos(){
    Scanner leer = new Scanner (System.in);
        System.out.println("---Ingrese los datos de su Electrodomestico---");
        System.out.println("-Ingrese el consumo A/B/C/D/E/F-");
        CEnergetico = leer.next();
        ComprobarConsumoEnergetico();
        System.out.println("-Ingrese el color-");
        color = leer.next();
        ComprobarColor();
        System.out.println("-Ingrese el peso-");
        peso= leer.nextInt();
        precio = 1000;
        System.out.println("va a tener un precio base de: $"+precio);
    }
    
    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:*/
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
        precio = preciofinal;
        System.out.println("El precio final es: $"+preciofinal);
     
       
   }
}
            
            
}            
            
                    
            
            
    
     
    
    
   
    
    
