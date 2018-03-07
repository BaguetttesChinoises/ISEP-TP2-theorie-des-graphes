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
		
	}
	

}
