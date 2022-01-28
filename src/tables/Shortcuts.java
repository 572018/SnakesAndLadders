package tables;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Jonas
 *
 * The snakes and ladders
 */
public class Shortcuts {
	
	Map<Integer, Integer> slangerOgStiger;
	
	public Shortcuts() {
		slangerOgStiger = new HashMap<Integer, Integer>();
		
        slangerOgStiger.put(4, 14);
        slangerOgStiger.put(8, 31);
        slangerOgStiger.put(2, 38);
        slangerOgStiger.put(28, 84);
        slangerOgStiger.put(21, 42);
        slangerOgStiger.put(51, 67);
        slangerOgStiger.put(80, 100);
        slangerOgStiger.put(71, 91);
        slangerOgStiger.put(36, 44);
        slangerOgStiger.put(16, 6);
        slangerOgStiger.put(95, 75);
        slangerOgStiger.put(47, 26);
        slangerOgStiger.put(49, 11);
        slangerOgStiger.put(87, 24);
        slangerOgStiger.put(56, 53);
        slangerOgStiger.put(64, 60);
        slangerOgStiger.put(98, 78);
        slangerOgStiger.put(93, 73);
        slangerOgStiger.put(62, 18);
	}

	public Map<Integer, Integer> getShortcuts () {
        return slangerOgStiger;
	}
}
