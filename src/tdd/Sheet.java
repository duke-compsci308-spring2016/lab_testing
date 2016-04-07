package tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rhondusmithwick on 4/7/16.
 *
 * @author Rhondu Smithwick
 */
public class Sheet {

    private final Map<String, String> sheetMap = new HashMap<>();

    public String get(String cell) {
        String value = getLiteral(cell);
        try {
            Double.parseDouble(value);
            return value.trim();
        } catch (NumberFormatException n) {
            return value;
        }
    }

    public void put(String cell, String cellValue) {
        sheetMap.put(cell, cellValue);
    }

    public String getLiteral(String cell) {
        if (!containsCell(cell)) {
            sheetMap.put(cell, "");
        }
        return sheetMap.get(cell);
    }

    private boolean containsCell(String cell) {
        return sheetMap.containsKey(cell);
    }
}
