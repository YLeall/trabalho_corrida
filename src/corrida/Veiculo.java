package corrida;

import java.util.Random;

public class Veiculo {
    
    int velocidade;
    int distancia;
    Random random = new Random();
    
    public Veiculo(int velocidade, int distancia) {
        this.velocidade = velocidade;
        this.distancia = distancia;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setSpeedRandom(){
        this.velocidade = random.nextInt(1, 4);
    }

    public void setDistancePlusSpeed(){
        this.distancia = this.distancia += this.velocidade;
    }

    

}
