class PagamentoCredito extends Pagamento{

    @Override
    public void realizarPagamento(){
        System.out.println("Forma de pagemnto: Crédito");
    }
}