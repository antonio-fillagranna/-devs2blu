package aula04_11ex1;

class WordFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoWord();
    }
}