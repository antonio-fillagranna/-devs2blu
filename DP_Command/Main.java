public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        CommandManager manager = new CommandManager();

        // Comando para adicionar texto "Hello, "
        Command addHello = new AddTextCommand(document, "Hello, ");
        manager.executeCommand(addHello);
        System.out.println(document.getContent());  // Saída: "Hello, "

        // Comando para adicionar texto "world!"
        Command addWorld = new AddTextCommand(document, "world!");
        manager.executeCommand(addWorld);
        System.out.println(document.getContent());  // Saída: "Hello, world!"

        // Desfazer a última operação (remover "world!")
        manager.undo();
        System.out.println(document.getContent());  // Saída: "Hello, "

        // Refazer a última operação (adicionar "world!" novamente)
        manager.redo();
        System.out.println(document.getContent());  // Saída: "Hello, world!"
    }
}
