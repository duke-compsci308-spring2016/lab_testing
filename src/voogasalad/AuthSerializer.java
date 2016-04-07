package game_data;

import com.thoughtworks.xstream.XStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AuthSerializer {
	public static void SerializeData(Object o) {

		File f = pickFile(true);
		XStream xstream = new XStream();
		String xml = xstream.toXML(o);

		try {
			FileWriter writer = new FileWriter(f);
			writer.write(xml);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("Error saving to file " + f.getAbsolutePath());
		}
	}

	private static File pickFile(boolean amSaving) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter xmlFilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");
		fileChooser.addChoosableFileFilter(xmlFilter);
		fileChooser.setFileFilter(xmlFilter);

		int result = 0;
		if (amSaving)
			result = fileChooser.showSaveDialog(null);
		else
			result = fileChooser.showOpenDialog(null);

		if (result != JFileChooser.APPROVE_OPTION)
			return null;

		return fileChooser.getSelectedFile();
	}

	public static Object Deserialize() {
		File f = pickFile(false);
		XStream xstream = new XStream();

		return xstream.fromXML(f);
	}

	@Test
    public void testArrayList()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < 100; i++)
    		list.add(i);

    	SerializeData(list);
    	Object o = Deserialize();
        assertEquals("Test ArrayList", o, list);
    }


	@Test
    public void testArrayListString()
    {
    	ArrayList<String> list = new ArrayList<String>();
    	for(int i = 0; i < 100; i++)
    		list.add(Integer.toString(i));

    	SerializeData(list);
    	Object o = Deserialize();
        assertEquals("Test ArrayList with String", o, list);
    }
}
