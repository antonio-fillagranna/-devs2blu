public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new IngressoNormal(100.0);
        Ingresso ingressoVIP = new IngressoVIP(100.0, 50.0);
        Ingresso camaroteInferior = new CamaroteInferior(100.0, 70.0, "Setor A - Inferior");
        Ingresso camaroteSuperior = new CamaroteSuperior(100.0, 100.0, "Setor A - Superior");

        Ingresso[] ingressos = {ingressoNormal, ingressoVIP, camaroteInferior, camaroteSuperior};
        for (Ingresso ingresso : ingressos) {
            ingresso.imprimeTipo();
            ingresso.imprimeValor();
            System.out.println("Valor Total: R$ " + ingresso.valorTotal());
            System.out.println();
        }
    }
}