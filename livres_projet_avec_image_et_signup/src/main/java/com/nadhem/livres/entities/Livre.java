package com.nadhem.livres.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;

@Entity
public class Livre {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivre;
    
    @NotNull
    private String titreLivre;
    
    @NotNull
    private String auteurLivre;
    
    @Min(1)
    private Double prixLivre;
    
    private Integer quantiteStock;
    
    @Temporal(TemporalType.DATE)
    private Date datePublication;

    @ManyToOne
    private Genre genre;
    
    @OneToOne
    private Image image;

    public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    
    public Livre() {
    	super();
    }

    public Livre(String titreLivre, String auteurLivre, Double prixLivre, Integer quantiteStock, Date datePublication) {
        this.titreLivre = titreLivre;
        this.auteurLivre = auteurLivre;
        this.prixLivre = prixLivre;
        this.quantiteStock = quantiteStock;
        this.datePublication = datePublication;
    }

    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public String getAuteurLivre() {
        return auteurLivre;
    }

    public void setAuteurLivre(String auteurLivre) {
        this.auteurLivre = auteurLivre;
    }

    public Double getPrixLivre() {
        return prixLivre;
    }

    public void setPrixLivre(Double prixLivre) {
        this.prixLivre = prixLivre;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    

    @Override
    public String toString() {
        return "Livre{" +
                "idLivre=" + idLivre +
                ", titreLivre='" + titreLivre + '\'' +
                ", auteurLivre='" + auteurLivre + '\'' +
                ", prixLivre=" + prixLivre +
                ", quantiteStock=" + quantiteStock +
                ", datePublication=" + datePublication +
                '}';
    }
}
