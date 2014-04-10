package SimpleDotCom;

/**
 * Created by evazamudio on 2014-04-10.
 */
public class SimpleDotCom {
    int[] locationsCells;
    int numOfHits = 0;

    public void setLocationsCells(int[] locs){
        locationsCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationsCells){
            if (guess == cell){
                result = "hi";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationsCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
