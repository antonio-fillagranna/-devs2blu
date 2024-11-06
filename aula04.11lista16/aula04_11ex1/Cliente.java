package aula04_11ex1;

class Cliente {
    private Documento documento;

    public Cliente(DocumentoFactory factory) {
        this.documento = factory.criarDocumento();
    }

    public void abrirDocumento() {
        documento.abrir();
    }
}