public class HDStreamingViewDecorator extends SubscriptionDecorator{
    public HDStreamingViewDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" + vizualizare in 1080p";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.0;
    }
}
