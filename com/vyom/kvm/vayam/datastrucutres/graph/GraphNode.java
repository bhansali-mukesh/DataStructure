package com.vyom.kvm.vayam.datastrucutres.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {

	int data;
	List<GraphNode> connections;

	public GraphNode(int data) {
		this.data = data;
		connections = new LinkedList<GraphNode>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<GraphNode> getConnections() {
		return connections;
	}

	public void setConnections(List<GraphNode> connections) {
		this.connections = connections;
	}
	
	public void addEdge(GraphNode to) {
		connections.add(to);
	}
	
	public GraphNode add(int data) {
		GraphNode node = new GraphNode(data);
		connections.add(node);
		return node;
	}

	public String toString() {
		return data + "";
	}
}
