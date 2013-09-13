/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lambdatest;

import java.util.function.Predicate;

/**
 *
 * @author juergen
 */
public class EvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return t.intValue() % 2 == 0;
    }

}
