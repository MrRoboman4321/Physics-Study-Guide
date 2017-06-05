import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Main_Window extends JPanel {
	public static int screenX = 1366;
	public static int screenY = 768;
	public static Graphics2D graphics;
	public static String whichMenu = "home";
	public static boolean quizMode = false;
	
	/*
	 * home
	 * constants
	 * thermo
	 * fluid
	 * electro
	 * mag
	 * optic
	 * modern
	 */
	
	static GraphicsMain img = new GraphicsMain(null);
	static Drawing draw = new Drawing(null);
	static ClickHandle click = new ClickHandle(null);
	static Explain explain = new Explain(null);
	
	public static String path() {
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd");
		builder.redirectErrorStream(true);
		Process p = null;
		try {
			p = builder.start();
		} catch (IOException e) {}
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		try {
			line = r.readLine();
			for(int a=0; a < line.length(); a++) {
				if(String.valueOf(line.charAt(a)).equals("/")) {
					System.out.println(a);
				}
			}
		} catch (IOException e) {
		}
		line = line.concat("\\images\\");
		return line;
	}
	public void paint(Graphics g) {
		super.paint(g);
		graphics = (Graphics2D)g;
		this.setBackground(Color.WHITE);
		img.paint(graphics);
	}
	public static void main(String[]args) throws InterruptedException {
		JFrame frame = new JFrame("Study Guide!");
		Main_Window menu = new Main_Window();
		frame.add(menu);
		frame.setSize(screenX, screenY);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				   if(e.getButton() == MouseEvent.BUTTON1) {
					   int mouseX = MouseInfo.getPointerInfo().getLocation().x-frame.getX() - 8;
					   int mouseY = MouseInfo.getPointerInfo().getLocation().y-frame.getY() - 30;
					   
					   click.handleClick(mouseX, mouseY);
					   click = new ClickHandle(null);
					   
					   //System.out.println(mouseX+":"+mouseY);
				   }
			   }
			}
		);
		JOptionPane.showMessageDialog(null, "Click on units/subjects/equations to navigate to different pages. \n"
				+ "Click the home button to go back to the main menu. \n"
				+ "Click on image to be redirected to an online physics textbook.");
		while(true) {
			frame.repaint();
			if(whichMenu.equals("home")) {
				frame.setSize(screenX,screenY);
			} else if(whichMenu.equals("constants")){
				frame.setSize(650, 750);
			} else if(whichMenu.equals("thermo")){
				frame.setSize(950, 750);
			} else if(whichMenu.equals("fluid")){
				frame.setSize(850, 750);
			} else if(whichMenu.equals("electro")){
				frame.setSize(1300, 750);
			} else if(whichMenu.equals("mag")){
				frame.setSize(650, 650);
			} else if(whichMenu.equals("optic")){
				frame.setSize(1050, 650);
			} else if(whichMenu.equals("modern")){
				frame.setSize(750, 600);
			}else {
				frame.setSize(1300, 750);
			}
			Thread.sleep(10);
		}
	}
}
