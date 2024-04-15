package Strategy.ConcreteStrategy;

import Strategy.IStrategyFilters;

public class FriendQueryFilter implements IStrategyFilters {
    
    public boolean isInteresting(String query) {
        return query.toLowerCase().contains("friend");
    }
}
