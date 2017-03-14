import java.util.Scanner;

public class App{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    double ht, lt, wd, wt;

    System.out.println("Welcome to LEE PX!");
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

    System.out.println("Delivery options are \n 1. Ground \n 2. One-day \n 3.One-hour");
    int option = Integer.parseInt(scanner.nextLine());
    if (option == 1){
      additionalCost += par.deliverySpeed(0);
    }else if(option == 2){
      additionalCost += par.deliverySpeed(1);
    }else if(option == 3){
      additionalCost += par.deliverySpeed(2);
    }//end of if

    System.out.println("Add pretty pretty wrapper??? \n 1. Yes \n 2. No");
    int option2 = Integer.parseInt(scanner.nextLine());
    if (option2 == 1){
      additionalCost += par.addWrapper();
    }

    System.out.println("Total Cost is: $" + (par.costToShip() + additionalCost));




  }//main
}//App class
