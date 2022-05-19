package pl.recruitment.app;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MyApp {
    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        Arrays.stream(args)
                .collect(Collectors.joining())
                .chars()
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .sorted()
                .forEach(x -> map.put((char)x, map.getOrDefault((char)x, 0) + 1) );


        for(Character c : map.keySet())
            System.out.println(c + " = " + map.get(c));

    }

}

