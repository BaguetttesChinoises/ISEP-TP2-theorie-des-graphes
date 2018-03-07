package org.paulBruno;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphAdjList {

	private int nbDeNoeuds;
	private int nbAretes;
	private List<Noeud> noeuds;

	
	GraphAdjList() {
		noeuds = new ArrayList<Noeud>();
	}
	
	public void ajouterNoeud(Noeud _n) {
		for (Noeud n : noeuds) {
			if (n.getId() == _n.getId())
			{
				return;
			}
		}
		this.noeuds.add(_n);
	}

	public List<Noeud> getNoeuds() {
		return noeuds;
	}
	
	public Noeud getNoeud(int i) {
		for (Noeud n : noeuds) {
			if (n.getId() == i)
			{
				return n;
			}
		}
		return null;
	}
	
	public void setNoeuds(List<Noeud> noeuds) {
		this.noeuds = noeuds;
	}

	public int getNbDeNoeuds() {
		return nbDeNoeuds;
	}

	public void setNbDeNoeuds(int nbDeNoeuds) {
		this.nbDeNoeuds = nbDeNoeuds;
	}

	public int getNbAretes() {
		return nbAretes;
	}

	public void setNbAretes(int nbAretes) {
		this.nbAretes = nbAretes;
	}
	
	public String toString() {
		String affichage="";
		for(Noeud noeud : noeuds) {
			//affiche l'id du noeud
			affichage += noeud.getId()+"=>"+"Aretes= ";
			//affiche le liste d'arrete contenue dans ce noeud
			affichage += noeud.toString();
			affichage += "\n";
		}
		return affichage;
	}
	
	
}
