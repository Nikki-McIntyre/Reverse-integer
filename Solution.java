import java.util.Scanner;

/**
 * @author Nikki McIntyre 
 * Takes in an integer and flips the numbers I.E. 123 becomes 321 however negatives keep the sign at the front so -123 becomes -321
 */
class Solution {
  public static void main(String[] args) {
    //take input and test the value
    System.out.println("What value do you want to reverse? ");
    kbd = new Scanner(System.in);
    try{
      System.out.println(ans.reverse(kbd.nextInt()));
    }
    catch(Exception e){
      System.out.println("invalid integer");
    }
    kbd.close();
  }

  /**
   * flips the integer
   * @param x the integer to reverse
   * @return the flipped integer
   */

  public int reverse(int x) {
    //figure out if the value is nrgative
    boolean isNeg;
    if (x >= 0){
      isNeg = false;
    }
    else {
      isNeg = true;
    }
    //if it is take the absolute value. This is necessary for the next step
    if(isNeg){
      x = Math.abs(x);
    }
    //reverse the int. This is why the absolute value was needed otherwise -456 would become 654- which is not what we want
    String xToString = Integer.toString(x);
    String reversed = new StringBuffer(xToString).reverse().toString();

    //Try to conver it into an int if it is an overflow return 0
    try {
      //if it was negative we again have to make it negative so we multiply it by -1
      if (isNeg){
        x = -1 * (Integer.parseInt(reversed));
      }
      else {
        x = Integer.parseInt(reversed);
      }
      return x;
    }
    catch (Exception e){
      return 0;
    }
  }
}  