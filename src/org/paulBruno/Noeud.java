package org.paulBruno;

import java.util.ArrayList;
import java.util.List;

public class Noeud {
	private int id;
	private List<Arete> aretes;
	
	public Noeud(int _id) {
		id = _id;
		this.aretes = new ArrayList<Arete>();
	}
	
	public void ajouterArete(Noeud n) {
		for (Arete arete : aretes) {
			if (arete.getNoeud().getId()== n.getId())
			{
				return;
			}
		}
		this.aretes.add(new Arete(n));
	}

	public int getId() {
		return id;
	}
	
	public boolean isIsolate() {
		if (this.aretes.size() == 0) return true;
		else return false;
	}
	
	public boolean isLooped() {
		for (Arete arete : aretes) {
			if (arete.getNoeud().getId() == this.id) {
				return true;
			}
		}
		return false;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Arete> getAretes() {
		return aretes;
	}

	public void setAretes(List<Arete> aretes) {
		this.aretes = aretes;
	}
	
	public String toString() {
		String affichage="";
		affichage += this.aretes.toString();
		return affichage;
	}
}
