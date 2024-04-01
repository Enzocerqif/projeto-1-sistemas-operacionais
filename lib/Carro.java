import Enums.Direcao;
import Enums.Estados;

public class Carro extends Thread {
    private Integer id;
    private Doble tempoPermanencia;
    private Double tempoTravessia;
    private Estados estado;
    private Direcao direcao;
    private Double tempoEsperado;
    private Double tempoPercorrendo;
    
    

    public Carro(Integer id, Double tempoTravessia, Double tempoPermanencia, Estado estado, Direcao direcao) {
        this.id = id;
        this.tempoPermanencia = tempoPermanencia;
        this.tempoTravessia = tempoTravessia;
        this.estado = estado;
        this.direcao = direcao;
    }

    public Carro(Integer id, Double tempoTravessia, Double tempoPermanencia, Direcao direcao) {
        this.id = id;
        this.tempoPermanencia = tempoPermanencia;
        this.tempoTravessia = tempoTravessia;
        this.estado = Estados.Parado;
        this.direcao = direcao;
    }

    public void run() {
        double tempoAtual = 0.0;
        double tempoAnterior = (double)System.currentTimeMillis();
        this.tempoEsperado= this.tempoPercorrido = 0.0;

        try {
            while (true) {
                while (this.estado != Estados.Parado) {
                    if (this.estado != Estados.Esperando)
                }
            }
        }
    }

    public long getId() {
        return (long)this.id;
    }
  
    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTempoPermanencia() {
        return this.tempoPermanencia;
    }
  
    public void setTempoPermanencia(Double tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    public Double getTempoTravessia() {
        return this.tempoTravessia;
    }
  
    public void setTempoTravessia(Double tempoTravessia) {
        this.tempoTravessia = tempoTravessia;
    }

    public Estados getEstado() {
        return this.estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public Double getTempoEsperado() {
        return this.tempoEsperado;
    }

    public void setTempoEsperado(Double tempoEsperado) {
        this.tempoEsperado = tempoEsperado;
    }

    public Direcao getDirecao() {
        return this.direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public Double getTempoPercorrendo() {
        return this.tempoPercorrendo;
    }

    public void setTempoPercorrendo(Double tempoPercorrendo) {
        this.tempoPercorrendo = tempoPercorrendo;
    }
}