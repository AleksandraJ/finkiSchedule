package models;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Nastan extends Model
{
	public String vremeOd;
	public String vremeDo;
	public String datum;
	public String opis;
	
	@ManyToOne
	public Prostorija prostorija;
	
	@ManyToOne
	public Grupa grupa;
	
	@ManyToOne
	public Vraboten odgovoren;
	
	@ManyToOne
	public Nastan osnoven;
	
	@OneToMany(mappedBy="osnoven")
	public List<Nastan> izvedeni;
	
	public Nastan() {}

	public Nastan(String vremeOd, String vremeDo, String datum, String opis) {
		super();
		this.vremeOd = vremeOd;
		this.vremeDo = vremeDo;
		this.datum = datum;
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Nastan [vremeOd=" + vremeOd + ", vremeDo=" + vremeDo
				+ ", datum=" + datum + ", opis=" + opis + ", prostorija="
				+ prostorija + ", grupa=" + grupa + ", odgovoren=" + odgovoren
				+ ", osnoven=" + osnoven + ", izvedeni=" + izvedeni + "]";
	}
	
	
}
