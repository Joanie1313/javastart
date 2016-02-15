/*
 5. Napisać program, który wczyta dwa ciągi znaków i wyświetli je na ekranie, rozdzielając frazą " i "
 6. Napisać program, który wczyta dwa ciągi, połączy je w jeden i wypisze na ekranie, ale wspak
 7. Napisać program, który wczyta dwa ciągi, połączy je i wyświetli co drugi znak
 */
package pl.kkokosz;
import java.io.IOException;
import java.io.*;

public class HelloWorld2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Napisz ciąg tekstowy 1");
        String ciag1 = reader.readLine();
        System.out.println("Napisz ciąg tekstowy 2");
        String ciag2 = reader.readLine();
        
        String razem = ciag1 + ciag2;
        int ile = razem.length();
        
        
        //for (int i=1;i<=ile ;i++) {
        //System.out.println (razem.charAt(ile-i));
        //}
        for (int i=0;i<ile ;i=i+2) {
            
        System.out.print(razem.charAt(ile-1-i));
        //i++; //tak się nie robi
        }
        
    }

}
