package javageneric;

class Gen1<T extends Number> {
    T obj;
    Gen1(T obj) {
        this.obj = obj;
    }
    void show() {
        System.out.println("The int value is :" + obj.intValue());
    }
}

public class MyNewGeneric {

    public static void main(String arg[]) {
        Gen<Integer> t1 = new Gen<Integer>(10);
        t1.show();
        Gen<Double> t2 = new Gen<Double>(10.5);
        t2.show();
       // Gen<String> t3 = new Gen<String>("Java"); // C.E
        //t3.show();
    }
}
