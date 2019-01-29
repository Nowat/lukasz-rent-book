package com.sda.lukaszrentbook.repository;

import com.sda.lukaszrentbook.model.ReservationBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationBooks, Long> {
}
