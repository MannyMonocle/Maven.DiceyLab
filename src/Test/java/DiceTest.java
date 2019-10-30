import org.junit.Test;


public class DiceTest {

    @Test
    public void tossAndSumTest(){
        for(int i = 0; i < 50; i++) {
            Dice testingDice = new Dice(1);
            int rollTest = testingDice.tossAndSum();
            System.out.println(rollTest);
        }
    }

    @Test
    public void tossAndSumTest2dice(){
        for(int i = 0; i < 50; i++) {
            Dice testingDice = new Dice(2);
            int rollTest = testingDice.tossAndSum();
            System.out.println(rollTest);
        }
    }

    @Test
    public void tossAndSumTest3dice(){
        for(int i = 0; i < 500; i++) {
            Dice testingDice = new Dice(3);
            int rollTest = testingDice.tossAndSum();
            System.out.println(rollTest);
        }
    }
}
