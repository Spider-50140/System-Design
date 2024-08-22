import Items.Iphone;
import Items.StocksObserve;
import MethodToNotify.EmailNotification;
import MethodToNotify.NotifyUser;
import MethodToNotify.PushNotification;

public class Main {
    public static void main(String[] args) {
        StocksObserve product1 =  new Iphone();
        NotifyUser user1 = new EmailNotification("Satya",product1);
        NotifyUser user2 = new PushNotification("Bittu",product1);

        product1.add(user1);
        product1.add(user2);

        product1.setStocks(10);

    }
}