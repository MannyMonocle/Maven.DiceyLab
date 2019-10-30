
public class Bins {

    int[] bin;
    int highestPossible;
    int lowestPosttible;

    public Bins(int lowestPossible, int highestPossible){
        this.highestPossible = highestPossible;
        this.lowestPosttible = lowestPossible;
        this.bin = new int[highestPossible + 1 - lowestPossible];
    }

    public void incrementBin(int value){
        bin[value - lowestPosttible]++;
    }

    public int getBin(int value){
        return bin[value - lowestPosttible];
    }

}