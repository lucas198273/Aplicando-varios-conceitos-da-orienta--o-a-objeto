package entidades;

public class ContaPoupanca extends Conta{
    
    private Double taxaJurosDouble;

    public ContaPoupanca(){
        super();
    }



    public ContaPoupanca(String nome, double saldoConta, Agencias agencia, Double taxaJurosDouble, StatusConta statusConta) {
        super(nome, saldoConta, agencia,statusConta);
        this.taxaJurosDouble = taxaJurosDouble;
    }

    //Atualizar saldo com base na taxa de juros
    public void atualizarSaldo(){
        saldoConta += saldoConta * taxaJurosDouble;
    }
    @Override
    public void sacar(double valorSaque){
        if(valorSaque > saldoConta ){
            throw new IllegalArgumentException("SALDO INSUFICIENTE");
        }
        saldoConta -= valorSaque +7;
    }
}
