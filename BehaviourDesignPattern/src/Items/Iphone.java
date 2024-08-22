package Items;

import MethodToNotify.NotifyUser;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements StocksObserve{

    List<NotifyUser>list = new ArrayList<>();
    int stockCount;
    String productName = "Iphone";

    @Override
    public void add(NotifyUser user) {
        list.add(user);
    }

    @Override
    public void remove(NotifyUser user) {
        list.remove(user);
    }

    @Override
    public void update(String product) {
        for(NotifyUser currUser:list){
            currUser.update(productName);
        }
    }

    @Override
    public int getStocks() {
        return stockCount;
    }

    @Override
    public void setStocks(int stocks) {
        if(stockCount==0){
            update(productName);
        }
        else {
            stockCount+=stocks;
        }
    }
}
