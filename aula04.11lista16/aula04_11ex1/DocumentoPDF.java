package aula04_11ex1;

class DocumentoPDF implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo documento PDF...");
    }
}