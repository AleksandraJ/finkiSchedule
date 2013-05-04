package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Vraboten extends Model
{
	//emailot ke bide unique, mozebi ke se koristi kako id
	@Unique
	public String email;
	public String imePrezime;
	public String titula;
	
	@OneToMany(mappedBy="profesor")
	public List<Predmet> predmetiProfesor;
	
	@OneToMany(mappedBy="asistent")
	public List<Predmet> predmetiAsistent;
	
	@OneToMany(mappedBy="odgovoren")
	public List<Nastan> nastani;
	
	public Vraboten()	{}

	public Vraboten(String email, String imePrezime) {
		super();
		this.email = email;
		this.imePrezime = imePrezime;
	}

	@Override
	public String toString() {
		return "Vraboten [email=" + email + ", imePrezime=" + imePrezime + "]";
	}	
}
