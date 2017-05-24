import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JOptionPane;
public class Explain {
	private Main_Window menu;
	public Explain(Main_Window menu){
		this.menu=menu;
	}
	private String info;
	//I will make this function better and less bad later, but right now the framework is all set up
	
	@SuppressWarnings("static-access")
	public void explainStuff(String whichNum){
		String exp_path = menu.path() + "\\equations\\" + menu.whichMenu;
		try{
			FileReader file = new FileReader(exp_path + "\\explain.txt");
			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while((line = reader.readLine()) != null) {
				String [] parts = line.split("\\|");
				if(line.startsWith(whichNum)){
					info=parts[1];
				}
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		JOptionPane.showMessageDialog(null, info);
	}
}
