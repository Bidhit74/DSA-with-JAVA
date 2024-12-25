public class Question3 {
    public static void main(String[] args) {
        System.out.println("Total books: " + Book.count); // 0
        Book book1 = new Book(100);
        Book book2 = new Book(200);
        System.out.println("Book1 price: " + book1.price + " book2 price: " + book2.price);
        System.out.println("Total books: " + Book.count); // 2
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

