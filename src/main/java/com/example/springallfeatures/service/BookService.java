package com.example.springallfeatures.service;

import com.example.springallfeatures.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public List<Book> getAll();
}
