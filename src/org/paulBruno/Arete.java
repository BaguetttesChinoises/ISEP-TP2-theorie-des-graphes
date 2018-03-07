package org.paulBruno;

public class Arete {
	// mettre le poids en parametre par default du constructeur
	int poids = 1;
	Noeud noeud;
	
	public Arete (Noeud _b) {
		noeud = _b;
	}
	
	public Arete (Noeud _b, int _poids) {
		noeud = _b;
		this.poids = _poids;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public Noeud getNoeud() {
		return noeud;
	}

	public void setNoeud(Noeud b) {
		this.noeud = b;
	}
	
	public String toString () {
		String affichage="";
		affichage += this.noeud.getId();
		return affichage;
	}
	
	
	
}
