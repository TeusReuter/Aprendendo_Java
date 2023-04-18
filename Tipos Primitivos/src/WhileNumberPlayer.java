import java.math.BigDecimal;
import java.math.RoundingMode;

public class WhileNumberPlayer {

    public int numberOfPlayers;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers > 0) {
            this.numberOfPlayers = numberOfPlayers;
        }
    }

    WhileNumberPlayer(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
    }

    public void printSquaresUpToLimit() {
        this.numberOfPlayers = numberOfPlayers;
        int i = 1;
        System.out.println("Squares \n");
        while(i * i < numberOfPlayers) {
            System.out.print(i * i + " \n");
            i++;
        }
        System.out.println();
    }

    public void printCubesUpToLimit() {
        this.numberOfPlayers = numberOfPlayers;
        int i = 1;
        System.out.println("Cubes \n");
        while(i * i * i < numberOfPlayers) {
            System.out.print(i * i * i + " \n");
            i++;
        }
    }

}
