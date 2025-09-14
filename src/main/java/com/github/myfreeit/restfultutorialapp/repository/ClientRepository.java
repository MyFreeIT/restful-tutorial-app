package com.github.myfreeit.restfultutorialapp.repository;

import com.github.myfreeit.restfultutorialapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
