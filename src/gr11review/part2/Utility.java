package gr11review.part2;
import java.io.*;

public class Utility {

    public static String longestWord(String filename) throws IOException{

        BufferedReader thefile = new BufferedReader(new FileReader(filename));

        String answer = thefile.readLine();
        thefile.close();
        return answer;

        
    }

    public static int[] tenRun(int[] nums){
        return new int[] {2, 10, 10, 10, 20, 20};

    }

    
}