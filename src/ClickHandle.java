import java.awt.Desktop;
import java.awt.Point;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.net.URL;
public class ClickHandle{
	private Main_Window menu;
	public ClickHandle(Main_Window menu){
		this.menu=menu;
	}
	@SuppressWarnings("static-access")
	public void handleClick(int x,int y){
		Point click=new Point(x,y);
		if(menu.whichMenu.equals("home")){
			Rectangle constants = new Rectangle(0,130,285,50);
			Rectangle thermo = new Rectangle(0,210,830,50);
			Rectangle fluid = new Rectangle(0,300,740,50);
			Rectangle electro = new Rectangle(0,390,930,50);
			Rectangle mag = new Rectangle(0,480,620,50);
			Rectangle optic = new Rectangle(0,570,780,50);
			Rectangle modern = new Rectangle(0,660,800,50);
			Rectangle image = new Rectangle(800,25,500,700);
			if(constants.contains(click)){
				menu.whichMenu = "constants";
			}
			if(thermo.contains(click)){
				menu.whichMenu = "thermo";
			}
			if(fluid.contains(click)){
				menu.whichMenu = "fluid";
			}
			if(electro.contains(click)){
				menu.whichMenu = "electro";
			}
			if(mag.contains(click)){
				menu.whichMenu = "mag";
			}
			if(optic.contains(click)){
				menu.whichMenu = "optic";
			}
			if(modern.contains(click)){
				menu.whichMenu = "modern";
			}
			if(image.contains(click)){
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
			}
		}

		else if(menu.whichMenu.equals("constants")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			Rectangle em = new Rectangle(25,130,475,30);
			Rectangle gas = new Rectangle(25,170,600,30);
			Rectangle ec = new Rectangle(25,225,495,30);
			Rectangle ev = new Rectangle(25,275,475,30);
			Rectangle light = new Rectangle(25,325,315,30);
			Rectangle plank = new Rectangle(25,375,360,30);
			Rectangle coul = new Rectangle(25,425,615,30);
			Rectangle atm = new Rectangle(25,475,610,30);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
			if(em.contains(click)){
				//System.out.println("Electron mass");
			}
			if(gas.contains(click)){
				System.out.println("Gas Constant");
			}
			if(ec.contains(click)){
				System.out.println("Electron charge");
			}
			if(ev.contains(click)){
				System.out.println("electron volt");
			}
			if(light.contains(click)){
				System.out.println("speed of light");
			}
			if(plank.contains(click)){
				System.out.println("plank's constant");
			}
			if(coul.contains(click)){
				System.out.println("coulomb");
			}
			if(atm.contains(click)){
				System.out.println("atm");
			}
		}
		
		else if(menu.whichMenu.equals("thermo")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
		
		else if(menu.whichMenu.equals("fluid")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
		
		else if(menu.whichMenu.equals("electro")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
		
		else if(menu.whichMenu.equals("mag")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
		
		else if(menu.whichMenu.equals("optic")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
		
		else if(menu.whichMenu.equals("modern")){
			Rectangle goHome = new Rectangle(0,0,100,100);
			if(goHome.contains(click)){
				menu.whichMenu = "home";
			}
		}
	}
}
