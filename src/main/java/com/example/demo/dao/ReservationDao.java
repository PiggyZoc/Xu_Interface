package com.example.demo.dao;


import com.example.demo.model.Reservation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationDao {
    @Insert("INSERT INTO `test`.`m_reservation`(`reservation_no`,`service_type`,`client_name`,`contact_name`,`contact_tel`,`address`,`product_name`,`remark`,`create_time`,`update_time`,`is_deleted`,`status`)VALUES(#{reservationNo},#{serviceType},#{clientName},#{contactName},#{contactTel},#{address},#{productName},#{remark},#{createTime},#{updateTime},#{isDeleted},#{status})")
    int save(Reservation reservation);
}
