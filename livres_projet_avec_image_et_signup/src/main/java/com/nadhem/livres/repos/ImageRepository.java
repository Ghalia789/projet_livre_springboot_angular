package com.nadhem.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nadhem.livres.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long>{

}
