class Circulo extends Formas{

    public Circulo(double area){
        this.area = area;
    }

    @Override
    public void calcularArea(){
        area = Math.PI * raio * raio;
        System.out.printf("Área do círculo: %.2f m².\n", area);
    }
}