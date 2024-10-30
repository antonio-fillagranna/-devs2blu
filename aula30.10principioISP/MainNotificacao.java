package listaexercicios14.principioISP;

public class MainNotificacao {

	public static void main(String[] args) {
		NotificacaoEmail n1 = new NotificacaoEmail();
		NotificacaoSMS n2 = new NotificacaoSMS();
		n1.enviarPushNotification();
		n1.enviarEmail();
		n2.enviarPushNotification();
		n2.enviarSMS();
	}

}
