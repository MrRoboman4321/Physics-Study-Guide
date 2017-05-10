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
public class Main_Window extends JPanel{
	
	public static int screenX=1366,screenY=768;
	
	public static String whichMenu="home"; 
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
	
	static GraphicsMain img=new GraphicsMain(null);
	static Drawing draw=new Drawing(null);
	static ClickHandle click=new ClickHandle(null);
	
	public static String path(){
		ProcessBuilder builder=new ProcessBuilder("cmd.exe","/c","cd");
		builder.redirectErrorStream(true);
		Process p=null;
		try{
			p=builder.start();
		} catch (IOException e){}
		BufferedReader r=new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line=null;
		try{
			line=r.readLine();
			for(int a=0;a<line.length();a++){
				if(String.valueOf(line.charAt(a)).equals("/")){
					System.out.println(a);
				}
			}
		}catch (IOException e){
			//its actually fucking impossible for this not to work so...
		}
		line=line.concat("\\images\\");
		return line;
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D graphics=(Graphics2D)g;
		this.setBackground(Color.WHITE);
		img.paint(graphics);
	}
	public static void main(String[]args) throws InterruptedException{
		JFrame frame=new JFrame("Study Guide!");
		Main_Window menu=new Main_Window();
		frame.add(menu);
		frame.setSize(screenX,screenY);
		//frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().addMouseListener(new MouseAdapter(){            
			public void mousePressed(MouseEvent e){
				   if(e.getButton()==MouseEvent.BUTTON1){
					   int mouseX=MouseInfo.getPointerInfo().getLocation().x-frame.getX()-9;
					   int mouseY=MouseInfo.getPointerInfo().getLocation().y-frame.getY()-38;
					   System.out.println(mouseX+":"+mouseY);
					   click.handleClick(mouseX,mouseY);
				   }
			   }
			}
		);
		JOptionPane.showMessageDialog(null, "Click on units/subjects/equations to navigate to different pages. \n"
				+ "Click the home button to go back to the main menu. \n"
				+ "Click on image to be redirected to an online physics textbook.");
		while(true){
			frame.repaint();
			if(whichMenu.equals("home")){
				frame.setSize(screenX,screenY);
			}
			if(whichMenu.equals("constants")){
				frame.setSize(850, 600);
			}
			Thread.sleep(10);
		}
	}
}
