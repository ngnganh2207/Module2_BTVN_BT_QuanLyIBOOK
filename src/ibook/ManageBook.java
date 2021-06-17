package ibook;

import java.util.Arrays;

public class ManageBook {
    static Book[] books = new Book[0];



    //static books[1]= new Book();
    //giả sử gán books[1]= new Book();
    static void insertBook(Book book) {

        Book[] bookNew = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            bookNew[i] = books[i];
        }
        bookNew[bookNew.length - 1] = book;
        books = bookNew;
    }

    static void sort() {
        Arrays.sort(books);
    }

    static void removeBook(int id) {
        if (books.length > 0) {
            Book[] bookNew = new Book[books.length - 1];
            int index = -1;
            for (int i = 0; i < books.length; i++) {
                if (books[i].getId() == id) {
                    index = i;
                    break;
                }
            }
            for (int j = 0; j < index; j++) {
                bookNew[j] = books[j];
            }
            for (int k = index; k < bookNew.length - 1; k++) {
                bookNew[k] = books[k + 1];
            }
            books = bookNew;
        }
    }
    static void update(int id, String name, String publishDate, String author, String language, float averagePrice){
        for(Book b:books){
            if(b.getId()==id && b.getName().equals(name)){
                b.setPublishDate(publishDate);
                b.setAuthor(author);
                b.setLanguage(language);
                b.setAveragePrice(averagePrice);
            }
        }
    }
    static void search(String name){
        for(Book b:books){
            if(b.getName().equals(name)){
                System.out.println(b);
                break;
            }
        }
    }
}
