import java.awt.Color;
import java.awt.Graphics2D;
public class GraphicsMain{
	private Main_Window menu;
	public GraphicsMain(Main_Window menu){
		this.menu=menu;
	}
	@SuppressWarnings("static-access")
	public void paint(Graphics2D graphics){
		graphics.setColor(Color.BLACK);
		if(menu.whichMenu.equals("home")){
			menu.draw.paintHome(graphics);
		}
		if(menu.whichMenu.equals("constants")){
			menu.draw.paintConstants(graphics);
		}
		if(menu.whichMenu.equals("thermo")){
			menu.draw.paintThermo(graphics);
		}
		if(menu.whichMenu.equals("fluid")){
			menu.draw.paintFluid(graphics);
		}
		if(menu.whichMenu.equals("electro")){
			menu.draw.paintElectro(graphics);
		}
		if(menu.whichMenu.equals("mag")){
			menu.draw.paintMag(graphics);
		}
		if(menu.whichMenu.equals("optic")){
			menu.draw.paintOptic(graphics);
		}
		if(menu.whichMenu.equals("modern")){
			menu.draw.paintModern(graphics);
		}
	}
}
