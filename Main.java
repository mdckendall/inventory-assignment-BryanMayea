import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name;
  String serialNumber;
  int value;

  Inventory(String name, String serialNumber, int value) {
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
  }

  public String toString() {
    return name + "," + serialNumber + "," + value;
  }

  public String serialNumber() {
    return serialNumber;
  }

  public String name() {
    return name;
  }

  public int value() {
    return value;
  }

}

class Main {
  public static void main(String[] args) {

    ArrayList<Inventory> inventory = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    boolean optionCheck = true;

    while (optionCheck) {
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");

    
      switch (input.nextInt()) {
        case 1: {
          System.out.println("Enter the name: ");

          input.nextLine();
          
          String name = input.nextLine();
          
          System.out.println("Enter the Serial Number: ");
          
          String serialNumber = input.nextLine();
          
          System.out.println("Enter the value in USD. (whole number) ");
          
          int value = input.nextInt();
          
          inventory.add(new Inventory(name, serialNumber, value));
          
          break;
        }
        case 2: {
          
          System.out.println("Enter the serial number of the item to delete: ");
          input.nextLine();

          String serialNumber = input.nextLine();

          for(int i = 0; i < inventory.size(); i++){
            Inventory inv = inventory.get(i);
            if (serialNumber.equals(inv.serialNumber())){
              inventory.remove(i);
              
            }
            
            }
          
          break;
        }
        case 3: {

          input.nextLine();
          
          System.out.println("Enter the serial number of the item to change: ");
          
          String serialNumber = input.nextLine();

          for(int i = 0; i < inventory.size(); i++) {
            Inventory inv = inventory.get(i);

            if (serialNumber.equals(inv.serialNumber())){

              System.out.println("Enter the new name: ");

              String name = input.nextLine();

              System.out.println("Enter the new value in dollars (whole number): ");

              int value = input.nextInt();

              inventory.set(i, new Inventory (name, serialNumber, value));
              
            }
            

          }
          
          // inventory.set(index-1, new Inventory(name, serialNumber, value));
          
          break;
        }
        case 4: {
          
          for(int i = 0; i < inventory.size(); i++) {
            Inventory inv = inventory.get(i);
            System.out.println(inv.toString());
          }
          
          break;
        }
        case 5:
          
          optionCheck = false;
          
          break;
        default:
          break;

      }
    }

  }
}