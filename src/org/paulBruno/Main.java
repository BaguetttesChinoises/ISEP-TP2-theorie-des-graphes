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

		System.out.println("taille du graphe (nombre d'aretes) = ");
		
//		System.out.println("Question 2.1.4");
//		graph.ajouterArete(4, 4);
//		System.out.println(graph.toString());

		System.out.println("Question 2.1.5");
		System.out.println("voisins de "+1+" = "+ graph.voisins(1).toString());

		System.out.println("Question 2.1.6");
		System.out.println("degrée de "+1+" = "+ graph.degree(1));
		
		System.out.println("Question 2.1.6.1");
		System.out.println("degrée minimum = ");
		System.out.println(graph.degreeGraph("minimum"));
		
		System.out.println("degrée maximum = ");
		System.out.println(graph.degreeGraph("maximum"));
		
		System.out.println("degrée moyen = ");
		System.out.println(graph.degreeGraph("moyenne"));
		
		System.out.println("densité = edge-density = degrée moyen/nb de noeuds ");
		System.out.println(graph.degreeGraph("densité"));
		//le graph est sparse car il a peu d'aretes
		
		System.out.println("Question 2.1.6.2");
		graph.isolatedNodes();
		
		System.out.println("Question 2.1.6.3");
		graph.graphLoop();

		







		
	}
	

}
