package assignment4;

public class Critter4 extends Critter{
    public boolean fought = true;

    // Critter4 walk if energe < 10, reproduces if energy between 10 - 15, and runs otherwise
    @Override
    public void doTimeStep() {
        int dir = getRandomInt(8);
        if (getEnergy() < 10) walk(dir);
        else if (getEnergy() > 10 && getEnergy() < 15) reproduce(this,dir);
        else run(dir);
    }

    // only fights Critter4
    @Override
    public boolean fight(String oponent) {
        if (oponent.equals("3") && !fought) {
            fought = true;
            return true;
        }
        return false;
    }

    public String toString() {
        return "1";
    }
}
