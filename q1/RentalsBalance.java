public class RentalsBalance {

    private Client client;
    private Double previousBalance = 0.0;

    public RentalsBalance() {
        this.setPreviousBalance(0.0);
    }

    public RentalsBalance(Client client) {
        this();
        this.client = client;        
    }
    
    public RentalsBalance(Client client, Double previousBalance) {
        this.client = client;
        this.previousBalance = previousBalance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(Double previousBalance) {
        this.previousBalance += previousBalance;
    }

    @Override
    public String toString() {
        return "RentalsBalance [client=" + client + ", previousBalance=" + previousBalance + "]";
    }
}

