package SimpleDotCom;
import java.io.*;
/**
 * Created by evazamudio on 2014-04-10.
 */
public class GameHelper {

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length()== 0 ) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

}
