public class Main {

    public static void main(String[] args){

        Instrumento[] instrumentos = new Instrumento[3];

        Instrumento bateria = new Bateria();
        Instrumento piano = new Piano();
        Instrumento violao = new Violao();

        instrumentos[0] = bateria;
        instrumentos[1] = piano;
        instrumentos[2] = violao;

        for(int i = 0; i < instrumentos.length; i++){
            instrumentos[i].tocar();
            System.out.println();
        }
    }
}
