package src;

import java.util.List;
import java.util.Random;

import org.w3c.dom.ranges.Range;

public class StringGenerator {
    public StringGenerator(){
        
    }
    /**
     * Generates the random string using the range of characters in the characters field
     * @return
     */
    public String getRandomString(int len){
        String rnadomString = "";
        Random random = new Random();
        while(-- len > 0){
            int index = random.nextInt(len);
            if(index < 26){
                rnadomString += (char)(97 + index);
            }else {
                rnadomString += (char)(65 + index - 26);
            }
        }

        return rnadomString;
    }
    /**
     * adds to the list of range of characters based on input
     */
    public void addRange(Range range){
        characters.add(range);
    }
    List<Range> characters;
}
