package example01.k220412.exam01;

public final class CollectionBox {
    private int totalAmount;
    private static CollectionBox instance;

    private CollectionBox() {}

    public static CollectionBox getInstance() {
        if(instance == null){
            instance = new CollectionBox();
        }
        return instance;
    }

    public synchronized void contribute(int donation) {
        this.totalAmount += donation;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
