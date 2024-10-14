public class TesteContribuinte {
    public static void main(String[] args) {
        Pessoa[] contribuintes = new Pessoa[7];
        
        contribuintes[0] = new PessoaFisica("José da Silva", 800, "123.456.789-00");
        contribuintes[1] = new PessoaFisica("Maria Oliveira", 2000, "987.654.321-11");
        contribuintes[2] = new PessoaFisica("Joao Souza", 2500, "111.222.333-44");
        contribuintes[3] = new PessoaFisica("Ana Carla Azevedo", 3500, "999.888.777-66");
        contribuintes[4] = new PessoaFisica("Sebastião Pereira", 5000, "444.555.666-77");
        contribuintes[5] = new PessoaJuridica("Empresa XYZ", 50000, "11.111.111/0001-11");
        contribuintes[6] = new PessoaJuridica("Empresa ABC", 100000, "22.222.222/0001-22");

        for (Pessoa contribuinte : contribuintes) {
            System.out.println("Nome: " + contribuinte.getNome());
            System.out.println("Imposto a pagar: R$ " + contribuinte.calcularImposto());
            System.out.println();
        }
    }
}