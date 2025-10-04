class Retangulo extends Formas{
   
    public Retangulo(double area){
        this.area = area;
    }
    
    @Override
    public void calcularArea(){
        area = base * altura;
        System.out.printf("Área do retângulo: %.2f m².\n", area);
    }
}
