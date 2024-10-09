public class Theme {

    private String name = "";
    private String[] itemsList = new String[1];
    private Double themePrice = 0.0;
    private String tableclothColor = "";

    Theme() {
        this.setName("");
        this.setItemsList(new String[1]);
        this.setThemePrice(0.0);
        this.setTableclothColor("");
    }

    Theme(String name, Double themePrice) {
        this.setName(name);
        this.setItemsList(new String[1]);
        this.setThemePrice(themePrice);
        this.setTableclothColor("");
    }

    Theme(String name, Double themePrice, String[] itemsList, String tableclothColor) {
        this.setName(name);
        this.setItemsList(itemsList);
        this.setThemePrice(themePrice);
        this.setTableclothColor(tableclothColor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItemsList() {
        return itemsList;
    }

    public void setItemsList(String[] itemsList) {
        this.itemsList = itemsList;
    }

    public Double getThemePrice() {
        return themePrice;
    }

    public void setThemePrice(Double themePrice) {
        this.themePrice = themePrice;
    }

    public String getTableclothColor() {
        return tableclothColor;
    }

    public void setTableclothColor(String tableclothColor) {
        this.tableclothColor = tableclothColor;
    }

    @Override
    public String toString() {
        String msg = "Theme Name ..................................: %s \nIncluded Items List .........................: %s \nTheme Price .................................: %s \nTablecloth Color ............................: %s \n";

        String formattedMsg = String.format(msg, this.getName(), String.join(", ", this.getItemsList()), this.getThemePrice(), this.getTableclothColor());

        return formattedMsg;
    }
}
