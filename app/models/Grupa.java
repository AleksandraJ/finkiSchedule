package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Grupa extends Model
{
	//imeto ke bide unique(predmet-godina-nastan-brojGrupa), mozebi ke se koristi kako id
	@Unique
	public String ime;
	
	@ManyToOne
	public Predmet predmet;
	
	@ManyToMany
	public List<Student> studenti;

	@Override
	public String toString() {
		return "Grupa [ime=" + ime + ", predmet=" + predmet + ", studenti="
				+ studenti + "]";
	}
}
