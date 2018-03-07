package org.paulBruno;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Scanner;

public class GraphFactory {
	
	public static GraphAdjList createGraphFromTextFile( String path) {
		GraphAdjList graph = new GraphAdjList();
		
		try(Scanner scan = new Scanner (
				FileSystems.getDefault().getPath(path))) {
			//lecture du fichier
			while(scan.hasNextInt()) {
				int u = scan.nextInt();
				int v = scan.nextInt();
				System.out.println("u=" + u + " v= " + v);
				
				graph.ajouterNoeud(new Noeud(u));
				graph.ajouterNoeud(new Noeud(v));
				
				graph.ajouterArete(u, v);
				

			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return graph;
	}

}
