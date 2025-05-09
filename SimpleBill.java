interface BillCalculator {
    int calculate();
}

class Product implements BillCalculator {
    int id;
    String name;
    int qty;
    int price;

    Product(int id, String name, int qty, int price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int calculate() {
        return qty * price;
    }

    void print() {
        System.out.println(id + "\t" + name + "\t" + qty + "\t" + price + "\t" + calculate());
    }
}

public class SimpleBill {
    public static void main(String[] args) {
        Product p1 = new Product(101, "A", 2, 25);
        Product p2 = new Product(102, "B", 1, 100);

        int total = p1.calculate() + p2.calculate();

        System.out.println("Order No.: 7");
        System.out.println("Date     : " + java.time.LocalDate.now());
        System.out.println("ID\tName\tQty\tPrice\tTotal");

        p1.print();
        p2.print();

        System.out.println("Net Amount: " + total);
    }
}

