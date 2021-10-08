package com.abhinaygarg;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object oriented, high-level programming language with dynamic symantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in map");
        }else {
            languages.put("Java", "this course is about Java");
        }
//        System.out.println(languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));

        System.out.println("=============================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages.")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not replaced");
        }

        System.out.println(languages.replace("Scala", "this will not be added"));
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
