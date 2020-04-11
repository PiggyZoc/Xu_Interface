package com.example.demo.service.impl;


import com.example.demo.dao.ReservationDao;
import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReservationServiceImpl implements ReservationService {


    @Autowired
    ReservationDao reservationDao;

    @Override
    public Map addAnReservation(Reservation reservation) {
        Map result = new HashMap();
        reservation.setIsDeleted(0);
        reservation.setStatus(0);
        reservationDao.save(reservation);
        result.put("code",1);
        result.put("msg","提交成功");
        return result;
    }
}
