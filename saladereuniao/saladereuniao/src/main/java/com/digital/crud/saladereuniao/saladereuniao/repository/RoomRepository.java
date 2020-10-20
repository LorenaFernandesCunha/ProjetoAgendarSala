package com.digital.crud.saladereuniao.saladereuniao.repository;

import com.digital.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.digital.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}






