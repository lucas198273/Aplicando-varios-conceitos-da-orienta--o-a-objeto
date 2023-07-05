package entidades;

public class ContaJuridica extends Conta{
    
    private double limitSaque ;

    private double limitEmprestimo;
    

    public ContaJuridica() {
        super();
    }

    public ContaJuridica(String nome, double saldoConta, Agencias agencia, double limitSaque, double limitEmprestimo, StatusConta statusConta) {
        super(nome, saldoConta, agencia, statusConta);
        this.limitSaque = limitSaque;
        this.limitEmprestimo = limitEmprestimo;
    }
    



    public double getLimitSaque() {
        return limitSaque;
    }

    public void aumentaLimitSaque(double aumentoValor) {
        limitSaque += aumentoValor;
    }
    public void reduzirLimitSaque(double reduzValor) {
        limitSaque -= reduzValor;
    }
    @Override
    public void sacar(double valorSaque) {
        if(valorSaque > saldoConta ){
            throw new IllegalArgumentException("SALDO INSUFICIENTE");
        }
        saldoConta -= valorSaque +10;
    }

    public double getLimitEmprestimo() {
        return limitEmprestimo;
    }

    public void emprestimo(double quantia){
        if(quantia <= limitEmprestimo){ 
         saldoConta += quantia + 10;
        // SO É POSSIVEL ACESSAR  A VARISVEL SALDO EM CONTA POIS SUA VIZIBILIDADE É DO TIPO PROTECTED 
        }
    }

    @Override
    public String toString() {
        return "ContaJuridica [ limitSaque=" + limitSaque + "]";
    }


}
