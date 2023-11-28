package com.nadhem.livres.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Genre {
	
	
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGen;

    @NotNull
    private String nomGen;

    private LocalDate dateCreation;

    @JsonIgnore
    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private List<Livre> livres;

   
}
