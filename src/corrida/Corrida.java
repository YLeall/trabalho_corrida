package corrida;

import java.util.Scanner;

public class Corrida {

    static Veiculo veiculo1 = new Veiculo(0, 0);
    static Veiculo veiculo2 = new Veiculo(0, 0);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distanciaCorrida = 0;

        System.out.print("Defina uma distância máxima para a corrida: ");
        distanciaCorrida = sc.nextInt();

        for (int i = 0; i <= distanciaCorrida; i++) {
            sortVelDist();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(veiculo1.distanceSpaceWhite(veiculo1.getDistancia()) + "#");
            System.out.println(veiculo2.distanceSpaceWhite(veiculo2.getDistancia()) + "#");
            System.out.println("----------------------------------------------------------------------------------------\n");
            if (veiculo1.getDistancia() >= distanciaCorrida || veiculo2.getDistancia()>=distanciaCorrida) {
                break;
            } 

        }

        if (veiculo1.getDistancia() > veiculo2.getDistancia()) {
            System.out.println("O veículo 1 venceu a corrida!");
        } 
        else if(veiculo1.getDistancia() == veiculo2.getDistancia()){
            System.out.println("EMPATE !");
        }
        else {
            System.out.println("O veículo 2 venceu a corrida!");
        }

        sc.close();
    }

    public static void sortVelDist() {
        veiculo1.setSpeedRandom();
        veiculo2.setSpeedRandom();
    
        veiculo1.setDistancePlusSpeed();
        veiculo2.setDistancePlusSpeed();
    }

}
