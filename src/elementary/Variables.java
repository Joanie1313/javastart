/*
 1.2. Napisz program, w którym zadeklarujesz kilka stałych, 
 lub zmiennych różnych typów o dowolnych nazwach, a następnie 
 wyświetlisz je w kolejnych liniach tekstu. Skompiluj, lub spróbuj 
 skompilować przykłady podane w tej lekcji i zobacz co się stanie 
 przy próbie nadania po raz drugi wartości jakiejś stałej.

 W tym samym programie zadeklaruj cztery zmienne typu String. 
 Trzy z nich zainicjuj jakimiś wyrazami a czwartemu przypisz ciąg 
 znaków utworzony z trzech wcześniejszych zmiennych. 
 Następnie wyświetl czwartą zmienną na ekranie.

 Przy użyciu metody substring wyświetl na ekranie dwa pierwsze 
 wyrazy wykorzystując wyłącznie czwartą zmienną typu String.
 */
package elementary;

/**
 *
 * @author lesniak
 */
public class Variables {

    public static void main(String[] args) {
        String a = "Wielkie A";
        int i = 1;
        final String b = "stała";
        String c1 = "c1";
        String c2 = "c2";
        String c3 = "c3";
        String c4 = "c4";
        String c5;
        c5 = c1+c2+c3+c4;
        System.out.print(a +"\n"+ i +"\n"+b +"\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n");
        
        System.out.println(c5);
        String c6 = c5.substring(0, 3);
        System.out.println(c6);

    }

}
