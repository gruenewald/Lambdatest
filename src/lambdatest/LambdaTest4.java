/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juergen
 */
public class LambdaTest4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        ints.stream().filter(new EvenPredicate()).forEach(System.out::println);
        //ints.parallelStream().filter(new EvenPredicate().negate()).forEach(System.out::println);

    }

}
