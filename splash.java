package clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class splash {
    JLabel et;
    ImageIcon imgicon;
    Icon icono;
    JFrame frame;
    
    public splash()
    {
        frame = new JFrame("Cargando...");
        frame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3, 500, 250);
        //frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        et = new JLabel();
        //et.setBounds(0, 0, 200, 100);
        imgicon = new ImageIcon(ruta("lania.jpg"));
        //System.out.println(ruta("lania.jpg"));
        icono = new ImageIcon(imgicon.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_DEFAULT));
        et.setText(null);
        et.setIcon(icono);
        frame.add(et);
        //this.add(frame); 
        frame.setVisible(true);        
    }
    
    private URL ruta(String nimg)
    {
        return this.getClass().getResource("/img/".concat(nimg));
    }
    
    public void parar()
    {
        frame.setVisible(false);
        frame.dispose();
    }
}
