package com.example.springallfeatures.controller;

import com.example.springallfeatures.models.Book;
import com.example.springallfeatures.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    @GetMapping({"/index","/","home"})
    @RequestMapping(value = {"/index","/","home"},method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("books",bookService.getAll());
        return "book/index";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Integer id,Model model){
        System.out.println(id);
        Book books =this.bookService.findOne(id);
        model.addAttribute("book",books);
        return "book/view";
    }

    @GetMapping("/update/{book_id}")
    public String update(@PathVariable("book_id") Integer id,Model model){
        System.out.println("ID"+id);
        Book books =this.bookService.findOne(id);

        model.addAttribute("book",books);

        return "book/update";
    }

    @PostMapping("update/submit")
    public String updateSubmit(@ModelAttribute Book book){
        System.out.println(book);
        return "";
    }

}
