import java.util.Scanner;

public class teste {

    public static void main (String[] args) {

        System.out.println("Informe hora(s) e minuto(s) de início e fim da partida, respectivamente:");

        Scanner teclado = new Scanner(System.in);
        int hri, mini, hrt, mint, reshr, resmin;
        hri = teclado.nextInt();
        mini = teclado.nextInt();
        hrt = teclado.nextInt();
        mint = teclado.nextInt();
        reshr = 0;

        if ((hri<0) || (mini<0) || (hrt<0) || (mint<0)) {
            System.out.println("-");
        }else{

            if ((hri==hrt) && (mini==mint)) {
                System.out.println("24:00");

            }else{
                if ((hri>hrt) && (mini==mint)) {
                    reshr = (24-hri)+hrt;
                    System.out.println(reshr+":00");

                }else{
                    if ((hri>hrt) && (mini<mint)) {
                        reshr = (24-hri)+hrt;
                        resmin = (mint-mini);
                        System.out.println(reshr+":"+resmin);

                    }else{
                        if ((hri>hrt) && (mini>mint)) {
                            reshr = (23-hri)+hrt;
                            resmin = (60-mini)+mint;
                            System.out.println(reshr+":"+resmin);

                        }else{
                            if ((hri<hrt) && (mini==mint)) {
                                reshr = (hrt-hri);
                                System.out.println(reshr+":00");

                            }else{
                                if ((hri<hrt) && (mini>mint)) {
                                    reshr = (hrt-hri)-1;
                                    resmin = (60-mini)+mint;
                                    System.out.println(reshr+":"+resmin);

                                }else{
                                    if ((hri<hrt) && (mini<mint)) {
                                        reshr = hrt-hri;
                                        resmin = mint-mini;
                                        System.out.println(reshr+":"+resmin);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}