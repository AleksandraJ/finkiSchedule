package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Student extends Model
{
	//format: xxxxyy, xxxx-broj na indeks, yy-poslednite dve cifri od godinata
	@Unique
	public String indeks; 
	//najverojatno kako username ke se koristi indeksot
	//public String username;
	
	public String imePrezime;
	
	//grupata
	@ManyToMany(mappedBy="studenti")
	public List<Grupa> grupi;

	@Override
	public String toString() {
		return "Student [indeks=" + indeks + ", imePrezime=" + imePrezime + "]";
	}
}
