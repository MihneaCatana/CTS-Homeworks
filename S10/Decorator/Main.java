public class Main {

    public static void main(String[] args) {

        //abonament de baza
        Subscription subscription = new BasicSubscription();

        //adauga optiune de vizionare offline
        subscription = new HDStreamingViewDecorator(subscription);

        subscription = new OfflineViewDecorator(subscription);

        System.out.println("Descriere: "+ subscription.getDescription());
        System.out.println("Pret: "+ subscription.getPrice());
    }
}
