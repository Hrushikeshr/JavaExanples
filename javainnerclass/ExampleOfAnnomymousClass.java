package javainnerclass;

public class ExampleOfAnnomymousClass {

    public static void main(String[] args) {
        PopCorn p = new PopCorn() {
            public void taste() {
                methodOne();
                System.out.println("Pop Corn is Salty");
            }

            public void methodOne() {
                System.out.println("Child specific method");
            }
        };
// p.methodOne(); // C.E
        p.taste(); // Pop Corn is Spicy
        PopCorn p1 = new PopCorn();
        p1.taste(); // Pop Corn is Salty
    }
}
