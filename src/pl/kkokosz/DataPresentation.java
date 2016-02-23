/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



 1. wzkoryzstac konstruktor mojej klasy tak, zeby nie tworzyc obiektu 
 bufferedreader przy kolejnych wywolaniach
 czyli przechowywac wartosc buffered reader w polu klasy
 */
package pl.kkokosz;

/**
 *
 * @author asia
 */
public class DataPresentation {

    public static void main(String[] args) {
        PobierzWartosc data = new PobierzWartosc();
        
        
        System.out.println("Dzień dobry. Podaj swoje imię:");
        String name = data.stringValue();

        System.out.println("Podaj swój wiek:");
        int age = data.intValue();

        System.out.println("Ile zarabiasz:");
        Double salary = data.doubleValue();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}
