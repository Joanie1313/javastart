/*
 program pobierajacy od usera liczby calkowite i je sumowal na biezaco.
 program ma konczyc dzialanie jak user wcisnie enter
 musi prawidlowo parsowac liczby - czyli ze maja byc tylko inty
 w parsowaniu ma byc wykorzystana obsluga wyjatkow - try catch
 dwukropek po Wpisz
 jak wpisze enter to program ma go pozegnac
 czy jest wrazliwy na spacje i jesli jest to zeby nie byl
 sprawdzic czy ujemne liczby mozna wpisywac, a jesli nie to zrobic zeby bylo mozna
 zmienic a int na double
 */
package pl.kkokosz;

import java.io.*;

/**
 *
 * @author asia
 */
public class SumaWyjatki {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double suma = 0;
        boolean enter;
        boolean isNeg = false;
        do {
            System.out.print("Wpisz: ");
            String wpis = reader.readLine();
            String wpis2 = wpis.trim();
         

            enter = "".equals(wpis);
            if (!enter) {
                try {

                    //int wpisint = Integer.parseInt(wpis2);
                    double wpisint = Double.parseDouble(wpis2.replace(",", "."));

                    suma = suma + wpisint;
                    System.out.println(suma);

                } catch (NumberFormatException e) {
                    System.out.println(":(");
                }
            } else {
                System.out.println("papa");
            }
        } while (!enter);
    }
}
