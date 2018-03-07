package org.paulBruno;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Question 2.1.2");
		GraphAdjList graph = GraphFactory.createGraphFromTextFile("graph.txt");
		System.out.println(graph.toString());
		
		System.out.println("Question 2.1.3");
		System.out.print("ordre du graphe (nombre de noeuds) = ");
		System.out.println(graph.getNoeuds().size());

		System.out.print("taille du graphe (nombre d'aretes) = ");
		
		System.out.println("Question 2.1.4");
		graph.ajouterArete(1, 4);
		System.out.println(graph.toString());

		


		
	}
	

}
