package com.confonet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.confonet.entity.CrzAgendaDetailsDto;

@Repository
public interface CrzAgendaDetailsRepository extends JpaRepository<CrzAgendaDetailsDto, Integer>{

}
