package com.sda.lukaszrentbook.service;

import com.sda.lukaszrentbook.exception.NotFoundException;
import com.sda.lukaszrentbook.model.ReservationBooks;
import com.sda.lukaszrentbook.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationBooks reservationBooksCreate(ReservationBooks reservationBooks) {
        return reservationRepository.save(reservationBooks);
    }

    public ReservationBooks getById(Long id) {
        Optional<ReservationBooks> reservationBooksOptional = reservationRepository.findById(id);
        if (!reservationBooksOptional.isPresent()) {
            throw new NotFoundException(String.format("Reservation with id %s doues not exists", id));
        }
        return reservationBooksOptional.get();
    }

    public void delete(Long id) {
        if (!reservationRepository.existsById(id)) {
            throw new NotFoundException(String.format("Reservation with id %s doues not exists", id));
        }
        reservationRepository.deleteById(id);

    }

    public List<ReservationBooks> getAll() {
        return reservationRepository.findAll();
    }
}
