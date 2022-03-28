package lesson13.homework.bookstorage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
@XmlRootElement(name = "book")
@XmlType(propOrder = {"article", "name", "publishYear", "series"})
public class Book {
    private String article;
    private String name;
    private int publishYear;
    private List<Book> series;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @XmlElement(name = "title")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @XmlElement(name = "analog")
    public List<Book> getSeries() {
        return series;
    }

    public void setSeries(List<Book> series) {
        this.series = series;
    }

    public Book() {

    }

    public Book(String article, String name, int publishYear, List<Book> series) {
        this.article = article;
        this.name = name;
        this.publishYear = publishYear;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Book{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", series=" + series +
                '}';
    }
}
