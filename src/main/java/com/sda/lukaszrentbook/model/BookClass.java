package com.sda.lukaszrentbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "book_class")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;}
