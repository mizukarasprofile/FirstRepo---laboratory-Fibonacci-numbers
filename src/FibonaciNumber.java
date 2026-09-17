public class FibonaciNumber {
    private int order;
    private long value;

    public void setValue(long v) {
        this.value = v;
    }

    public void setOrder(int ord) {
        this.order = ord;
    }

    long getValue() {
        return value;
    }

    int getOrder() {
        return this.order;
    }

    boolean isSquare() {
        double forMe = this.value;
        double valRoot = Math.sqrt(forMe);
        double drobovachastina = valRoot - (long) valRoot;
        return drobovachastina == 0;
    }
}