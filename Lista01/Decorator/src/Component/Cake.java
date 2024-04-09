package Component;

public abstract class Cake {
    private final int CAKE_COST = 10;

    public int getCost() {
        return CAKE_COST;
    }

    public abstract String getDescription();
}
