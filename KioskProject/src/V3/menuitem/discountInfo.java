package V3.menuitem;

public enum discountInfo {
    국가유공자(10),
    군인(5),
    학생(3),
    일반(0);

    private final int percent;

    discountInfo(int percent) {
        this.percent = percent;
    }

    public int getPercent(){
        return percent;
    }

    public double applyDiscount(double price){
        return price * (1 - percent / 100.0);
    }
}
