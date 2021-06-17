package ibooktoanchua;

import java.util.Arrays;
import java.util.Scanner;

public class ManageBook {
    static Book[] books = new Book[0];
    static Scanner scanner = new Scanner(System.in);

    public static void insert() {
        Book book = create();
        Book[] booksNew = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            booksNew[i] = books[i];
        }
        booksNew[books.length] = book;
        books = booksNew;
    }

    public static int fillByName(String name){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void remove(String name) {
        int index = fillByName(name);
        if (index > 0) {
            Book[] booksNew = new Book[books.length - 1];
            for (int i = 0; i < books.length - 1; i++) {
                if (i < index) {
                    booksNew[i] = books[i];
                } else {
                    booksNew[i] = books[i + 1];
                }
            }
            books = booksNew;
        }else {
            System.out.println("không có name là : " + name);
        }
    }

    public static void update(int index){
        Book book = create();
        books[index] = book;
    }

    public static void search(String name){
        int index = fillByName(name);
        if (index>= 0){
            books[index].display();
        }else {
            System.out.println("không có tên là : " + name);
        }
    }
    public static void sort(){
        Arrays.sort(books);
    }


    public static Book create() {
        System.out.println("nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name:");
        String name = scanner.nextLine();
        System.out.println("nhập publishDate:");
        String publishDate = scanner.nextLine();
        System.out.println("nhập author:");
        String author = scanner.nextLine();
        System.out.println("nhập language:");
        String language = scanner.nextLine();
        System.out.println("nhập averagePrice:");
        float averagePrice = Float.parseFloat(scanner.nextLine());
        Book book = new Book(id, name, publishDate, author, language, averagePrice);
        return book;
    }

}
