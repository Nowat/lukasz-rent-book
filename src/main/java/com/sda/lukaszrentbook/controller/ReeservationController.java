package com.sda.lukaszrentbook.controller;

import com.sda.lukaszrentbook.model.ReservationBooks;
import com.sda.lukaszrentbook.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReeservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReservationBooks create(ReservationBooks reservationBooks) {
        return reservationService.reservationBooksCreate(reservationBooks);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationBooks> getAll (){
    return reservationService.getAll();

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Long id){
    reservationService.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReservationBooks getById (Long id){
        return reservationService.getById(id);
    }

}
