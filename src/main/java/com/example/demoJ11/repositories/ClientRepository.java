package com.example.demoJ11.repositories;

import com.example.demoJ11.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
