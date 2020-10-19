package assignment4;

public class Critter3 extends Critter{

    public boolean walk = false;
    // Critter3 does intervals of walking and running
    @Override
    public void doTimeStep() {
        int dir = getRandomInt(8);

        if (walk) {
            walk(dir);
            walk = false;
        }
        else run(dir);
    }

    // only fights Critter4
    @Override
    public boolean fight(String oponent) {
        if (getEnergy() > 20 && oponent.equals("2")) return true;
        return false;
    }

    public String toString() {
        return "3";
    }
}
