import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
public class Drawing {
	@SuppressWarnings("unused")
	private static Main_Window menu;
	private Image textbook;
	private Image home;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<String[]> positions = new ArrayList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<Image> images = new ArrayList();
	@SuppressWarnings({ "static-access", "resource" })
	public Drawing(Main_Window menu) {
		this.menu = menu;
		String equation_path = menu.path() + "\\equations\\" + menu.whichMenu;
		try {
			textbook = ImageIO.read(new File(menu.path() + "\\base\\Giancoli-Physics-7th.jpg"));
			home = ImageIO.read(new File(menu.path() + "\\base\\home.png"));
		} catch (IOException e) {}
		try{
			FileReader input = new FileReader(equation_path + "\\pos.txt");
			BufferedReader bufRead = new BufferedReader(input);
			String line = null;
			while ((line = bufRead.readLine()) != null) {
				String[] parts = line.split(" ");
				String[] position = {parts[1], parts[2]};
				this.positions.add(position);
				this.images.add(ImageIO.read(new File(equation_path + "\\" + parts[0] + ".png")));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception");
		}
	}
	
	public void draw(Graphics2D graphics) {
		graphics.drawImage(home, 0, 0, 100, 100, null);
		
		for(int i = 0; i < images.size(); i++) {
			graphics.drawImage(images.get(i), Integer.parseInt(this.positions.get(i)[0]), Integer.parseInt(this.positions.get(i)[1]), null);
		}
		
		
		/*
		 *  debugging mode for rect.txt stuff
		 */
		for(int a = 0; a < menu.click.rects.size(); a++){
			graphics.fill(new Rectangle(menu.click.rects.get(a)));
		}
		/*
		 * 
		 */
	}

	public void paintHome(Graphics2D graphics) {
		graphics.setColor(Color.decode("#C53652"));
		graphics.setFont(new Font("verdana", Font.ITALIC + Font.BOLD, 50));
		graphics.drawString("Main Menu - Key Concepts", 0, 70);
		graphics.fillRect(-10, 80, 750, 5);
		
		graphics.setColor(Color.BLACK);
		graphics.setFont(new Font("verdana", Font.BOLD,40));
		
		graphics.drawString("Constants", 0, 160);
		graphics.drawString("Thermodynamics - Unit One", 0, 250);
		graphics.drawString("Fluid Dynamics - Unit Two", 0, 340);
		graphics.drawString("Electronics - Unit Three and Four", 0, 430);
		graphics.drawString("Magnetism - Unit Five", 0, 520);
		graphics.drawString("Waves and Optics - Unit Six", 0, 610);
		graphics.drawString("Modern Physics - Unit Seven", 0, 700);

		graphics.drawImage(textbook, 800, 0, 494, 700, null);
	}
}
