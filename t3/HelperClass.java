package t3;

public class HelperClass {

  public static void viewAllCustomers(BMS bank) {
    System.out.println("\nList of all customers:");
    System.out.println("----------------------------------------");
    bank.viewAllCustomers();
  }

  public static void viewCustomer(int index, BMS bank) {
    System.out.println("\nDetails of customer at index " + index + ":");
    System.out.println("----------------------------------------");
    bank.viewCustomer(index);
  }

  public static void main(String[] args) {

    Account account1 = new Account("1234567890", "Savings", 1000.0);
    Account account2 = new Account("0987654321", "Checking", 500.0);
    Account account3 = new Account("1122334455", "Business", 2000.0);

    Customer customer1 = new Customer("Alexia Cazan", "Titulescu 23", "0741234567", "alexia@gmail.com", account1);
    Customer customer2 = new Customer("John Doe", "Main St 45", "0749876543", "cust1@gmail.com", account2);
    Customer customer3 = new Customer("Jane Smith", "Elm St 12", "0745678901", "cust3@gmail.com", account3);
    

    BMS bms1 = new BMS();

    bms1.addCustomer(customer1);
    bms1.addCustomer(customer2);
    bms1.addCustomer(customer3);
  
    viewCustomer(1, bms1);

    bms1.removeCustomer(0);

    viewAllCustomers(bms1);

    viewCustomer(1, bms1);

  }
}
