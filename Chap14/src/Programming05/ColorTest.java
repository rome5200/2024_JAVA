package Programming05;

import java.util.*;
import java.util.stream.Collectors;

class Color {
	String name;
	String hexaCode;
	
	public Color(String name, String hexaCode) {
		this.name = name;
		this.hexaCode = hexaCode;
	}
	
}

public class ColorTest {
	public static void main(String[] args) {		
		List<Color> colorList = new ArrayList<>();
		colorList.add(new Color("Blue", "#0000FF"));
        colorList.add(new Color("Red", "#FF0000"));
        colorList.add(new Color("Green", "#00FF00"));
        
        List<Color> sortedColors = colorList.stream()
        		.sorted((c1, c2) -> c2.name.compareToIgnoreCase(c1.name))
        		.collect(Collectors.toList());
        
        sortedColors.forEach(color ->
        	System.out.println("Name : " + color.name + ", HexaCode : " + color.hexaCode));
	}
}
