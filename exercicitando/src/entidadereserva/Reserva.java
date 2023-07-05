package entidadereserva;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private int numQuarto;
    private Date dataEntrada;
    private Date dataSaida;
    
    

    public Reserva(int numQuarto, Date dataEntrada, Date dataSaida) {
        this.numQuarto = numQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }
    
    public Date getDataSaida() {
        return dataSaida;
    }

    public long Duracao(){   // get time pega milleSegundos da data
        long diff = dataEntrada.getTime()- dataSaida.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atualizaData(Date dataEntrada, Date dataSaida){
        Date now = new Date();
        if(dataEntrada.before(now) || dataSaida.before(now)){
            throw new IllegalArgumentException("Reserva deve ser feita com datas futuras".toUpperCase());
                // argumento invalido
    }
        if(!dataSaida.after(dataEntrada)){
           throw new IllegalArgumentException("ERRO , DATA DE SAIDA DEVE SER SUPERIOR A DATA DE ENTRADA");
    }
    else{
    // vamos estabelecer uma regra onde as datas deveram ser posteriores a data atua
    
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        
    }}

    @Override
    public String toString() {
        return "QUARTO: "+numQuarto+ " \n DataEntrada = " + dataEntrada + "| Data Saida = " + dataSaida ;
    }

    

 

   


}
