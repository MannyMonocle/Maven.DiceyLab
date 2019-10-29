public class Dice {

    int N;

    public Dice(int numberOfDies){
        this.N = numberOfDies;
    }

    public int singleroll() {
        return  (int) (Math.random()*6) + 1;
    }

    public int tossAndSum(){

        int ans = 0;

        for(int i = 0; i < N; i++){
            ans += singleroll();
        }

        return ans;
    }

}
