/*
 1. Napisać program, który wczyta imię użytkownika i wyświetli je na ekranie (typowy helloworld)
 2. Zmodyfikować powyższy program, aby wyświetlił imię 10 razy
 3. Zmodyfikować powyższy program, aby wyświetlił imię n razy, n - podane przez użytkownika
 4. Niech imię wyświetla się n razy, ale n niech będzie przekazane w parametrach uruchomieniowych
 5. Napisać program, który wczyta dwa ciągi znaków i wyświetli je na ekranie, rozdzielając frazą " i "
 6. Napisać program, który wczyta dwa ciągi, połączy je w jeden i wypisze na ekranie, ale wspak
 7. Napisać program, który wczyta dwa ciągi, połączy je i wyświetli co drugi znak
 */
package pl.kkokosz;

import java.io.*;

/**
 *
 * @author asia
 */
public class HelloWorld {

    public static void main(String[] args) throws IOException {

        String imie;
        String nazwisko;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Napisz imię");
        imie = reader.readLine();
    //System.out.println ("Napisz nazwisko");
        //nazwisko = reader.readLine();
        //System.out.println(imie + nazwisko);
    /*
         int i =0;
         while (i<10) {
         System.out.println(imie);
         i++;
         }
    
         for (int j=0;j<10;j++) {
         System.out.println(imie);
         }
         */
        //System.out.println("Napisz liczbę");
        //String liczba = reader.readLine();
        String liczba = args[0];
        int n = Integer.parseInt(liczba);

        for (int j = 0; j < n; j++) {
            System.out.println(imie);
        }
        
        
    }
}
