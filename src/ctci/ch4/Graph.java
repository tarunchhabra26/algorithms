package ctci.ch4;

import java.util.List;

public class Graph {
	private List<Vertex> vertices;
	private List<Edge> edges;
	private boolean isDirected;

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}

	public Graph(List<Vertex> vertices,List<Edge> edges){
		this.vertices = vertices;
		this.edges = edges;
	}
	
	public Graph(List<Vertex> vertices,List<Edge> edges,boolean isDirected){
		this.vertices = vertices;
		this.edges = edges;
		this.isDirected = isDirected;
	}
}
