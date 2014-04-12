package Inheritance;

/**
 * Created by evazamudio on 2014-04-11.
 */
public class A {
    int ivar = 7;
    void m1(){
        System.out.print("Inheritance.A's m1, ");
    }

    void m2() {
        System.out.print("Inheritance.A's m2, ");
    }

    void m3() {
        System.out.print("Inheritance.A's m3, ");
    }
}

class B extends A{
    void m1() {
        System.out.print("Inheritance.B's m1, ");
    }
}

class C extends B {
    void m3(){
        System.out.print("Inheritance.C's m3, "+(ivar + 6));
    }
}


