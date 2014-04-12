package Inheritance.Example2;

/**
 * Created by evazamudio on 2014-04-11.
 */
public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();

        for (int x = 0; x < 3; x++){
            ma[x].frighten(x);
        }
    }
}

class Monster {
    
}

class Vampire extends Monster{

}

class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}