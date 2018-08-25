package com.sda.lukaszrentbook.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservationBook")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reserved_from", nullable = false)
    private LocalDateTime fromDate;
    @Column(name = "reserved_to", nullable = false)
    private LocalDateTime toDate;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private Book book;
}
