package com.sda.lukaszrentbook.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "receipts")
@Data
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, name = "client")
    private String client;

    @Past
    @Column(nullable = false, name = "date")
    private LocalDateTime date;

    @NotNull
    @Column(nullable = false, name = "CategoryType")
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

//  @OneToMany(mappedBy = "receipt-create")
//  private List<Product> products;

    @Size(min = 1)
    //@ManyToMany(cascade = CascadeType.ALL)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "receipt_books",
            joinColumns = @JoinColumn(name = "receipt_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "book_id", nullable = false))
    private List<Book> books;
}

