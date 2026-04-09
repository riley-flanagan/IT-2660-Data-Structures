import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    
    

  // Step 3: Create a map called creditHours.
  
  Map<String, Integer> creditHours = new HashMap<>();
  
  // Step 4: put() the following values:

  creditHours.put("IT-1025", 3);
  creditHours.put("IT-1050", 3);
  creditHours.put("IT-1150", 3);   
  creditHours.put("IT-2310", 3);
  creditHours.put("IT-2320", 4);
  creditHours.put("IT-2351", 4);
  creditHours.put("IT-2650", 4);
  creditHours.put("IT-2660", 4);
  creditHours.put("IT-2030", 4);

  // Step 5: check for the following values and display true or false dpending on whether or not the map has the key.
  
  System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025"));

  System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110"));

  // Step 6: Print all of the values in the map.

  System.out.println("Values: " + creditHours.values());

  // Step 7: remove it-2030 and it-1150.

  creditHours.remove("IT-2030");
  creditHours.remove("IT-1150");

  // Step 8: Print all values in the map.

  System.out.println("Values:" + creditHours.values());

  }
}