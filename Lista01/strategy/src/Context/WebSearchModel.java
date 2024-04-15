package Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Strategy.IStrategyFilters;

public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<IStrategyFilters> filters = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while ( true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, IStrategyFilters filter) {
        observers.add(queryObserver);
        filters.add(filter);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver obs : observers) {
            for (IStrategyFilters iStrategyFilters : filters) {
                if(iStrategyFilters.isInteresting(line)) {
                    obs.onQuery(line);
                }
            }
        }
    }
}
