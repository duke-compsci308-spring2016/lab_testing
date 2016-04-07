package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
    
    Map<String, String> mySheet = new HashMap<String, String>();
    Map<String, String> myLiteralSheet = new HashMap<String, String>();

    public String get (String string) {
        // TODO Auto-generated method stub
        if(mySheet.containsKey(string)){
            return mySheet.get(string);
        }
        else{
            return "";
        }
    }

    public void put (String theCell, String string) {
        // TODO Auto-generated method stub
        String myString = string;
        myLiteralSheet.put(theCell, string);
        try{
            Double num = Double.parseDouble(string.trim());
            myString = string.trim();
        }
        catch (NumberFormatException error){
            //do nothing
        }
        mySheet.put(theCell, myString);
    }

    public Object getLiteral (String theCell) {
        if(mySheet.containsKey(theCell)){
            return myLiteralSheet.get(theCell);
        }
        else{
            return "";
        }
    }

}
