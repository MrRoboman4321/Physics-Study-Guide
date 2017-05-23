import java.util.HashMap;
public class Explain {
	private Main_Window menu;
	public Explain(Main_Window menu){
		this.menu=menu;
	}
	private HashMap <String, HashMap <String, String>> info = new HashMap <String, HashMap<String, String>>();
	
	public void initMap(){
		HashMap <String, String> constants = new HashMap <String, String>();
		HashMap <String, String> thermo = new HashMap <String, String>();
		HashMap <String, String> fluid = new HashMap <String, String>();
		HashMap <String, String> electro = new HashMap <String, String>();
		HashMap <String, String> mag = new HashMap <String, String>();
		HashMap <String, String> optic = new HashMap <String, String>();
		HashMap <String, String> modern = new HashMap <String, String>();
		
		
		
		info.put("constants", constants);
		info.put("thermo", thermo);
		info.put("fluid", fluid);
		info.put("electro", electro);
		info.put("mag", mag);
		info.put("optic", optic);
		info.put("modern", modern);
	}
	
	public void explainStuff(String whichNum){
		
	}
}
