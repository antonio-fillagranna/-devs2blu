public class RentalTest {

    public static void main(String[] args) {
        String[] cinderellaItemsList = { "Castle", "Cinderella Doll", "Pumpkin Carriage" };
        String[] snowWhiteItemsList = { "Castle", "Snow White Doll", "Giant Apple" };

        Theme cinderellaTheme = new Theme("Cinderella", 1000.0, cinderellaItemsList, "Pink");
        Theme snowWhiteTheme = new Theme("Snow White", 1500.0, snowWhiteItemsList, "Blue");

        Client client = new Client("Toni", "(47) 99927-4127");

        ClientAddress clientAddress01 = new ClientAddress(client, "R. Hermann Spernau, 60 - Escola Agrícola, Blumenau - SC, 89037-506");

        Party party01 = new Party("20/10/2024", "07:00", "22:00");

        Rental rental01 = new Rental(client, clientAddress01, snowWhiteTheme, party01);

        rental01.processPayment(1800.0);

        Party party2 = new Party("24/10/2024", "10:00", "20:00");

        Rental rental02 = new Rental(client, clientAddress01, cinderellaTheme, party2);

        rental02.processPayment(1000.0);

        Client client2 = new Client("Silvana", "(47) 98833-2783");
            
        ClientAddress clientAddress02 = new ClientAddress(client2, "R. Teófilo Otoní, 35 - Vila Nova, Blumenau - SC, 89035-650");

        Party party03 = new Party("02/11/2024", "07:30", "22:00");

        Rental mariaRental = new Rental(client2, clientAddress02, cinderellaTheme, party03);

        mariaRental.processPayment(750.00);
    }
}