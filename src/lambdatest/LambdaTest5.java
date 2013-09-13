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
public class LambdaTest5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        strings.stream().map(s -> Integer.valueOf(s)).filter(new EvenPredicate()).forEach(System.out::println);

    }

}
