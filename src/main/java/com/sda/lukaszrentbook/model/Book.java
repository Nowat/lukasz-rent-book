package com.sda.lukaszrentbook.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_category", nullable = false)
    private String category;
    @Column(name = "book_format", nullable = false)
    private String format;
    @Column(nullable = false)
    private Integer price;



    @ManyToOne
    @JoinColumn(name = "id_book_class")
    private BookClass bookClass;

    @ManyToOne
    @JoinColumn(name = "id_book_properties")
    private BookProperties bookProperties;

    public void updateFrom(Book book) {
    }
}
