package t3;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private Account account;


    public Customer(String name, String address, String phoneNumber, String emailAddress, Account account) {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.emailAddress = emailAddress;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
      return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
    }

    public Account getAccount() {
      return account;
    }

    public void setAccount(Account account) {
      this.account = account;
    }
}
