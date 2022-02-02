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
public class HerenciaEJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("chiquito", "Luqui", "Croquetas para perro", 5,"chihuahua");
        perro.Alimento();
        Animal perro1 = new Perro("grande", "Laika", "Croquetas para perro", 4,"pitbull");
        perro1.Alimento();
        Animal gato = new Gato("chiquito", "Lila", "Pescado", 3, "Siames");
        gato.Alimento();
        Animal caballo = new Caballo("grande", "Tito", "Pasto", 10, "Caballo");
        caballo.Alimento();
    }
    
}
