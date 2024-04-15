package Strategy.ConcreteStrategy;

import Strategy.IStrategyFilters;

public class LengthQueryFilter implements IStrategyFilters {
    
    public boolean isInteresting(String query) {
        return query.length() > 60;
    }
}
