package com.example.dao;

import com.example.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GroupRepository extends JpaRepository<Groupe,Long> {
}
