package fontes;

public class Calculadora {

    public double somar(double a, double b){
        return a+b;
    }

    public double subtrair(double a, double b){
        return a-b;
    }

    public double multiplicar(double a, double b){
        return a*b;
    }

    public double dividir(double a, double b){
        if(b==0){
            throw new IllegalArgumentException("Impossível dividir por zero!");
        }
        return a/b;
    }
}
