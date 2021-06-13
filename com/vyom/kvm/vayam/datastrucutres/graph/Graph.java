package com.vyom.kvm.vayam.datastrucutres.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Graph {

	private GraphNode root;

	public Graph() {
		root = null;
	}

	public Graph(int data) {
		root = new GraphNode(data);
	}

	public GraphNode getRoot() {
		return root;
	}

	public void setRoot(GraphNode root) {
		this.root = root;
	}

	public GraphNode add(int data) {
		GraphNode node = new GraphNode(data);
		root.connections.add(node);
		return node;
	}

	public void DFS() {
		DFS(root, new HashSet<GraphNode>());
	}

	public void DFS(GraphNode node, Set<GraphNode> visited) {

		System.out.print(node + ", ");
		visited.add(node);

		for (GraphNode connection : node.connections) {
			if (!visited.contains(connection)) {
				DFS(connection, visited);
			}
		}
	}
	
	public void findDFS(int data) {
		findDFS(root, new HashSet<GraphNode>(), data, 0, new ArrayList<GraphNode>());
	}
	
	public int findDFS(GraphNode node, int data) {
		return findDFS(node, new HashSet<GraphNode>(), data, 0, new ArrayList<GraphNode>());
	}
	
	public int findDFS(GraphNode node, Set<GraphNode> visited, int data, int distance, ArrayList<GraphNode> path) {

		if(node.data == data) {
			System.out.println(path);
			System.out.println( distance);
			return distance;
		}
		
		path.add(node);
		distance++;
		
		visited.add(node);

		for (GraphNode connection : node.connections) {
			if (!visited.contains(connection)) {
				int shortest = findDFS(connection, visited, data, distance, path);
				if(distance == 0 || shortest < distance) {
					distance = shortest;
				}
			}
		}
		path.remove(node);
		
		return distance;
	}

	public void BFS() {
		BFS(root);
	}

	public void BFS(GraphNode node) {

		Set<GraphNode> visited = new HashSet();

		LinkedList<GraphNode> queue = new LinkedList();

		visited.add(node);
		queue.add(node);

		while (!queue.isEmpty()) {

			GraphNode graphNode = queue.poll();
			System.out.print(graphNode + ", ");

			for (GraphNode connection : graphNode.connections) {
				if (!visited.contains(connection)) {
					visited.add(connection);
					queue.add(connection);
				}
			}
		}

	}

	public boolean findFrom(GraphNode node, int data) {

		Set<GraphNode> visited = new HashSet();

		LinkedList<GraphNode> queue = new LinkedList();

		visited.add(node);
		queue.add(node);

		while (!queue.isEmpty()) {

			GraphNode graphNode = queue.poll();
			if (graphNode.getData() == data)
				return true;

			for (GraphNode connection : graphNode.connections) {
				if (!visited.contains(connection)) {
					visited.add(connection);
					queue.add(connection);
				}
			}
		}
		return false;
	}

}