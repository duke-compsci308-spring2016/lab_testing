package voogasalad;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import gameauthoring.characters.FormData;
import gameauthoring.characters.FormDataManager;

public class FormDataManagerTest {
    
    private FormDataManager dataManager;

    @Before
    public void setup () {
        dataManager = new FormDataManager();
    }
    
    @Test
    public void testAdd () {
        FormData data = new FormData("Label", new ArrayList<String>(Arrays.asList("value")));
        dataManager.add(data);
        assertEquals("value", dataManager.getValue("Label"));
    }
    
    @Test
    public void testAddList () {
        ArrayList<String> dataList = new ArrayList<String>( Arrays.asList("data1", "data2", "data3"));
        FormData data = new FormData("Label", dataList);
        dataManager.add(data);
        
        assertEquals(dataList, dataManager.getValues("Label"));
        
    }

}
