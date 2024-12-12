package exemplo;

@Version(description = "Versão inicial")
public class TesteVersion {
	public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Info info = myClass.getClass().getAnnotation(Info.class);
        System.out.println("Autor: " + info.autor());
        System.out.println("Data: " + info.data());

        TesteVersion testeVersion = new TesteVersion();
        Version version = testeVersion.getClass().getAnnotation(Version.class);
        System.out.println("Versão: " + version.number());
        System.out.println("Descrição: " + version.description());
    }
}