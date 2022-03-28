package lesson13.homework.bookstorage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        List<Book> analog = new ArrayList();
        for (int i = 0; i < 3; i++) {
            analog.add(new Book("WED1546HJ"+i,"Name Book "+i,1954+i,null));
        }
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("123456789","El gim Bu",2000, analog));
        bookList.add(new Book("987654321","Iko hi",1988, analog));
        bookList.add(new Book("561234987","Yong Tit",2022, analog));
        bookList.add(new Book("894567123","Blum Bool",1959, analog));
        Bookstore bookstore = new Bookstore();
        bookstore.setBookList(bookList);
        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Write to System.out
        m.marshal(bookstore, System.out);
        // Write to File
        m.marshal(bookstore, new File(BOOKSTORE_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
        List<Book> list = bookstore2.getBooksList();
        for (Book book : list) {
            System.out.println("Book: " + book.getName() + " from "
                    + book.getArticle()+book.getPublishYear());
        }

    }
}
