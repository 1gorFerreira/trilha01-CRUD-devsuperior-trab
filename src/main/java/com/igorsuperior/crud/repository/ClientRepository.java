package com.igorsuperior.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorsuperior.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
