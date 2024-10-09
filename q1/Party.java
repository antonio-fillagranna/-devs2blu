public class Party {

    private String partyDate = "";
    private String partyStartTime = "";
    private String partyEndTime = "";
    private Double amountCharged = 0.0;
    private Double discount = 0.0;
    private Double amountPaid = 0.0;

    Party() {
        this.setPartyDate("");
        this.setPartyStartTime("");
        this.setPartyEndTime("");
        this.setAmountCharged(0.0);
        this.setDiscount(0.0);
        this.setAmountPaid(0.0);
    }

    Party(String partyDate, String partyStartTime, String partyEndTime) {
        this();
        this.setPartyDate(partyDate);
        this.setPartyStartTime(partyStartTime);
        this.setPartyEndTime(partyEndTime);
    }

    Party(String partyDate, String partyStartTime, String partyEndTime, 
          Double amountCharged, Double discount, Double amountPaid) {
        this.setPartyDate(partyDate);
        this.setPartyStartTime(partyStartTime);
        this.setPartyEndTime(partyEndTime);
        this.setAmountCharged(amountCharged);
        this.setDiscount(discount);
        this.setAmountPaid(amountPaid);
    }

    public String getPartyDate() {
        return partyDate;
    }

    public void setPartyDate(String partyDate) {
        this.partyDate = partyDate;
    }

    public String getPartyStartTime() {
        return partyStartTime;
    }

    public void setPartyStartTime(String partyStartTime) {
        this.partyStartTime = partyStartTime;
    }

    public String getPartyEndTime() {
        return partyEndTime;
    }

    public void setPartyEndTime(String partyEndTime) {
        this.partyEndTime = partyEndTime;
    }

    public Double getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(Double amountCharged) {
        this.amountCharged = amountCharged;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        String msg = 
                  "Party Date ..................................: %s \n"
                + "Party Start Time ............................: %s \n"
                + "Party End Time ..............................: %s \n";

        String formattedMsg = String.format(msg, 
                this.getPartyDate(), 
                this.getPartyStartTime(),
                this.getPartyEndTime());

        return formattedMsg;
    }
}
