package Ubung2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AnwendersystemModel {

	public String getUeberschrift() {
		return "Hallo";
	}

	public void WriteText(String text) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write(text);
		writer.close();
	}

}
