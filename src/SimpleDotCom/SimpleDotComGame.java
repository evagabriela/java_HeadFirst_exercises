package SimpleDotCom;

/**
 * Created by evazamudio on 2014-04-10.
 */
public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationsCells(locations);

        boolean isAlive = true;

        while (isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took "+ numOfGuesses + " guesses");
            }
        }

    }
}
