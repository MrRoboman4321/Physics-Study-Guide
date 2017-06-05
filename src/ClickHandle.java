import java.awt.Desktop;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class ClickHandle{
	private Main_Window menu;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Rectangle> rects = new ArrayList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<String> whichRect = new ArrayList();
	@SuppressWarnings({ "static-access", "resource" })
	public ClickHandle(Main_Window menu){
		this.menu = menu;
		String rect_path = menu.path() + "\\equations\\" + menu.whichMenu;
		try{
			FileReader file = new FileReader(rect_path + "\\rect.txt");
			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while((line = reader.readLine()) != null) {
				String [] parts = line.split(" ");
				Rectangle rect = new Rectangle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
				rects.add(rect);
				whichRect.add(parts[0]);
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	@SuppressWarnings("static-access")
	public void handleClick(int x,int y){
		Point click=new Point(x,y);
		
		for(int i = 0; i < rects.size(); i++) {
			if (rects.get(i).contains(click) && ! whichRect.get(i).equals("image") && (menu.whichMenu.equals("home") || whichRect.get(i).equals("home"))){
				menu.whichMenu = whichRect.get(i);
			} else if (rects.get(i).contains(click) && whichRect.get(i).equals("image") && (menu.whichMenu.equals("home"))){
				URL url = null;
				try {
					url = new URL("http://fcis.aisdhaka.org/personal/chendricks/IB/Giancoli/Giancoli%20Chapters.html");
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)){
					try {
						desktop.browse(url.toURI());
					} catch (Exception e) {
					}
				}
			} else if (rects.get(i).contains(click)){
				menu.explain.explainStuff(whichRect.get(i));
				
			}
		}
	}
}
