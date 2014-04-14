package Constructors;

/**
 * Created by evazamudio on 2014-04-14.
 */
public class Boo {
    public Boo(int i){}
    public Boo(String s){}
    public Boo(String s, int i){}
}

class SonOfBoo extends Boo {
    public SonOfBoo(){
        super("boo");
    }


}
