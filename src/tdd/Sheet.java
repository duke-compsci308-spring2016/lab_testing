package tdd;

import java.util.HashMap;

/**
 * Created by aamir on 4/7/2016.
 */
public class Sheet{
    private HashMap<String,String> map;

    public Sheet(){
        map = new HashMap<>();
    }
    public void put(String key, String val){
        map.put(key,val);
    }

    public String get(String key){
        String value = map.get(key);
        if (isNumeric(key.trim())){
            return key.trim();
        }
        return key;
    }

    public String getLiteral(String key){
        return map.get(key);
    }
    private boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
