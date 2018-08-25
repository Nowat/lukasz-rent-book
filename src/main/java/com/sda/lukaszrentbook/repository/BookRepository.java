package com.sda.lukaszrentbook.repository;

import com.sda.lukaszrentbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategoryContaining(String category);
}
