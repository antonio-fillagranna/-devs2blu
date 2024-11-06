package aula04_11ex1;

class PDFFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoPDF();
    }
}