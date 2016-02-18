/*
 pobiera 3 teksty od user i zapisuje je do mapy, ktorej klucze to Integer
 - HashMap<Integer, String> - <typ klucza, typ wartosci>
 - put zamiast add - najpierw podajesz klucz, a pozniej wartosc
 - ale jesli jest juz taki klucz to zostaje zastapiony


napisac klase z jedna metoda typu pobierzwartosc i to ona bedzie tworzyla 
bufferdreader
zrobi readline i obsluzy ioexception
dodatkowo: dodac metody ktore beda pobieraly stringa i integera, double
metoda pobierz - moze byc wzbogacoan o wypisanie "podaj wartosc"
i zobaczyc przeciazanie metod
 */
package pl.kkokosz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author asia
 */
public class HashMapka {

    public static void main(String[] args)throws IOException  {
        HashMap<Integer, String> hashmapka = new HashMap<Integer, String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("Wpisz coś");
            try {
                String wpis = reader.readLine();
                hashmapka.put(new Integer(i), wpis);
            } catch (IOException e) {
                System.out.println(":(");
            }
        }
        

        Set entries = hashmapka.entrySet();
        System.out.println("Pary: " + entries);
 
        
        for (Integer klucz: hashmapka.keySet()) {
            System.out.println(klucz+" --- "+hashmapka.get(klucz));
        }
        
        System.out.println("Podaj element, który ma zostać usunięty");
         String usun = reader.readLine();
         Integer usunint = Integer.parseInt(usun);
         hashmapka.remove(usunint);
         
         for (Integer klucz: hashmapka.keySet()) {
            System.out.println(klucz+" --- "+hashmapka.get(klucz));
        }
    }

}
