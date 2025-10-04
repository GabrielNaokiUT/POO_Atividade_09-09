public class Main {

    public static void main(String[] args){

        Pagamento[] pagamentos = new Pagamento[3];

        Pagamento credito = new PagamentoCredito();
        Pagamento debito = new PagamentoDedito();
        Pagamento pix = new PagamentoPix();

        pagamentos[0] = credito;
        pagamentos[1] = debito;
        pagamentos[2] = pix;

        for(int i = 0; i < pagamentos.length; i++){
            pagamentos[i].realizarPagamento();
            System.out.println();
        }
    }
}