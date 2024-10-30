package listaexercicios14.principioISP;

class NotificacaoSMS implements Notificacao, NotificacaoMsg {
	
    public void enviarEmail() {
        throw new UnsupportedOperationException("Notifica��o por e-mail n�o suportada.");
    }

    public void enviarSMS() {
        System.out.println("Enviando notifica��o por SMS.");
    }

    public void enviarPushNotification() {
        throw new UnsupportedOperationException("Notifica��o por Push n�o suportada.");
    }
}
