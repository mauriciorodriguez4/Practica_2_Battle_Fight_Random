package practica2;

import java.util.Random;

/**
 *
 * @author MauriRod
 */
public class Guerrero extends Personaje {

    public Guerrero() {

        super("Guerrero", 200, 35, 25, 0.6, " combo de golpes de furia mortal ");

    }

    public void aumentoDefensa() {

        Random r = new Random();
        int a = r.nextInt(200);
        if (a > 100 && a > 135) {
            int defensa = this.getDefensa();
            defensa += 1;
            this.setDefensa(defensa);
            double ta = this.getTa();
            ta = 0.20;
            this.setTa(ta);
            System.out.println("Mis escudos mejoraron... no me das miedo");

        }

    }

    @Override
    public void ganador() {
        System.out.println("Guerrero: CON HONOR SIEMPRE HASTA EL FINAL");
    }

}
