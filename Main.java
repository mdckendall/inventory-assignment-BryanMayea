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
    return "Name: " + name + "  Serial Number: " + serialNumber + "  Value: $" + value;
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
          
          System.out.println("Enter the value in USD. (Make sure they are in whole numbers) ");
          
          int value = input.nextInt();
          
          inventory.add(new Inventory(name, serialNumber, value));
          
          break;
        }
        case 2: {
          
          System.out.println("Which item would you like to delete: ");
          
          int index = input.nextInt();
          
          if(index-1 < 0 || index-1 >= inventory.size()) {
            System.out.println("Item " + index + " does not exist.");  
            break;
          }

          inventory.remove(index-1);
          System.out.println("Item " + index + " deleted!");
          
          break;
        }
        case 3: {
          
          System.out.println("What item would you like to update: ");
          
          int index = input.nextInt();
          
          if(index-1 < 0 || index-1 >= inventory.size()) {
          System.out.println("Item does not exist. ");  
            break;
          }
          
          System.out.println("Enter the name: ");

          input.nextLine();
          
          String name = input.nextLine();
          
          System.out.println("Enter the Serial Number: ");
          
          String serialNumber = input.nextLine();
          
          System.out.println("Enter the value in USD. (Make sure they are in whole numbers) ");
          
          int value = input.nextInt();
          
          inventory.set(index-1, new Inventory(name, serialNumber, value));
          
          break;
        }
        case 4: {
          
          for(int i = 0; i < inventory.size(); i++) {
            Inventory inv = inventory.get(i);
            System.out.println(i+1 + ": " + inv.toString());
          }
          
          break;
        }
        case 5:
          
          System.out.println("Thanks for using my Inventory System! Goodbye!");
          
          optionCheck = false;
          
          break;
        default:
          break;

      }
    }

  }
}