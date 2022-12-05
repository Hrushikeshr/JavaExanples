package javainnerclass;
// Accesing Inner class code from the static block of outer class
public class MyOuterClass {
    class MyInneClass{
        private void m1(){
            System.out.println("This ia a Inner class Method...");
        }
    }

    public void outer() {
        MyInneClass ino = new MyInneClass();
        ino.m1();
    }

    public static void main(String[] args) {
        MyOuterClass outerClass = new MyOuterClass();
        // 1st way to access the inner class method
        MyOuterClass.MyInneClass in = outerClass.new MyInneClass();
        in.m1();
        //2nd way to access the inner class method.
        MyOuterClass.MyInneClass inn =new MyOuterClass().new MyInneClass();
        inn.m1();

        //3rd way to access the inner class method.
        outerClass.outer();


    }
}
//The applicable Modifier for the outer class are
/* 1. default
* 2. public
* 3. final
* 4. abstract
* 5. strictfp
*  */