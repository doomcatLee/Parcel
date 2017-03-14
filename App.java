import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double ht, lt, wd, wt;
    List<Parcel> parcelList = new ArrayList<Parcel>();

    System.out.println("Welcome to LEE PX!");
    loop: while(true){
      System.out.println("------------------------------");
      System.out.println("\n 1. Add Package \n 2. List all the packages \n 3. Apply Special Discount \n 4. Finish and ship");
      String input = scanner.nextLine();
      switch(input){
        case "1":
          System.out.println("Enter height in inches: ");
          ht = Double.parseDouble(scanner.nextLine());
          System.out.println("Enter length in inches: ");
          lt = Double.parseDouble(scanner.nextLine());
          System.out.println("Enter width in inches: ");
          wd = Double.parseDouble(scanner.nextLine());
          System.out.println("Enter weight in pounds: ");
          wt = Double.parseDouble(scanner.nextLine());

          Parcel par = new Parcel(lt,ht,wd,wt);
          double additionalCost = 0;

          System.out.println("------------------------------");
          System.out.println("Delivery options are \n 1. Ground \n 2. One-day \n 3. One-hour");
          int option = Integer.parseInt(scanner.nextLine());
          if (option == 1){
            par.price += par.deliverySpeed(0);
          }else if(option == 2){
            par.price += par.deliverySpeed(1);
          }else if(option == 3){
            par.price += par.deliverySpeed(2);
          }//end of if

          System.out.println("------------------------------");
          System.out.println("Add pretty pretty wrapper??? \n 1. Yes \n 2. No");
          int option2 = Integer.parseInt(scanner.nextLine());
          if (option2 == 1){
            par.price += par.addWrapper();
          }
          parcelList.add(par);

          continue;

        case "2":
          System.out.println("------------------------------");
          for (int i=0; i < parcelList.size(); i++ ) {
            System.out.println(parcelList.get(i));
          }
          continue;

        case "3":
          for (int i=0; i < parcelList.size(); i++ ) {
            parcelList.get(i).applyDiscount();
          }
          System.out.println("We took off $20 on every item, just for fun!");
          continue;

        case "4":
          System.out.println("Your items has been shipped! Thanks!");
          break loop;
      }//End of switch
    }//End of while
  }//main
}//App class
