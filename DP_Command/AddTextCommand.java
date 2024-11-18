public class AddTextCommand implements Command {
    private Document document;
    private String text;
    private String previousText;

    public AddTextCommand(Document document, String text) {
        this.document = document;
        this.text = text;
        this.previousText = "";
    }

    @Override
    public void execute() {
        previousText = document.getContent();
        document.setContent(document.getContent() + text);
    }

    @Override
    public void undo() {
        document.setContent(previousText);
    }
}
