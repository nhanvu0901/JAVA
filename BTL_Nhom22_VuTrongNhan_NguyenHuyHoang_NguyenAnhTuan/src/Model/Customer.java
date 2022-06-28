package Model;

public class Customer extends Person {

    protected String address;
    protected String phoneNumber;
    protected Cart cart = new Cart();

    public Customer(String customer_name, String customer_gender, String customer_gmail, String address, String phoneNumber) {
        super(customer_name,customer_gender, customer_gmail);
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public Cart getCart() {
        return cart;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



}
