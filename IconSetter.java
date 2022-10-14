
package editedClasses;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author agusquartz
 */
public class IconSetter {
    public IconSetter(){
        
    }
    
    public void setIcon(JLabel label, String path){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH)));
    }
}
