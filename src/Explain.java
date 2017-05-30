import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Explain {
	private Main_Window menu;
	public Explain(Main_Window menu){
		this.menu=menu;
	}
	private String info = "";
	@SuppressWarnings({ "static-access", "resource" })
	public void explainStuff(String whichNum){
		info = "";
		String exp_path = menu.path() + "\\equations\\" + menu.whichMenu;
		try{
			FileReader file = new FileReader(exp_path + "\\explain.txt");
			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while((line = reader.readLine()) != null) {
				String [] parts = line.split("\\|");
				if(parts[0].equals(whichNum)){
					String str=String.valueOf(parts[1]);
					String[] splitStr = str.split("_");
					for(int a = 0; a < splitStr.length; a++){
						info += String.valueOf(splitStr[a]) + "\n";
					}
				}
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		JOptionPane.showMessageDialog(null, info);
	}
}
