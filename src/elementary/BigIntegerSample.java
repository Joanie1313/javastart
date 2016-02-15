/*
 1.5 Napisz program analogiczny do 1.4 wykorzystując klasę BigInteger. 
 Utwórz dwie liczby wykraczające poza zakres long, wypróbuj funkcje dodawania, 
 odejmowania i mnożenia, a także podniesienie do potęgi(zobacz w API jaki typ 
 parametru przyjmuje ta funkcja) i wartość bezwzględną. Wszystkie wyniki 
 zaprezentuj w konsoli.
*test
 */
package elementary;
import java.math.BigInteger;

public class BigIntegerSample {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("123123123123123123123123123123");
        BigInteger b = new BigInteger("987654321987654321987654321987");
        
        a=a.add(b);
        System.out.println(a);
        a=a.subtract(b);
        System.out.println(a);
        a=a.multiply(b);
        System.out.println(a);
        b=b.pow(2);
        System.out.println(b);
        b=b.abs();
        System.out.println(b);
    }

}
