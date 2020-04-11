package com.example.demo.controller;

import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping(value = "/ReservationApi")
public class ReservationController {
    @Resource
    ReservationService reservationService;

    @PostMapping("/save")
    public Map save(Reservation reservation){
        return reservationService.addAnReservation(reservation);
    }

}
