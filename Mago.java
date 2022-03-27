package practica2;

import java.util.Random;

/**
 *
 * @author MauriRod
 */
public class Mago extends Personaje {

    public Mago() {

        super("Mago", 120, 40, 15, 0.7, " ataque magico de la muerte ");

    }

    public void aumentarSalud() {
        Random r = new Random();
        int a = r.nextInt(200);
        if (a < 50 && ((double) super.getSalud() / 0.75) < 0.50) {

            int salud = this.getDefensa();
            salud += 8;
            super.setSalud(salud);
            System.out.println("Cur interpretais");
            System.out.println("SECTUMSEMPRAAAAAAA");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Mago: MAGIC MAGIC WIN");
    }
}
