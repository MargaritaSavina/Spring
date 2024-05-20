package seminars.sem4.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;
import seminars.sem4.models.Book;

import java.util.*;

@Repository
@Data

public class Library {

    private List<Book> books = new ArrayList<>();

    public Library(){
        books.add(new Book("Анна Каренина","Л.Н.Толстой",1877));
        books.add(new Book("Собачье сердце","М.Булгаков",1925));
        books.add(new Book("Дочь снегов","Д.Лондон",1902));

    }

    public void addbook(Book b){
        books.add(b);
    }



}