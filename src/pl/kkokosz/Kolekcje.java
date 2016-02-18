/*
zapoznanie się z kolekcjami - mają zastępować tablice
nie trzeba deklarowac wielkości - mozna dodawac sobie w kazdej chwili nowe
są trzy rodzaje: 
-lista ArrayList(kolejne elementy - mogą się powtarzać - dostęp poprzez kolejny numer;
-zbiory HashSet (zbiór elementów różnych - nie ma kolejności, ale jest sprawdzana 
unikalność, są szybsze niż listy);
-mapy (tablica asocjacyjna; kojarzy dwa elementy: klucz + wartość, podając klucz 
można wydobyć wartość; klucze są zbiorem czyli są unikalne, a wartości są 
dowolne, jeden klucz może byc nullem i wartości też mogą nullami);

typy generyczne: przy definiowaniu kolejkcji mozna okreslic jakiego typu obiekty
mogą wejść do kolekcji  
program: 
wczytuje trzy wartosci od usera i umieszcza je na liście i w zbiorze
i dalej ma wypisac zawartosc listy, a poxniej wypisuje zbior
sprawdzic - przetestowac dzialanie wpisujac rozne ciagi, w tym np. powtarzjace sie


po wypisaniu user ma podac jeden element - taki, ktory juz wprowadzil wczesniej i ten ma byc usuniety

 */
package pl.kkokosz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author asia
 */
public class Kolekcje {
     public static void main(String[] args)throws IOException    {
         ArrayList<String> lista = new ArrayList<String>();
         
         HashSet<String> zbior = new HashSet<String>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
         for (int i=0; i<3; i++) {
         System.out.println("Wpisz coś");
         String wpis = reader.readLine();
         lista.add(wpis);
         zbior.add(wpis);
         }
         System.out.println("LISTA");
         for (String element : lista) {
             System.out.println(lista);
         }
         System.out.println("ZBIOR");
         for (String element : zbior) {
             System.out.println(zbior);
         }
         
         System.out.println("Podaj element, który ma zostać usunięty");
         String usun = reader.readLine();
         lista.remove(usun);
         zbior.remove(usun);
         System.out.println("LISTA");
         for (String element : lista) {
             System.out.println(element);
         }
         System.out.println("ZBIOR");
         for (String element : zbior) {
             System.out.println(element);
         }
         
         
     }
    
}
