package com.example.demo.controller;

import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/ReservationApi")
public class ReservationController {
    @Resource
    ReservationService reservationService;

    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = "/save")
    public int save(Reservation reservation){
        return reservationService.addAnReservation(reservation);
    }

}
