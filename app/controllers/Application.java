package controllers;

import play.*;
import play.data.Upload;
import play.mvc.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
        
      //to pass attributes to the template
    	//renderArgs.put("grupi", grupi);
    	//to get HTML parametars
    	//Map<String, String[]> htmlParam = params.all();
    }
    
    public static void adminGrupa()
    {
    	List<Grupa> grupi = Grupa.findAll();
    	
    	render(grupi);
    }
    
    public static void uploadFile(Upload myfile) {
    	if (myfile != null) {
    		Logger.info("Got a file");
    	} else {
    		Logger.info("Myfile is empty");
    	}
    	Logger.info("Title: " + myfile.asFile().getName());
    	
    	
    	//we will read that file
    	try (BufferedReader br = new BufferedReader(new FileReader(myfile.asFile())))
		{
 
			String sCurrentLine;
 
			while ((sCurrentLine = br.readLine()) != null) {
				Logger.info("%s\n", sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	redirect("Application.adminGrupa");
    }
}