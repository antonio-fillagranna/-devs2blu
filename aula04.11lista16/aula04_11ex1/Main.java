package aula04_11ex1;

public class Main {
    public static void main(String[] args) {
        Cliente clienteWord = new Cliente(new WordFactory());
        clienteWord.abrirDocumento(); 
       
        Cliente clientePDF = new Cliente(new PDFFactory());
        clientePDF.abrirDocumento();  
    }
}