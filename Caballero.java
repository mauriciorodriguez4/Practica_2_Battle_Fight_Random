package practica2;

import java.util.Random;

/**
 *
 * @author MauriRod
 */
public class Caballero extends Personaje {

   public Caballero(){
        
        super("Caballero",150,30,20,0.8,"un corte con espada");
        
    }
    
    public void aumentoAtaque(){
        
        Random r = new Random();
        int a = r.nextInt(200);
        
       
        if (a>100&&a<150&&this.getSalud()<=50){
            
            int ataque = this.getAtaque();
            ataque+=3;
            this.setAtaque(ataque);
            System.out.println("Creiste que me derrotaste");
            System.out.println("TENGO UNA FUERZA INIMAGINABLE AHORA");
            System.out.println("");
        }
    }

    /*public void bajarDefensa() {
        Random r = new Random();
        int a = r.nextInt(200);

        if (a > 100 && this.getSalud() > 100) {
            int defensa = this.getDefensa();
            defensa -= 3;
            this.setDefensa(defensa);
            System.out.println("Desgraciados! Me habeis danado el escudo");
            System.out.println("Pagaran carooooooooooooooooooooo!");
        }
    }*/

    @Override
    public void ganador() {
        System.out.println("Caballero: JIJIJA GANÉ");
    }

}
