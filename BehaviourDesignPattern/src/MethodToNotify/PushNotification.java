package MethodToNotify;

import Items.StocksObserve;

public class PushNotification implements NotifyUser{

    String username;
    StocksObserve item;

    public PushNotification(String username,StocksObserve item){
        this.username = username;
        this.item = item;
    }

    @Override
    public void update(String productName) {
        sendMail(username,productName);

    }

    public void sendMail(String username,String item){
        System.out.println(String.format("Hey - %s your - %s is in Stocks. Grab it up, Hurry!!", username, item));

    }
}
