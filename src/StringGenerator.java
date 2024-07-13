package src;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ranges.Range;

public class StringGenerator {
    public StringGenerator(){
        
    }
    /**
     * Generates the random string using the range of characters in the characters field
     * @return
     */
    public String getRandomString(){
        String rnadomString = "";
        ArrayList<String> list = new ArrayList<String>();
        for (Range range : characters) {
            list.add(range.toString());
        }
        for(String str : list){
            System.out.println(str);
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
