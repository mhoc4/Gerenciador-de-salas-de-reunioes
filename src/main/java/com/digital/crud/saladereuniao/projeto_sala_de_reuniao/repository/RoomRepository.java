package com.digital.crud.saladereuniao.projeto_sala_de_reuniao.repository;

import com.digital.crud.saladereuniao.projeto_sala_de_reuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends  JpaRepository<Room, Long> {

}
