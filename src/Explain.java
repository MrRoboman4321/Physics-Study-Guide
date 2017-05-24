import java.util.HashMap;

import javax.swing.JOptionPane;
public class Explain {
	private Main_Window menu;
	public Explain(Main_Window menu){
		this.menu=menu;
	}
	private HashMap <String, HashMap <String, String>> info = new HashMap <String, HashMap<String, String>>();
	
	//I will make this function better and less bad later, but right now the framework is all set up
	public void initMap(){
		HashMap <String, String> constants = new HashMap <String, String>();
		HashMap <String, String> thermo = new HashMap <String, String>();
		HashMap <String, String> fluid = new HashMap <String, String>();
		HashMap <String, String> electro = new HashMap <String, String>();
		HashMap <String, String> mag = new HashMap <String, String>();
		HashMap <String, String> optic = new HashMap <String, String>();
		HashMap <String, String> modern = new HashMap <String, String>();
		
		thermo.put("1", "Pressure is equal to force divided by area. ");
		thermo.put("2", ""
				+ "Energy transfered to the system by heating divided by the change in time is equal to\n"
				+ "the thermal conductivity of the object times area times change in temperature,\n"
				+ "divided by the thickness of the object. An use for this equation is finding the\n"
				+ "thermal energy transfered into a room through a piece of glass with area 6 m^2 and\n"
				+ "a thickness of 2 cm, with a change of temperature between the inside and the outside\n"
				+ "of 20 degrees.");
		
		info.put("constants", constants);
		info.put("thermo", thermo);
		info.put("fluid", fluid);
		info.put("electro", electro);
		info.put("mag", mag);
		info.put("optic", optic);
		info.put("modern", modern);
	}
	
	@SuppressWarnings("static-access")
	public void explainStuff(String whichNum){
		JOptionPane.showMessageDialog(null, info.get(menu.whichMenu).get(whichNum));
	}
}
