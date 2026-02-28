public class Lab3 {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "ABC";

    // * Initialize startTime here
    long startTimeA = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTimeA = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeA = endTimeA - startTimeA;
    System.out.println("Elapsed time for Best Case: " + elapsedTimeA);


    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   

    String worstCase = "89Z";
    
    // * Initialize startTime here
    long startTimeB = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    long endTimeB = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeB = endTimeB - startTimeB;
    System.out.println("Elapsed time for Worst Case: " + elapsedTimeB);

    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }









  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}