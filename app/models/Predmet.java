package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Predmet extends Model
{
	@ManyToOne
	public Kurs kurs;
	@ManyToOne
	public Vraboten profesor;
	@ManyToOne
	public Vraboten asistent;
	
	public Predmet()	{}

	public Predmet(Kurs kurs, Vraboten profesor, Vraboten asistent) {
		super();
		this.kurs = kurs;
		this.profesor = profesor;
		this.asistent = asistent;
	}	
	
	
}
