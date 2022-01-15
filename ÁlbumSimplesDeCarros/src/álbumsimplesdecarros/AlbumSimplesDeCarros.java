
package álbumsimplesdecarros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author FATIMA30
 */
public class AlbumSimplesDeCarros extends JFrame implements ItemListener {
    
    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagem ={
        
        new ImageIcon(getClass().getResource("Pagina.jpg")),
        new ImageIcon(getClass().getResource("aston.jpg")),
        new ImageIcon(getClass().getResource("bugatti-la.jpg")),
        new ImageIcon(getClass().getResource("bugatti-veyron.jpg")),
        new ImageIcon(getClass().getResource("bugatti.jpg")),
        new ImageIcon(getClass().getResource("ferrari.jpg")),
        new ImageIcon(getClass().getResource("koenigsegg.jpg")),
        new ImageIcon(getClass().getResource("lamborghini.jpg")),
        new ImageIcon(getClass().getResource("mercedes.jpg")),
        new ImageIcon(getClass().getResource("rolls.jpg")),
        new ImageIcon(getClass().getResource("w.jpg"))
    };
    public AlbumSimplesDeCarros(){
        
        super("ÁLBUM DE CARROS");
        
        combo = new JComboBox<String>();
        label = new JLabel(imagem[0]);
        
        Container c = getContentPane();
      
        combo.setFont(new Font("font", Font.PLAIN,15));
        combo.setBackground(Color.GREEN);
        combo.addItem("Página Inicial");
        combo.addItem("Aston Martin valkyrie") ;
        combo.addItem("Bugatti La voiture Noire"); 
        combo.addItem("Bugatti Veyron Vivere by Mansory");
        combo.addItem("Bugatti Chiron Sport");
        combo.addItem("Ferrari Sergio Pininfarina");
        combo.addItem("Koenigsegg ccxr Trevita");
        combo.addItem("Lamborghini Veneno");
        combo.addItem("Mercedes Maybach Exelero");
        combo.addItem("Rolls Royce Sweptailw Motors Lykan Hypersport");
        combo.addItem("W Motors");
       
        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);
        
        combo.addItemListener(this);
        setVisible(true);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if(e.getStateChange() == ItemEvent.SELECTED){
        
            label.setIcon(imagem[combo.getSelectedIndex()]);
        
        }
        
    }
    
}
