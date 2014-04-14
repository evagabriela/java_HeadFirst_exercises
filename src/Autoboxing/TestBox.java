package Autoboxing;

/**
 * Created by evazamudio on 2014-04-14.
 */
public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
