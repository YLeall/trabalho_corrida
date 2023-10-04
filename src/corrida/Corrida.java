package corrida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrida {

    static Veiculo veiculo1 = new Veiculo(0, 0);
    static Veiculo veiculo2 = new Veiculo(0, 0);

    static List<String> distanciaVeiculo1List = new ArrayList<>();
    static List<String> distanciaVeiculo2List = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distanciaCorrida = 0;

        System.out.print("Defina uma distância máxima para a corrida: ");
        distanciaCorrida = sc.nextInt();

        for (int i = 0; i <= distanciaCorrida; i++) {
            sortVelDist();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(distanceSpaceWhite(veiculo1.getDistancia()) + "#");
            System.out.println(distanceSpaceWhite2(veiculo2.getDistancia()) + "#");
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

    public static String distanceSpaceWhite(int distanciaVeiculo1) {
        distanciaVeiculo1List.clear();
        for (int i = 0; i <= distanciaVeiculo1; i++) {
            distanciaVeiculo1List.add(" ");
        }

        String teste = String.join("", distanciaVeiculo1List);

        return teste;
    }

    public static String distanceSpaceWhite2(int distanciaVeiculo2) {
        distanciaVeiculo2List.clear();
        for (int i = 0; i <= distanciaVeiculo2; i++) {
            distanciaVeiculo2List.add(" ");
        }
        String teste = String.join("", distanciaVeiculo2List);

        return teste;
    }

}
