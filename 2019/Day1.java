import java.util.Scanner;

public class Day1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long total = 0;
    while(sc.hasNext()) {
      long tempFuel = sc.nextInt();
      long tempTotal = 0;
      while(true) {
        if(tempFuel/3-2<=0)
          break;
        tempTotal += tempFuel/3-2;
        tempFuel = tempFuel/3-2;
      }
      // System.out.println(tempTotal);
      total += tempTotal;
    }
    System.out.println(total);
  }
}
