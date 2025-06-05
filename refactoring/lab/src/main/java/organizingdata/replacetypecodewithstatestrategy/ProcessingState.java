package organizingdata.replacetypecodewithstatestrategy;

public class ProcessingState implements State{
    @Override
    public void cancel(Order order) {
        order.setStatus(new CancelledState());
    }

    @Override
    public void complete(Order order) {
        order.setStatus(new CompletedState());
    }
}
