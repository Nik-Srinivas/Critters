package assignment4;

public class Critter2 extends Critter{
    // Critter1 reproduces unless direction = 2, then it runs
    @Override
    public void doTimeStep() {
        int dir = getRandomInt(8);
        if (dir == 2) {run(dir);}
        else {reproduce(this,dir);};
    }

    // only fights Critter4
    @Override
    public boolean fight(String oponent) {
        if (oponent.equals("4")) return true;

        return false;
    }

    public String toString() {
        return "1";
    }
}
