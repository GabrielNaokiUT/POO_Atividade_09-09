class Quadrado extends Formas{

    public Quadrado(double area){
        this.area = area;
    }

    @Override
    public void calcularArea(){
    area = base * altura;
    System.out.printf("Área do quadrado: %.2f m².\n", area);
    }
}
