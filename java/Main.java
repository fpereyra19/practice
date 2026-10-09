import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997);
        Book book2 = new Book("Dune", "Frank Herbert", 1965);
        Book book3 = new Book("Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 1954);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNow add your own book. Enter the title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author: ");
        String author = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = Integer.parseInt(scanner.nextLine().trim());

        Book userBook = new Book(title, author, year);
        System.out.println(userBook);

        scanner.close();

    }
}
