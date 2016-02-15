/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementary;

import java.math.BigInteger;

/**
 *
 * @author lesniak
 */
public class WielkaLiczba {

    public static void main(String[] args) {
        BigInteger wielkaLiczba = new BigInteger("12312312312312312312");
        //same
        //BigInteger wielkaLiczba = BigInteger.valueOf(123123);
        //W tym przypadku trzeba jednak pamiętać, aby argument metody valueOf() nie przekroczył 
        //zakresu typu long, lub double w przypadku klasy BigDecimal. 
        System.out.println(wielkaLiczba.toString());

        //add(), subtract(), multiply(), divide().
        BigInteger a = new BigInteger("123123123123123123123123123123");
        BigInteger b = new BigInteger("987654321987654321987654321987");
        BigInteger suma = a.add(b);
        System.out.println("Suma " + suma.toString());

    }

}
