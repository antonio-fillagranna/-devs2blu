public class Rental {

    private Client client = new Client();
    private ClientAddress clientAddress = new ClientAddress();
    private Theme theme = new Theme();
    private Party party = new Party();
    

    Rental() {
        this.setClient(new Client());
        this.setClientAddress(new ClientAddress());
        this.setTheme(new Theme());
        this.setParty(new Party());
    }

    Rental(Client client, ClientAddress clientAddress, Theme theme, Party party) {
        this.setClient(client);
        this.setClientAddress(clientAddress);
        this.setTheme(theme);
        this.setParty(party);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
    
    @Override
    public String toString() {

        String msg = "%s%s%s%s"
                + "Discount ....................................: %.2f \n"
                + "Amount to charge ............................: %.2f";
                
        String formattedMsg = String.format(msg, 
                this.client.toString(),
                this.clientAddress.toString(),
                this.theme.toString(),
                this.party.toString(),                
                this.party.getDiscount(), 
                this.party.getAmountCharged()
                );
            
        return formattedMsg;

    }
    
    public void processPayment(Double amountPaid) {

        this.applyClientDiscount();
        
        System.out.println(this.toString());    

        if (amountPaid < this.party.getAmountCharged()) {
            System.out.printf(
                    "ERROR .......................................: "
                  + "Insufficient Amount - Payment Not Processed! \n");
        }

        if (amountPaid >= this.party.getAmountCharged()) {
            this.party.setAmountPaid(this.party.getAmountCharged());

            Double change = amountPaid - this.party.getAmountCharged();

            System.out.printf(
                      "Amount paid of "
                    + "..............................: %.2f \n", 
                    amountPaid);

            if (change > 0) {
                System.out.printf(
                          "Return Change of "
                        + "............................: %.2f \n", 
                        change);
            }

            this.client.getBalance().setClient(client);
            this.client.getBalance().setPreviousBalance(party.getAmountPaid());

            System.out.printf(
                      "OPERATION "
                    + "...................................: "
                    + "Payment Processed Successfully! \n");
            
            System.out.printf(
                      "CURRENT RENTALS PAID "
                    + "........................: %.2f \n\n\n",
                    this.client.getBalance().getPreviousBalance());

        }

    }

    private void applyClientDiscount() {

        Double appliedDiscount = 0.1;

        Double minimumRentalsForDiscount = (Double) 1000.0;

        Double currentRentals = this.client.getBalance().getPreviousBalance();        

        
        Boolean flag = Double.compare(currentRentals, minimumRentalsForDiscount) > 0;

        if (flag) {
            this.party.setDiscount(this.theme.getThemePrice() * appliedDiscount);
        } else {
            this.party.setDiscount(0.0);
        }

        this.party.setAmountCharged(this.theme.getThemePrice() - this.party.getDiscount());
    }
    
}

