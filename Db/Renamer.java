import java.io.*;

public class Renamer {

	public static void main(String[] args) throws Exception {
		for (File f : new File("monarchs").listFiles()) {
			String tag = f.getName().substring(f.getName().length() - 3);
			System.out.println(f.getName() + " : " + tag);
			f.renameTo(new File("monarchs/Monarchs_" + tag + ".txt"));
		}
		for (File f : new File("leaders").listFiles()) {
			String tag = f.getName().substring(f.getName().length() - 3);
			System.out.println(f.getName() + " : " + tag);
			f.renameTo(new File("leaders/Leaders_" + tag + ".txt"));
		}
	}
}
		