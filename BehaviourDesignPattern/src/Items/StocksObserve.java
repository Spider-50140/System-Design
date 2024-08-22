package Items;

import MethodToNotify.NotifyUser;

public interface StocksObserve {
    // add
    void add(NotifyUser user);

    // remove
    void remove(NotifyUser user);

    // update
    void update(String product);


    // get
    int getStocks();

    // set
    void setStocks(int stocks);
}
