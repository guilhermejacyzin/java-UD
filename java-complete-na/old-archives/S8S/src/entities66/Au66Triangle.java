package entities66;

public class Au66Triangle {

    //  atributos
    public double a;
    public double b;
    public double c;

    //  método - função para calcular a área do triângulo
    //  tipo de retorno da operação nome da operação (parâmetros)
    public double area() {
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
        //  ou
        //        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
