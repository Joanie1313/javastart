/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementary;
import static java.lang.Math.*;

/**
 *
 * @author lesniak
 */
public class Funkcje {

    public static void main(String[] args) {
        double liczba = 9.0;
        int b = 3;
        double pierwiastek = Math.sqrt(liczba);
        //import static Math.* - czyli bez Math.
        //double pierwiastek = sqrt(liczba);
        double potega = Math.pow(liczba, b);

        System.out.println("Pierwiastek z " + liczba + " wynosi: " + pierwiastek);
        System.out.println("Liczba " + liczba + " podniesiona do potegi " + b + " to " + potega);
    }
}
