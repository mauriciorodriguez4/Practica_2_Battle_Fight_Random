package practica2;

import java.util.Random;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        
        Computadora computadora = new Computadora();

        Caballero caballero = new Caballero();

        Mago mago = new Mago();

        Guerrero guerrero = new Guerrero();

        String pers = "", opon = "", batalla = "";

        int ronda = 0;

        Scanner sn = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("     BIENVENIDO A LAS BATALLAS DE PVP     ");
        System.out.println("---------------------------------------\n\n");

        System.out.println("Selecciona a tu aliado: ");
        System.out.println("\tA.Caballero");
        System.out.println("\tB.Guerrero");
        System.out.println("\tC.Mago");
        System.out.println("\tD.Computadora");

        pers = sn.next();

        System.out.println("\nSelecciona a tu contrincante: ");
        System.out.println("\tA.Caballero");
        System.out.println("\tB.Guerrero");
        System.out.println("\tC.Mago");
        System.out.println("\tD.Computadora");

        opon = sn.next();

        while (pers.contains(opon)) {
            System.out.println("\nNo puedes elegirte a vos mismo de oponente!!!!!");
            System.out.println("\nElije de nuevo a tu contrincante: ");
            System.out.println("\tA.Caballero");
            System.out.println("\tB.Guerrero");
            System.out.println("\tC.Mago");
            System.out.println("\tD.Computadora");

            opon = sn.next();
        }

        batalla = pers.trim() + opon.trim();

        switch (batalla) {

            case "AB": {
                while (caballero.Estado() && guerrero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(caballero.getTa())) {
                        guerrero.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    if (pelea(guerrero.getTa())) {
                        caballero.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    guerrero.aumentoDefensa();

                }
                if (caballero.Estado()) {
                    caballero.ganador();
                } else {
                    guerrero.ganador();
                }
                break;
            }

            case "AC": {
                while (caballero.Estado() && mago.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(caballero.getTa())) {
                        mago.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    if (pelea(mago.getTa())) {
                        caballero.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    mago.aumentarSalud();
                }
                if (caballero.Estado()) {
                    caballero.ganador();
                } else {
                    mago.ganador();
                }
                break;
            }
            case "AD": {
                while (caballero.Estado() && computadora.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(caballero.getTa())) {
                        computadora.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    if (pelea(computadora.getTa())) {
                        caballero.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    computadora.aumentoDefensa();

                }
                if (caballero.Estado()) {
                    caballero.ganador();
                } else {
                    computadora.ganador();
                }
                break;
            }
            case "BA": {
                while (guerrero.Estado() && caballero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(guerrero.getTa())) {
                        caballero.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    if (pelea(caballero.getTa())) {
                        guerrero.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    guerrero.aumentoDefensa();

                }
                if (guerrero.Estado()) {
                    guerrero.ganador();
                } else {
                    caballero.ganador();
                }
                break;
            }

            case "BC": {
                while (guerrero.Estado() && mago.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(guerrero.getTa())) {
                        mago.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    if (pelea(mago.getTa())) {
                        guerrero.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    guerrero.aumentoDefensa();
                    mago.aumentarSalud();
                }
                if (guerrero.Estado()) {
                    guerrero.ganador();
                } else {
                    mago.ganador();
                }
                break;
            }
            case "BD": {
                while (guerrero.Estado() && computadora.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(guerrero.getTa())) {
                        computadora.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    if (pelea(computadora.getTa())) {
                        guerrero.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    guerrero.aumentoDefensa();
                    computadora.aumentoDefensa();

                }
                if (guerrero.Estado()) {
                    guerrero.ganador();
                } else {
                    computadora.ganador();
                }
                break;
            }
            case "CA": {
                while (mago.Estado() && caballero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(mago.getTa())) {
                        caballero.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    if (pelea(caballero.getTa())) {
                        mago.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    mago.aumentarSalud();

                }
                if (mago.Estado()) {
                    mago.ganador();
                } else {
                    caballero.ganador();
                }
                break;
            }

            case "CB": {
                while (mago.Estado() && guerrero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(mago.getTa())) {
                        guerrero.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    if (pelea(guerrero.getTa())) {
                        mago.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    guerrero.aumentoDefensa();
                    mago.aumentarSalud();
                }
                if (mago.Estado()) {
                    mago.ganador();
                } else {
                    guerrero.ganador();
                }
                break;
            }
            case "CD": {
                while (mago.Estado() && computadora.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(mago.getTa())) {
                        computadora.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    if (pelea(computadora.getTa())) {
                        mago.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    mago.aumentarSalud();
                    computadora.aumentoDefensa();

                }
                if (mago.Estado()) {
                    mago.ganador();
                } else {
                    computadora.ganador();
                }
                break;
            }

            case "DA": {
                while (computadora.Estado() && caballero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(computadora.getTa())) {
                        caballero.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        caballero.Esquivar();
                    }
                    if (pelea(caballero.getTa())) {
                        computadora.Ataque(caballero.getAtaque(), caballero.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    computadora.aumentoDefensa();

                }
                if (computadora.Estado()) {
                    computadora.ganador();
                } else {
                    caballero.ganador();
                }
                break;
            }

            case "DB": {
                while (computadora.Estado() && guerrero.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(computadora.getTa())) {
                        guerrero.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        guerrero.Esquivar();
                    }
                    if (pelea(guerrero.getTa())) {
                        computadora.Ataque(guerrero.getAtaque(), guerrero.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    guerrero.aumentoDefensa();
                    computadora.aumentoDefensa();
                }
                if (computadora.Estado()) {
                    computadora.ganador();
                } else {
                    guerrero.ganador();
                }
                break;
            }
            case "DC": {
                while (computadora.Estado() && mago.Estado()) {

                    ronda++;
                    System.out.println("RONDA #" + ronda);

                    if (pelea(computadora.getTa())) {
                        mago.Ataque(computadora.getAtaque(), computadora.getTipoA());
                    } else {
                        mago.Esquivar();
                    }
                    if (pelea(mago.getTa())) {
                        computadora.Ataque(mago.getAtaque(), mago.getTipoA());
                    } else {
                        computadora.Esquivar();
                    }
                    mago.aumentarSalud();
                    computadora.aumentoDefensa();

                }
                if (computadora.Estado()) {
                    computadora.ganador();
                } else {
                    mago.ganador();
                }
                break;
            }
            default: {
                System.out.println("Ese peleador no esta disponible...");
                break;
            }

        }

    }

    public static boolean pelea(double _ta) {
        boolean flag = false;

        Random n = new Random();

        int a = n.nextInt(100);
        if (a < (int) (_ta * 100)) {
            flag = true;
        }
        return flag;
    }

}
