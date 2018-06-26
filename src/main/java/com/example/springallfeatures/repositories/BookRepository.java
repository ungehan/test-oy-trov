package com.example.springallfeatures.repositories;

import com.example.springallfeatures.models.Book;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    List<Book> bookList=new ArrayList<>();

    {
        for(int i=0;i<10;i++){
            Book book=new Book();
            book.setId(i+1);
            book.setTitle("Title..");
            book.setAuthor("Ehan");
            book.setPublisher("pulisher");
            bookList.add(book);
        }
    }
    public List<Book> getAll(){
        return this.bookList;
    }

}
