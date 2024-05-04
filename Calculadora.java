public class Calculadora implements Operacoes {
    @Override
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    @Override
    public double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    @Override
    public double raizQuadrada(double num) {
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN;
        } else {
            return Math.sqrt(num);
        }
    }
}
