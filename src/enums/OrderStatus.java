package enums;

public enum OrderStatus {
    PENDING(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int priority;

    OrderStatus(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

}
