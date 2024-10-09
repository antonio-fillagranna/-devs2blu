public class Client {

    private String name = "";
    private String phone = "";
    private RentalsBalance balance = new RentalsBalance(this);

    Client() {
        this.setName("");
        this.setPhone("");
    }

    Client(String name, String phone) {
        this.setName(name);
        this.setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RentalsBalance getBalance() {
        return balance;
    }

    public void setBalance(RentalsBalance balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        String msg = "Name ........................................: %s \nPhone .......................................: %s \n";

        String formattedMsg = String.format(msg, this.getName(), this.getPhone());

        return formattedMsg;
    }
}
