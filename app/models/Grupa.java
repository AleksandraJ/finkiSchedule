package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Grupa extends Model
{
	//imeto ke bide unique(predmet-godina-nastan-brojGrupa), mozebi ke se koristi kako id
	public String ime;
	
	@ManyToOne
	public Predmet predmet;
	
	@ManyToMany
	public List<Student> studenti;
	
}
