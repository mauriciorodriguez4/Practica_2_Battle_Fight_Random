package practica2;

import java.util.Random;

/**
 *
 * @author MauriRod
 */
public class Computadora extends Personaje{
    
   private int vidaTotal;
    
    public Computadora(){
        
        super("Computadora",200,25,10,0.9," cortocircuitare tu vida rival ");
        this.vidaTotal = super.getSalud();
    }
    
    public void aumentoDefensa(){
        Random r = new Random();
        int a = r.nextInt(200);
        
        if(a>150 &&((double)super.getSalud()/(double)this.vidaTotal)<=0.20)
        {
            int defensa = super.getDefensa();
            defensa +=5;
            super.setDefensa(defensa);
            System.out.println("LA BASE DE DATOS HA SIDO ACTUALIZADA");
            System.out.println("");
        }
        
    }
    
    @Override
    public void ganador(){
        System.out.println("Computadora: ES IMPOSIBLE QUE PUEDAN PENETRAR MI FIREWALL");
    }
}
