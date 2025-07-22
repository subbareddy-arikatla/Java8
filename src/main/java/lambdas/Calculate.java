package lambdas;

//here we are having one interface with Calculate and having one abstract method is calculation

public interface Calculate {
    void calculation(int a,int b);
}
//to implement the method the number of class files are increased for each operation
//to perform addition operation we need to create the add class
class add implements Calculate{
    @Override
    public void calculation(int a, int b) {
        System.out.println(a+b);
    }
}

////to perform substration operation we need to create the sub class
class sub implements Calculate
{
    @Override
    public void calculation(int a, int b) {
        System.out.println(a-b);
    }
}
//in java we can pass object and value has aguement here static method
// pass the object clacuate has argument we can pass object has an argument
class calcuate{
    public static void calcuate(Calculate calcuate){
        calcuate.calculation(10,30);
    }
}


class Main{
    public static void main(String[] args){
        calcuate.calcuate(new Calculate() {
//            to perform addition operation
            @Override
            public void calculation(int a, int b) {
                System.out.println(a+b);
            }
        });
//        to perform substraction operation
        calcuate.calcuate((int x,int y) -> System.out.println(x - y));
//        to perform multipliaction operation
        calcuate.calcuate((int x,int y)->System.out.println(x*y));
    }
}