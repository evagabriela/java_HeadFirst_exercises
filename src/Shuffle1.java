/**
 * Created by evazamudio on 2014-04-08.
 */
public class Shuffle1 {
    public static void main(String[] args){
        int x = 3;

        while (x > 0){
            if (x > 2){
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2){
                System.out.print("b c");
            } else{
                System.out.print("d");
                x = x-1;
            }

        }
    }
}
