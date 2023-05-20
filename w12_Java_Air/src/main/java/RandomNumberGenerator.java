import java.util.Random;

public class RandomNumberGenerator {
    private final int min = 1;
    private int max;
    private int randomNumber;

    public RandomNumberGenerator(int max) {
        this.max = max;
        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(max - min) + min;
        if (randomNumber == 0) {
            randomNumber = max; // Set the random number to the maximum value
        }
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
