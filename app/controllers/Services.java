package controllers;

import models.Grupa;
import models.Nastan;
import models.Prostorija;
import play.mvc.Controller;

public class Services extends Controller {

	public static void nastani(Long id)
	{
		if(id == null)
		{
			renderJSON(Nastan.all().fetch());
		}
		renderJSON(Nastan.findById(id));
	}
	
	public static void prostorii(Long id)
	{
		if(id == null)
		{
			renderJSON(Prostorija.all().fetch());
		}
		renderJSON(Prostorija.findById(id));
	}
	
	public static void grupi(Long id)
	{
		if(id == null)
		{
			renderJSON(Grupa.findAll());
		}
		renderJSON(Grupa.findById(id));
	}
}
