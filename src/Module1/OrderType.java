package Module1;

public enum OrderType {
    STANDARD ("Standard"),
    EXPRESS ("Express"),
    SAME_HOUR ("Same-Hour");

    private final String value;
    private OrderType(String value) {
        this.value = value;
    }

}
