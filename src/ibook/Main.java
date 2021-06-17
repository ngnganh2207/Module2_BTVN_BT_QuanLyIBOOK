package ibook;

import java.util.Scanner;

/*      1. Tạo một interface có tên IBook chứa những phương thức trừu tượng sau đây:
        void Display();
        void sort();
        2. Tạo lớp có tên Book có:
        ID (int)
        Name (String)
        PublishDate (String)
        Author (String)
        Language (String)
        AveragePrice (float) – Read only property
        Triển khai interface Ibook.
        - Display cho hiển thị toàn bộ thông tin của Book.
        - sort sắp xếp sách theo name.
        3. Tạo lớp ManageBook chứa phương thức quản lý book.
        - tạo ra 1 mảng Book[] chứa các đối tượng.
        Tạo hàm Insert
        Tạo hàm Remove
        Tạo hàm Update
        Tạo hàm Search – tìm kiếm theo tên sách.
        Tạo hàm Sort – sắp xếp theo name sách.
        4. Tạo ra lớp chứa hàm main để quản lý theo Menu sau:
        BOOK MANAGEMENT SYSTEM
        1.Insert
        2.Remove
        3. Update
        4. Search
        5. Sort
        6. Exit (edited)
*/
public class Main {
    Book book1=new Book();

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("BOOK MANAGEMENT SYSTEM");
            System.out.println("0. Show Book");
            System.out.println("1. Insert Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update");
            System.out.println("4.Search");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            int choice= Integer.parseInt(scanner.nextLine());
//            if(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6){
//                System.out.println("Nhập lại");
//                continue;
//            }
            if(choice==6){
                break;
            }
            switch (choice){
                case 0:
                  for( Book b: ManageBook.books){
                      b.display();
                  }
                  break;
                case 1:
                    System.out.println("Nhập id");
                    int id= Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name");
                    String name= scanner.nextLine();
                    System.out.println("Nhập publishDate");
                    String publishDate= scanner.nextLine();
                    System.out.println("Nhập author");
                    String author= scanner.nextLine();
                    System.out.println("Nhập language");
                    String language= scanner.nextLine();
                    System.out.println("Nhập averagePrive");
                    float averagePrice= Float.parseFloat(scanner.nextLine());
                    Book book= new Book(id,name,publishDate,author,language,averagePrice);
                    ManageBook.insertBook(book);
                    break;
                case 2:
                    System.out.println("Nhập ID");
                    int id1= Integer.parseInt(scanner.nextLine());
                    ManageBook.removeBook(id1);
                    break;
                case 3:
                    System.out.println("Nhập id");
                    int id3= Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name");
                    String name3= scanner.nextLine();
                    System.out.println("Nhập publishDate");
                    String publishDate3= scanner.nextLine();
                    System.out.println("Nhập author");
                    String author3= scanner.nextLine();
                    System.out.println("Nhập language");
                    String language3= scanner.nextLine();
                    System.out.println("Nhập averagePrive");
                    float averagePrice3= Float.parseFloat(scanner.nextLine());
                    ManageBook.update(id3,name3,publishDate3,author3,language3,averagePrice3);
                    break;
                case 4:
                    System.out.println("Nhập tên cần search");
                    String name4= scanner.nextLine();
                    ManageBook.search(name4);
                    break;
                case 5:
                    ManageBook.sort();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
