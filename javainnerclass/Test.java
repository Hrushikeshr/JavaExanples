package javainnerclass;

class PopCorn {
    public void taste() {
        System.out.println("Pop Corn is Spicy");
    }
}
public class Test {
    public static void main(String[] args) {
        PopCorn p = new PopCorn() {
            public void taste() {
                System.out.println("Pop Corn is Salty");
            }
        };
        p.taste();
        PopCorn p1 = new PopCorn();
        p1.taste();
    }
}


