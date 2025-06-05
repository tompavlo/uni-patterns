package organizingdata.replacetypecodewithstatestrategy;

public class Order {
    private State status;
    public static final int NEW = 0;
    public static final int PROCESSING = 1;
    public static final int COMPLETED = 2;
    public static final int CANCELLED = 3;
    public Order() {
        this.status = NEW;
    }

    public State getStatus() {
        return status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

    public void complete(){
        status.complete(this);
    }

    public void cancel(){
        status.cancel(this);
    }
    // Інші методи класу...
}
