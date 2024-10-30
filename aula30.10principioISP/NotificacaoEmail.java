package listaexercicios14.principioISP;

class NotificacaoEmail implements Notificacao, NotificacaoMail {
    public void enviarEmail() {
        System.out.println("Enviando notifica��o por e-mail.");
    }

    public void enviarSMS() {
        throw new UnsupportedOperationException("Notifica��o por SMS n�o suportada.");
    }

    public void enviarPushNotification() {
        throw new UnsupportedOperationException("Notifica��o por Push n�o suportada.");
    }
}
