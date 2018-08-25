package com.sda.lukaszrentbook.model;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "book_properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String authorName;
    @Column(nullable = false)
    private String authorSurname;
    @Column(name = "publishing_house", nullable = false)
    private String publishingHouse;
    @Column(nullable = false)
    private LocalDate productionYear;


    @OneToMany(mappedBy = "bookProperties")
    private List<Book> bookList;
}
