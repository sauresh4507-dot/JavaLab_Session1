class Books
{
    public String bookname;
    public String author;
    public int price;
    public int quantity;
    public Books(String bookname, String author, int price, int quantity)
    {
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    public void display()
    {
        System.out.println("Book name is " + bookname);
        System.out.println("Author is " + author);
        System.out.println("Price is " + price);
        System.out.println("Quantity is " + quantity);
    }
}
public class book
{
    public static void main(String args[]){
        Books b1=new Books("Java", "James Gosling", 100, 10);
        b1.display();
    }
}