public class Main {

    public static void main(String[] args){

        Formas[] formas = new Formas[3];
        
        Formas circ = new Circulo(0);
        circ.raio = 5.5;

        Formas quad = new Quadrado(0);
        quad.base = 8.15;
        quad.altura = 8.15;


        Formas ret = new Retangulo(0);
        ret.base = 10.72;
        ret.altura = 6.88;

        formas[0] = circ;
        formas[1] = quad;
        formas[2] = ret;


        for (int i = 0; i < formas.length; i++) {
            formas[i].calcularArea();
            System.out.println();
        }
    }
}
