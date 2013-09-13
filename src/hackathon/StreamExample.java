/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author juergen
 */
public class StreamExample {

    static final String INTO_WORDS = "[- @/.,:;_'\"?!()]+";

    public static void main(String[] args) throws Exception {

        Path path = Paths.get("readme.txt");
//        Files.lines(path, StandardCharsets.UTF_8).
//                flatMap(line -> Arrays.stream(line.split(INTO_WORDS))).
//                filter(word -> word.length() > 14).
//                map(word -> word.length() + " " + word).
//                sorted().
//                forEach(System.out::println);
        
        
//        Files.lines(path, StandardCharsets.UTF_8).
//                flatMap(line -> Arrays.stream(line.split(INTO_WORDS))).
//                filter(word -> word.length() > 10).
//                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
//                forEach(System.out::println);

//        Collector<String, ?, Set<String>> c = Collectors.toSet();
//        Set<String> words = Files.lines(path, StandardCharsets.UTF_8).
//                flatMap(line -> Arrays.stream(line.split(INTO_WORDS))).
//                filter(word -> word.length() > 14).
//                collect(c);
//        System.out.println(words);
    
        Files.lines(path, StandardCharsets.UTF_8).
                flatMap(line -> Arrays.stream(line.split(INTO_WORDS))).
                filter(word -> word.length() > 14).
                collect(Collectors.toSet()).
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }
}
