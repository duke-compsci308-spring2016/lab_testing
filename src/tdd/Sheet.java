package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
    Map<String,Cell> cellMap;
    
    public Sheet(){
        cellMap = new HashMap<String,Cell>();
    }

    public String get (String string) {
        if (!cellMap.containsKey(string)) return "";
        return cellMap.get(string).get();
    }
    
    public void put (String theCell, String string) {
        cellMap.put(theCell, new Cell(string));
    }

    public String getLiteral (String theCell) {
        return cellMap.get(theCell).getLiteral();
    }
    
}
