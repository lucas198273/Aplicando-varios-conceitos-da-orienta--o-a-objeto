package entidades;

public abstract class Conta extends Banco {
    // classe abstrata nao pode ser instanciada e pode ser herdada totalmente.

    private String nome;
    protected double saldoConta;
    private Agencias agencia;
    private StatusConta statusConta;

    public Conta() {
    }



    public Conta(String nome, double saldoConta, Agencias agencia, StatusConta statusConta) {
        this.nome = nome;
        this.saldoConta = saldoConta;
        this.agencia = agencia;
        this.statusConta = statusConta;
    }

    public String getNome() {
        return nome;
    }

  
    public double getSaldoConta() {
        return saldoConta;
    }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void modificaStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }

    public void depositar(double valordeposito) {
         saldoConta += valordeposito;
    }
    public void sacar(double valorSaque) {
        if(valorSaque > saldoConta ){
            throw new IllegalArgumentException("SALDO INSUFICIENTE");
        }
        saldoConta -= valorSaque;
    }


    public Agencias getAgencia() {
        return agencia;
    }

 

   

    

    


    
}
