package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Prostorija extends Model
{
	//kandidat za PK, format: unique(grad-zgrada-brojka)
	//@Id
	@Unique
	public String IDS;
	public String ime;
	public int longitude;
	public int latitude;
	public String zgrada;
	public String kat;
	public int x, y;
	public int width, height;
	
	@OneToMany(mappedBy="prostorija")
	public List<Nastan> nastani;
	
	public Prostorija()	{}

	public Prostorija(String iD, String ime, int longitude, int latitude,
			String zgrada, String kat, int x, int y, int width, int height) {
		super();
		IDS = iD;
		this.ime = ime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.zgrada = zgrada;
		this.kat = kat;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Prostorija [ID=" + IDS + ", ime=" + ime + ", zgrada=" + zgrada
				+ ", kat=" + kat + "]";
	}
}
