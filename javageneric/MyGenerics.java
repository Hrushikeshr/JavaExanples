package javageneric;


class Gen<T> {
    T obj;
    Gen(T obj) {
        this.obj = obj;
    }
    public void show() {
        System.out.println("The type of Object is : " + obj.getClass().getName());
    }
    public T getObj() {
        return obj;
    }
}
public class MyGenerics {
    public static void main(String[] args) {
        Gen<String> gen1 = new Gen<>("Java");
        gen1.show();
        System.out.println(gen1.getObj());
        Gen<Integer> gen2 = new Gen<>(10);
        gen2.show();
        System.out.println(gen2.getObj());
    }
}
