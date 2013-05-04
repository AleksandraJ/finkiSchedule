package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Kurs extends Model
{
	//format: kratenka od imeto na predmetot Pr. Mrezno Programiranje = mp
	@Unique
	public String ime;
	//format: celosnoto ime na predmetot Pr. Mrezno programiranje
	public String opis;
	public String semestar;
	public String krediti;
	//site predmeti imaat kod. Kodot se bara vo prijavite?
	
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

	@Override
	public String toString() {
		return "Kurs [ime=" + ime + ", opis=" + opis + ", semestar=" + semestar
				+ ", krediti=" + krediti + ", predmeti=" + predmeti + "]";
	}	
}
