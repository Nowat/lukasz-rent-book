package com.sda.lukaszrentbook.service;

import com.sda.lukaszrentbook.exception.NotFoundException;
import com.sda.lukaszrentbook.exception.ValidationException;
import com.sda.lukaszrentbook.model.Book;
import com.sda.lukaszrentbook.model.BookProperties;
import com.sda.lukaszrentbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    @Autowired
    private BookRepository bookRepository;

    public Book create(Book book){
        return bookRepository.save(book);
    }

    public Book getById (Long id){
        Optional<Book> book = bookRepository.findById(id);
        if (!book.isPresent()){
            throw new NotFoundException(String.format("Book with id %s does not exists", id));
        }
        return book.get();
    }

    public List<Book> search(String category, String format, Integer minPrice, Integer maxPrice){
        if (maxPrice == null){
            maxPrice = Integer.MAX_VALUE;
        }
        return bookRepository.findByCategoryContainingIgnoreCaseAndFormatContainingAndPriceBetween(category, format, minPrice, maxPrice);
//                dowiedziec sie jak to ma dalej isc z szukaniem
    }

    public void delete (Long id){
        if (!bookRepository.existsById(id)){
            throw new NotFoundException(String.format("Book with id %s does not exists", id));
        }
        bookRepository.deleteById(id);
    }

    public Book add(Book book){
        if (book.getId() == null){
            throw new ValidationException(" Id can not be null ");
        }
        books.add(book);
        return book;
    }


}
