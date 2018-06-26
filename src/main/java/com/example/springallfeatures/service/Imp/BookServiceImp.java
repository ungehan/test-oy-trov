package com.example.springallfeatures.service.Imp;

import com.example.springallfeatures.models.Book;
import com.example.springallfeatures.repositories.BookRepository;
import com.example.springallfeatures.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    private BookRepository bookRepository;


    @Autowired
    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.getAll();
    }
}
