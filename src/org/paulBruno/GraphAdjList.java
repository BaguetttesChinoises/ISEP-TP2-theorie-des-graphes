package org.paulBruno;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public void ajouterArete(int u, int v) {
		getNoeud(u).ajouterArete(getNoeud(v));
		getNoeud(v).ajouterArete(getNoeud(u));		
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
	
	public List<Arete> voisins(int v) {
		return getNoeud(v).getAretes();
	}
	
	public int degree(int v) {
		return voisins(v).size();
	}
	
	public double degreeGraph( String type ) {
		List<Integer >listeDegree = new ArrayList<Integer>();
		for (Noeud n : noeuds) {
			listeDegree.add(degree(n.getId()));
		}
		
		if (type=="moyenne") {
			return listeDegree.stream()
					.mapToInt(val -> val)
					.average().getAsDouble();
		}
		else if (type == "minimum") {
			return listeDegree.get(
					listeDegree.indexOf(
							Collections.min(listeDegree)
							)
					);
		}
		else if (type == "maximum") {
			return listeDegree.get(
					listeDegree.indexOf(
							Collections.max(listeDegree)
							)
					);
		}
		else if (type == "densité") {
			return listeDegree.stream()
					.mapToInt(val -> val)
					.average().getAsDouble() / noeuds.size();
			}
		return 0;
	}
	
//	public int getTaille() {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (Noeud n : noeuds) {
//			for (int i=0; i<n.getAretes().size(); i++) {
//				if (list.contains(n.getAretes().get(i))) {}
//				else {
//					int el= (Integer) n.getAretes().get(i).getNoeud().getId();
//					list.add(el);
//				}
//			}
//		}
//		System.out.println(list.toString());
//        Set set = new HashSet() ;
//        set.addAll(list) ;
//        ArrayList distinctList = new ArrayList(set);
//		System.out.println(distinctList.toString());
//        return distinctList.size();
//
//	}
	
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
