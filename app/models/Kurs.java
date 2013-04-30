package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Kurs extends Model
{
	public String ime;
	public String opis;
	public String semestar;
	public String krediti;
	
	@OneToMany(mappedBy="kurs")
	public List<Predmet> predmeti;
	
	public Kurs()	{}

	public Kurs(String ime, String opis, String semestar, String krediti) {
		super();
		this.ime = ime;
		this.opis = opis;
		this.semestar = semestar;
		this.krediti = krediti;
	}		
}
