package Component;

public abstract class Cake {
    public int CAKE_COST = 0;

    public int getCost() {
        return CAKE_COST;
    }

    public abstract String getDescription();
}
