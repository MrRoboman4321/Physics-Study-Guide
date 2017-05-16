import java.awt.Color;
import java.awt.Graphics2D;
public class GraphicsMain{
	private Main_Window menu;
	private Drawing screen;
	private String cur_screen;
	public GraphicsMain(Main_Window menu) {
		this.menu = menu;
		cur_screen = "home";
		screen = new Drawing(this.menu);
	}
	@SuppressWarnings("static-access")
	public void paint(Graphics2D graphics){
		graphics.setColor(Color.BLACK);
		if(!menu.whichMenu.equals(cur_screen)) {
			screen = new Drawing(this.menu);
		}

		if(menu.whichMenu.equals("home")) {
			screen.paintHome(graphics);
		} else {
			screen.draw(graphics);
		}
	}
}
