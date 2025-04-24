package t3;
import java.util.HashMap;

public class BMS {
  HashMap<Integer, Customer> customers = new HashMap<>();

  // method for adding a new customer
  public void addCustomer(Customer customer) {
    int id = customers.size(); // generate a unique id for the customer
    customers.put(id, customer);
  }

  // method for removing a customer using the id
  public void removeCustomer(int id) {
    customers.remove(id);
  }

  // method for viewing the entire BMS
  public void viewAllCustomers() {
    for (int id : customers.keySet()) {
      Customer customer = customers.get(id);
      System.out.println("ID: " + id + ", Name: " + customer.getName() + ", Address: " + customer.getAddress() +
                         ", Phone Number: " + customer.getPhoneNumber() + ", Email Address: " + customer.getEmailAddress());
    }
  }

  //method for viewing a specific customer using the id (NEW FEATURE)
  public void viewCustomer(int id) {
    if (customers.containsKey(id)) {
      Customer customer = customers.get(id);
      System.out.println("ID: " + id + ", Name: " + customer.getName() + ", Address: " + customer.getAddress() + ", Phone Number: " + customer.getPhoneNumber() + ", Email Address: " + customer.getEmailAddress());
    }
  }
  
}
