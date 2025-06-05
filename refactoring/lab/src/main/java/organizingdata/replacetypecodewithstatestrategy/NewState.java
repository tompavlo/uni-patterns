package organizingdata.replacetypecodewithstatestrategy;

public class NewState implements State{
    @Override
    public void cancel(Order order) {
        order.setStatus(new CancelledState());
    }

    @Override
    public void complete(Order order) {
        order.setStatus(new ProcessingState());
    }

}
