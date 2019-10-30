public class Simulation {

    int numberOfTosses;
    int numberOfDies;
    Dice simDice;
    Bins results;

    public Simulation(int numberOfDies, int numberOfTosses){

        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.simDice = new Dice(numberOfDies);
        this.results = new Bins(numberOfDies, 6 * numberOfDies);

    }

    public Bins runsimulation(){

        for(int i = 0; i < numberOfTosses; i++){
            results.incrementBin(simDice.tossAndSum());
        }

        return results;

    }

    public String printResults(){

        this.runsimulation();

        String ans = "***\n + Simulation of "+numberOfDies+" dice tossed for "+numberOfTosses+ " times.\n + *** \n\n";

        for(int i = numberOfTosses; i <= numberOfTosses * 6; i++){
            ans += String.format("%3x ");
        }

        return  ans;
    }

}
