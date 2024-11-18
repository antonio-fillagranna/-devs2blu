public class DeleteTextCommand implements Command {
    private Document document;
    private int length;
    private String deletedText;

    public DeleteTextCommand(Document document, int length) {
        this.document = document;
        this.length = length;
        this.deletedText = "";
    }

    @Override
    public void execute() {
        deletedText = document.getContent().substring(document.getContent().length() - length);
        document.setContent(document.getContent().substring(0, document.getContent().length() - length));
    }

    @Override
    public void undo() {
        document.setContent(document.getContent() + deletedText);
    }
}
