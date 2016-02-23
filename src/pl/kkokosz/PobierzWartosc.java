/*
 napisac klase z jedna metoda typu pobierzwartosc i to ona bedzie tworzyla 
 bufferdreader
 zrobi readline i obsluzy ioexception
 dodatkowo: dodac metody ktore beda pobieraly stringa i integera, double
 metoda pobierz - moze byc wzbogacoan o wypisanie "podaj wartosc"
 i zobaczyc przeciazanie metod
 */
package pl.kkokosz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author asia
 */
public class PobierzWartosc {

    String tekst = ""; //globalna - widoczna w ramach pakietu

    public String stringValue() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String wpis = reader.readLine();
            tekst = wpis;
            return wpis.trim();
        } catch (IOException e) {
            System.out.println(":(");
        }
        return ""; //jak tu doszedł to znaczy, ze wpadł do catcha - tylko w tym przypadku - nie zwrocil nic ten trim
    }

    public Integer intValue() { //wersja z INteger
        // public int intValue() {          //wersja z int i domyślną wartością 0
        boolean enter;
        //String text = stringValue(); 
        enter = "".equals(tekst);
        if (!enter) {
            try {
                return Integer.parseInt(tekst);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e);
            }
        } else {
            System.out.println("papa");
        }
        return null; //mogę tak zrobić, bo mam Integer klasę
        //return 0; //jesli zostawie int i chcę zwracać domyślną wartość 
    }

    public double doubleValue() {
        boolean enter;
        //String text = stringValue();
        enter = "".equals(tekst);
        if (!enter) {
            try {
                return Double.parseDouble(tekst.replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e);
            }
        } else {
            System.out.println("papa");
        }
        return 0;
    }

}
