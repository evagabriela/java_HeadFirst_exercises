package SimpleDotCom;

/**
 * Created by evazamudio on 2014-04-10.
 */
public class SimpleDotComTestDrive {

    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};

        dot.setLocationsCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
