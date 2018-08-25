package com.sda.lukaszrentbook.controller;

import com.sda.lukaszrentbook.model.Book;
import com.sda.lukaszrentbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book bookCreate(@RequestBody Book book) {
        return bookService.create(book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getById(@PathVariable Long id) {
        return bookService.getById(id);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<Book> search(@RequestParam(value = "category", defaultValue = "")String category,
//                             @RequestParam(value = "format", defaultValue = "") String format,
//                             @RequestParam(value = "minPrice", defaultValue = "0") Integer minPrice,
//                             @RequestParam(value = "maxPrice", required = false) Integer maxPrice){
//        return bookService.search(category,format,minPrice,maxPrice);
//    }
// pamietac zeby wrocic do bookservisu i zrobic po czym nastepuje szukanie
}
