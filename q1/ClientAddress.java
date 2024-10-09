public class ClientAddress {

    private Client client = new Client();
    private String fullAddress = "";

    ClientAddress() {
        this.setClient(new Client());
        this.setFullAddress("");
    }

    ClientAddress(Client client, String fullAddress) {        
        this.setClient(client);
        this.setFullAddress(fullAddress);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        String msg = "Full Address ................................: %s \n";

        String formattedMsg = String.format(msg, this.fullAddress);

        return formattedMsg;
    }
}

