package net.javaguides;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
        String letter="subba reddy arikatla";
        String reversed= Arrays.stream(letter.split(""))
                .map(word->new StringBuffer().reverse())
                .map(StringBuffer::toString)
                .collect(Collectors.joining());
        System.out.print(reversed);

    }
}