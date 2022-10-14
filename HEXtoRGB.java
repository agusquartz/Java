package editedClasses;

import java.awt.Color;


/**
 *
 * @author Agustin Argüello Bernal
 */
public class HEXtoRGB {
    
    /**
     * Creates a new object RGBtoHEX
     */
    public HEXtoRGB(){
        
    }
    
    /**
     * Method in charge of convert HEX color code to RGB int array
     * @param hex
     * @return 
     */
    public int[] getRGB(final String hex){
        final int[] rgb = new int[3];
        for (int i = 0; i < 3; i++)
        {
            rgb[i] = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return rgb;
    }
    
    /**
     * Method in charge of create a new color of Color class
     * @param hexcol
     * @return 
     */
    public Color setColour(int[] hexcol){
        colour0 = hexcol[0];
        colour1 = hexcol[1];
        colour2 = hexcol[2];
        colour = new java.awt.Color(colour0, colour1, colour2);
        return colour;
    }
    
    private Color colour;
    private int colour0;
    private int colour1;
    private int colour2;
}
