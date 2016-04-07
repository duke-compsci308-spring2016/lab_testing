package tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;


public class Sheet {

    
    HashMap<String, List<String>> myHashMap = new HashMap<String, List<String>>();

    public Object get (String string) {
        return (myHashMap.containsKey(string)) ? myHashMap.get(string).get(1) : "";
    }

    public void put (String theCell, String string) {
        List<String> strArray = new ArrayList<String>();
        strArray.add(string);
        
        if (string.matches("\\s*[0-9]+\\s*"))
            strArray.add(string.trim());
        else
            strArray.add(string);
        myHashMap.put(theCell,  strArray);
    }

    public Object getLiteral (String theCell) {
        return myHashMap.get(theCell).get(0);
    }

}
