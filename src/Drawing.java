import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Drawing{
	private Main_Window menu;
	public Drawing(Main_Window menu){
		this.menu=menu;
	}
	@SuppressWarnings("static-access")
	public void paintHome(Graphics2D graphics){
		graphics.setFont(new Font("verdana",Font.BOLD,40));
		/*
		 * 
		 */
		graphics.drawString("Main Menu - Key Concepts", 0, 70);
		graphics.drawString("Constants", 0, 160);
		graphics.drawString("Thermal Dynamics - Unit One", 0, 250);
		graphics.drawString("Fluid Dynamics - Unit Two", 0, 340);
		graphics.drawString("Electronics - Unit Three and Four", 0, 430);
		graphics.drawString("Magnetism - Unit Five", 0, 520);
		graphics.drawString("Waves and Optics - Unit Six", 0, 610);
		graphics.drawString("Modern Physics - Unit Seven", 0, 700);
		Image textbook=null;
		try{
			textbook=ImageIO.read(new File(menu.path()+"\\Giancoli-Physics-7th.jpg"));
		}catch(IOException e){};
		graphics.drawImage(textbook, 800, 0, 494, 700, null);
		/*
		 * 
		 */
	}
	@SuppressWarnings("static-access")
	public void paintConstants(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
		graphics.drawString("Electron Mass: 9.11*10    kg", 25, 150);
		graphics.drawString("Universal Gas Constant: 8.31 ", 25, 200);
		graphics.drawString("Electron Charge: 1.60*10    C", 25, 250);
		graphics.drawString("1 Electron Volt: 1.60*10    J", 25, 300);
		graphics.drawString("Speed of Light: 3.0*10  m/s", 25, 350);
		graphics.drawString("Plank's Constant: 6.63*10    J*s", 25, 400);
		graphics.drawString("Coulomb's Constant: 9.0*10  ", 25, 450);
		graphics.drawString("1 Atmospheric Pressure: 1.0*10  Pa", 25, 500);
		/*
		 * 
		 */
		graphics.setFont(new Font("verdana",Font.BOLD,20));
		graphics.drawString("-31", 415, 135);
		graphics.drawString("-19", 453, 235);
		graphics.drawString("-19", 433, 280);
		graphics.drawString("8", 405, 330);
		graphics.drawString("-34", 465, 380);
		graphics.drawString("9", 500, 430);
		graphics.drawString("5", 565, 480);
		/*
		 * 
		 */
		graphics.drawString("J", 565, 185); 
		graphics.fillRect(520, 186, 100, 2);
		graphics.drawString("(mol*K)", 525, 205);
		/*
		 * 
		 */
		graphics.drawString("(N*m^2)", 530, 430);//(N*m^2)/C^2
		graphics.fillRect(532, 435, 100, 2);
		graphics.drawString("C^2", 560, 455);
		
	}
	@SuppressWarnings("static-access")
	public void paintThermo(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
	}
	@SuppressWarnings("static-access")
	public void paintFluid(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
	}
	@SuppressWarnings("static-access")
	public void paintElectro(Graphics2D graphics){
		Image home=null,fe=null,ue=null,ve=null,ev=null,v=null,c=null,e=null,uc=null,i=null,r=null,p=null,iv=null,rs=null,rp=null,cp=null,cs=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
			fe=ImageIO.read(new File(menu.path()+"fe.png"));
			ue=ImageIO.read(new File(menu.path()+"ue.png"));
			ve=ImageIO.read(new File(menu.path()+"ve.png"));
			ev=ImageIO.read(new File(menu.path()+"ev.png"));
			v=ImageIO.read(new File(menu.path()+"v.png"));
			c=ImageIO.read(new File(menu.path()+"c.png"));
			e=ImageIO.read(new File(menu.path()+"e.png"));
			uc=ImageIO.read(new File(menu.path()+"uc.png"));
			i=ImageIO.read(new File(menu.path()+"i.png"));
			r=ImageIO.read(new File(menu.path()+"r.png"));
			p=ImageIO.read(new File(menu.path()+"p.png"));
			iv=ImageIO.read(new File(menu.path()+"iv.png"));
			rs=ImageIO.read(new File(menu.path()+"rs.png"));
			rp=ImageIO.read(new File(menu.path()+"rp.png"));
			cp=ImageIO.read(new File(menu.path()+"cp.png"));
			cs=ImageIO.read(new File(menu.path()+"cs.png"));
		}catch(IOException e1){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Electronics", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
		
		graphics.drawImage(fe, 25, 150, null);
		graphics.drawImage(ue, 25, 200, null);
		graphics.drawImage(ve, 25, 250, null);
		graphics.drawImage(ev, 25, 300, null);
		graphics.drawImage(v, 25, 350, null);
		graphics.drawImage(c, 25, 400, null);
		graphics.drawImage(e, 25, 450, null);
		graphics.drawImage(uc, 25, 500, null);
		
		graphics.drawImage(i, 275, 150, null);
		graphics.drawImage(r, 275, 200, null);
		graphics.drawImage(p, 275, 250, null);
		graphics.drawImage(iv, 275, 300, null);
		graphics.drawImage(rs, 275, 350, null);
		graphics.drawImage(rp, 275, 400, null);
		graphics.drawImage(cp, 275, 450, null);
		graphics.drawImage(cs, 275, 500, null);
		/*graphics.drawString("F =      *    ", 25, 150);
		graphics.drawString("ΔU =q*ΔV", 25, 200);
		graphics.drawString("V=      * ", 25, 250);
		graphics.drawString("E=  ", 25, 300);
		graphics.drawString("ΔV= ", 25, 350);
		graphics.drawString("C=ke * ", 25, 400);
		graphics.drawString("E=   ", 25, 450);
		graphics.drawString("U =0.5(QΔV)=0.5C(ΔV)^2", 25, 500);
		graphics.drawString("I=  ", 25, 550);
		graphics.drawString("R=  ", 25, 600);
		graphics.drawString("P=I*ΔV", 530, 150);
		graphics.drawString("I=  ", 530, 200);
		graphics.drawString("R =∑R ", 530, 250);
		graphics.drawString("   =∑  ", 530, 300);
		graphics.drawString("C =∑C ", 530, 350);
		graphics.drawString("   =∑  ", 530, 400);
		graphics.setFont(new Font("verdana",Font.BOLD,20));
		graphics.drawString("e", 40, 155);
		graphics.drawString("e", 72, 205);
		graphics.drawString("1", 100, 135);
		graphics.fillRect(85, 137, 50, 2);
		graphics.drawString("4πe ", 85, 155);
		graphics.setFont(new Font("verdana",Font.BOLD,10));
		graphics.drawString("0", 127, 157);
		graphics.setFont(new Font("verdana",Font.BOLD,20));
		graphics.drawString("q q ", 170, 132);
		graphics.fillRect(165, 137, 50, 2);
		graphics.drawString("r^2", 170, 155);
		graphics.setFont(new Font("verdana",Font.BOLD,10));
		graphics.drawString("1", 182, 134);
		graphics.drawString("2", 204, 134);
		graphics.setFont(new Font("verdana",Font.BOLD,20));
		graphics.drawString("1", 95, 238);
		graphics.fillRect(80, 240, 50, 2);
		graphics.drawString("4πe ", 80, 258);
		graphics.setFont(new Font("verdana",Font.BOLD,10));
		graphics.drawString("0", 122, 260);
		graphics.setFont(new Font("verdana",Font.BOLD,20));
		graphics.drawString("q", 165, 235);
		graphics.fillRect(155, 240, 30, 2);
		graphics.drawString("r", 165, 255);
		//graphics.drawString("ΔV", , y);
		 * 
		 */
	}
	@SuppressWarnings("static-access")
	public void paintMag(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
	}
	@SuppressWarnings("static-access")
	public void paintOptic(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
	}
	@SuppressWarnings("static-access")
	public void paintModern(Graphics2D graphics){
		Image home=null;
		try{
			home=ImageIO.read(new File(menu.path()+"home.png"));
		}catch(IOException e){}
		/*
		 * 
		 */
		graphics.drawImage(home, 0, 0, 100, 100, null);
		graphics.setFont(new Font("verdana",Font.BOLD,50));
		graphics.drawString("Constants", 100, 70);
		graphics.setFont(new Font("verdana",Font.BOLD,30));
	}
}
