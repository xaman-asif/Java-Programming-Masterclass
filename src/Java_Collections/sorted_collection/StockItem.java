package Java_Collections.sorted_collection;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;  //can be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        if (quantity >= 0) {
            this.quantityStock += quantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj==null || obj.getClass() != this.getClass())
            return false;

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 007;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock +
                '}';
    }
}
