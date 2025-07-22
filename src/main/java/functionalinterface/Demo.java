package functionalinterface;

import java.util.function.*;

public class Demo {
    public static void main(String[] args){
        Consumer<Integer> con=new Consumer<Integer>() {
            @Override
            public void accept(Integer a) {
                System.out.println(a);
            }
        };
        con.accept(10);
        Supplier<Integer>sup=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };
        sup.get();
        Predicate<Integer>ped=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0) {
                    return true;
                }
                return false;
            }
        };
        ped.test(10);
        Function<Integer,Integer> fun=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {

                return integer*integer;
            }
        };
        fun.apply(10);
        BiConsumer<Integer,Double>bic=new BiConsumer<Integer, Double>() {
            @Override
            public void accept(Integer integer, Double aDouble) {
                System.out.println(integer+aDouble);
            }
        };
        bic.accept(10,20.5);
        BiPredicate<Integer,Integer>bip=new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer a, Integer b) {
                int c=a+b;
                if(c%2==0) {
                    return true;
                }
                return false;
            }
        };
        bip.test(10,21);

        BiFunction<Integer,Integer,Integer> bif=new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        bif.apply(10,20);
    }
}
