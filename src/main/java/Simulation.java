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

    public void printResults(){

        this.runsimulation();

        String ans = "***\n"
                    +"Simulation of "+numberOfDies+" dice tossed for "+numberOfTosses+ " times.\n"
                    +"*** \n\n";

        for(int i = numberOfDies; i <= numberOfDies * 6; i++){
            int tot = results.getBin(i);
            double frac = (double) tot/numberOfTosses;
            int stars = tot/10000;

            ans += String.format("%4d  :%10d: %1.2f ", i, tot, frac);

            for(int j = 0; j < stars; j++){ ans += "*";};

            ans += "\n";

        }

        System.out.println(ans);

    }

}
