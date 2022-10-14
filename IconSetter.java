import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author agusquartz
 */
public class IconSetter {
    public IconSetter(){
        
    }
    
    /**
     *  Method in charge of change the size of the image to the JLabel size and set it.
     * 
     */
    public void setIcon(JLabel label, String path){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH)));
    }
}
