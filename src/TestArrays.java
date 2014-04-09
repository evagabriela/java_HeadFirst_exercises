/**
 * Created by evazamudio on 2014-04-09.
 */
public class TestArrays {
    public static void main(String[] args){

//      constructing an array of string "island" with 4 elements on it
        String [] islands = new String[4];
//      Assign the specific strings to each of the elements of the array island
        islands[0]= "Bermuda";
        islands[1]="Fiji";
        islands[2]="Azores";
        islands[3]="Cozume1";

//      constructing an array of integers "index" with 4 elements on it
        int[] index = new int[4];
//      Assign the specific integers to each of the elements of the array index
        index[0]= 1;
        index[1]= 3;
        index[2]= 0;
        index[3]= 2;


        int y = 0;

        int ref;
        while (y < 4){
            ref = index[y];
            System.out.print("island = ");

            System.out.println(islands[ref]);

            y = y + 1;
        }
    }
}
