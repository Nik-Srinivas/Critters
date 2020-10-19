package assignment4;

public class Critter2 extends Critter{
    // Critter1 runs unless direction = 0, then it walks
    @Override
    public void doTimeStep() {
        int dir = getRandomInt(8);
        if (dir == 0) walk(dir);
        else run(dir);
    }

    // only fights if energy is greater than 5
    @Override
    public boolean fight(String oponent) {
        if (getEnergy() > 5) return true;
        return false;
    }

    public String toString() {
        return "2";
    }
}
