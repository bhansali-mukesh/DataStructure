package com.vyom.kvm.vayam.datastrucutres.graph;

public class Main {

	public static void main(String[] args) {

		Graph graph = new Graph(34);

		GraphNode N23 = graph.add(23);
		GraphNode N43 = N23.add(43);
		GraphNode N90 = N43.add(90);
		GraphNode N70 = N23.add(70);
		N70.addEdge(N23);
		GraphNode N80 = N43.add(80);
		GraphNode N85 = N23.add(85);
		N85.addEdge(N90);
		N70.addEdge(N85);
		N85.addEdge(graph.getRoot());

//		graph.DFS();
//		System.out.println();
//		
//		graph.DFS(N70, new HashSet<GraphNode>());
//		System.out.println();
//		
//		graph.BFS();
//		System.out.println();
//		
//		graph.BFS(N70);
//		System.out.println();

//		graph.findDFS(80);
		
		int distance = graph.findDFS(N70, 23);
		
		System.out.println(distance);
	}

}
