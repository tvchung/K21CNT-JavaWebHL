package com.k21cnt.tvc.lesson01.pkg_LambdaExpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBefore8Example {
    public static void main(String[] args) {
        List<String> languages
                = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        Collections.sort(languages, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String language : languages) {
            System.out.println(language);
        }

    }
}
