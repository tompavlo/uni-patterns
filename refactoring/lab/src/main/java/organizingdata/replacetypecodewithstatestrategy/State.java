package organizingdata.replacetypecodewithstatestrategy;

public interface State {
    void cancel(Order order);
    void complete(Order order);
}
