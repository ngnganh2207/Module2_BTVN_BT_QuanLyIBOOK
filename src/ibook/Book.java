package ibook;

import java.util.Arrays;

public class Book implements IBook,Comparable<Book> {
    private int id;
    private String name;
    private String publishDate;
    private String Author;
    private String language;
    private float averagePrice;

    public Book() {
    }

    public Book(int id, String name, String publishDate, String author, String language, float averagePrice) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        Author = author;
        this.language = language;
        this.averagePrice = averagePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Thông tin Book bằng toString là {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", language='" + language + '\'' +
                ", averagePrice=" + averagePrice +
                '}';
    }

    @Override
    public void display() {
        System.out.println(" Thông tin Book bằng method display là: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", language='" + language + '\'' +
                ", averagePrice=" + averagePrice +
                '}');
    }


    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
