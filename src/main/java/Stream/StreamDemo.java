package Stream;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args){
        List<Integer>numlist= List.of(80,10,60,20,30,1,79);

        Set<Integer> numset=Set.of(1,2,3,4,5,6,7,8);

        Map<Integer,String>mapdemo=Map.of(101,"subba",102,"ramana",103,"arikatla",104,"raju");

        List<Integer>numdemo=numlist.stream()
                .filter(num->num%2==0)
                .toList();
        numdemo.forEach(System.out::println);

        List<Integer>nummap=numlist.stream()
                .map(num->num*10)
                .toList();
        nummap.forEach(System.out::println);

        Integer maxValue =numlist.stream()
                .max((num1,num2)->num1-num2)
                .orElseThrow(()->new RuntimeException("Empty list"));
        System.out.println(maxValue);

        int minValue=numlist.stream()
                .map(Integer::intValue)
                .min((num1,num2)->num1-num2)
                .orElseThrow(()->new RuntimeException("Empty list"));
        System.out.println(minValue);

        int[] Arraydemo=new int[]{2,4,3,1,7,90,6};

        int value=Arrays.stream(Arraydemo)
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .getAsInt();
        System.out.println(value);

        double avgdemo=Arrays.stream(Arraydemo)
                .average()
                .orElseThrow(()->new RuntimeException("EMPTY ARRAY"));
        System.out.println(avgdemo);

        int reducedemo=Arrays.stream(Arraydemo)
                .reduce(0,(a,b)->a+b);
        System.out.println(reducedemo);


        double reducemul=Arrays.stream(Arraydemo)
                .reduce(1,(a,b)->a*b);
        System.out.println(reducemul);
        String str="subbareddy is coming where are you now";
        List<String>let=Arrays.stream(str.split(" ")).toList();
        System.out.println(let);
        List<String>demo=new ArrayList<>();
        List<String>stringdemo=List.of("subba","reddy","arikatla");
        String name=stringdemo.stream()
                .collect(Collectors.joining());
        System.out.println(name);
        Map<String, Long> valued = stringdemo.stream()
                .collect(Collectors
                        .groupingBy(word -> word,
                                Collectors.counting()));
        System.out.println(valued);
        Map<Integer,List<String>>demokkk=stringdemo.stream()
                .collect(Collectors
                        .groupingBy(String::length));
        System.out.println(demokkk);
    }
}
