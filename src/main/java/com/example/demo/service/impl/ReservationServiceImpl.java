package com.example.demo.service.impl;


import com.example.demo.dao.ReservationDao;
import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {


    @Autowired
    ReservationDao reservationDao;

    @Override
    public int addAnReservation(Reservation reservation) {
        reservation.setIsDeleted(0);
        reservation.setStatus(0);
        return reservationDao.save(reservation);
    }
}
