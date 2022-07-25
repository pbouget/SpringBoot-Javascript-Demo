package fr.bouget.controleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bouget.bean.Pilote;

/**
 * @author Philippe
 * Pas de Base de données pour cette démo
 *
 */
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/api")
public class PiloteController  {
	
	private List<Pilote> liste = new ArrayList<>();
	
	public PiloteController()
	{
		Pilote p1 = new Pilote(1,"Josselin","Montreuil");
		Pilote p2 = new Pilote(2,"Philippe", "Paris");
		Pilote p3 = new Pilote(3, "Anissa", "Marseille");
		Pilote p4 = new Pilote(4,"Jules","Lille");
		Pilote p5 = new Pilote(5,"Marguerite", "Lyon");
		Pilote p6 = new Pilote(6, "Véronique", "Toulouse");
		Pilote p7 = new Pilote(7,"Philippe","Poutou");
		Pilote p8 = new Pilote(8,"Jean", "Colmar");
		Pilote p9 = new Pilote(9, "Anissa", "Blonville");
		Pilote p10 = new Pilote(10,"Jean","Paris");
		Pilote p11 = new Pilote(11,"Elon", "Strasbourg");
		Pilote p12 = new Pilote(12, "Anne", "Deauville");
		this.liste.add(p1);
		this.liste.add(p2);
		this.liste.add(p3);
		this.liste.add(p4);
		this.liste.add(p5);
		this.liste.add(p6);
		this.liste.add(p7);
		this.liste.add(p8);
		this.liste.add(p9);
		this.liste.add(p10);
		this.liste.add(p11);
		this.liste.add(p12);
	}
	
	/**
	 * Méthode qui retourne la liste des pilotes
	 * @return
	 */
	@GetMapping("/pilotes")
	public List<Pilote> getAll()
	{
		return this.liste;
		
	}

}
