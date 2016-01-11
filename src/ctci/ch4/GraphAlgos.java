package ctci.ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphAlgos {
	
	public static void main(String args[]){
		GraphAlgos graphAlgo = new GraphAlgos();
		Graph graph = graphAlgo.createGraph();
		System.out.println("DFS Traversal");
		graphAlgo.DFSTraversal(graph);
		System.out.println("BFS Traversal");
		graphAlgo.BFSTraversal(graph);
		
	}
	
	private Graph createGraph(){
		List<Vertex> vertices = new ArrayList<Vertex>();
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<Edge> edges = new ArrayList<Edge>();
		Edge e1 = new Edge(v1, v2);
		Edge e2 = new Edge(v1,v3);
		Edge e3 = new Edge(v2,v3);
		Edge e4 = new Edge(v2,v4);
		Edge e5 = new Edge(v3,v5);
		Edge e6 = new Edge(v4,v5);
		Edge e7 = new Edge(v3,v4);
		Edge e8 = new Edge(v4,v6);
		Edge e9 = new Edge(v5,v6);
		
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		edges.add(e4);
		edges.add(e5);
		edges.add(e6);
		edges.add(e7);
		edges.add(e8);
		edges.add(e9);
		
		Graph graph = new Graph(vertices, edges);
		
		return graph;
	}
	
	private void BFSTraversal(Graph graph){
		List<Vertex> visited = new ArrayList<Vertex>();
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		List<Vertex> vertices = graph.getVertices();
		List<Edge> edges = graph.getEdges();
		
		Vertex currentVertex = vertices.get(0);
		queue.add(currentVertex);
		visited.add(vertices.get(0));
		
		
		while(queue.size() > 0){
			Vertex newVertex = null;
			for (Edge edge : edges){
				if (queue.peek() == edge.getTo()){
					newVertex = edge.getFrom();
				}
				else if (queue.peek() == edge.getFrom()){
					newVertex = edge.getTo();
				}
				
				if (!visited.contains(newVertex) && newVertex != null ){
					visited.add(newVertex);
					break;
				} else {
					newVertex = null;
				}
			}
			if (newVertex == null)
				queue.remove();
			else{
				queue.add(newVertex);
				//currentVertex = newVertex;
			}
				
		}
		
		//Print the visited edges
		for (Vertex v : visited)
			System.out.println(v.getVertexData());
	}
	
	//Traverse graph using DFS algo
	private void DFSTraversal(Graph graph){
		List<Vertex> visited = new ArrayList<Vertex>();
		Stack<Vertex> stack = new Stack<Vertex>();
		
		List<Vertex> vertices = graph.getVertices();
		List<Edge> edges = graph.getEdges();
		
		Vertex currentVertex = vertices.get(0);
		stack.push(currentVertex);
		visited.add(vertices.get(0));
		
		
		while(stack.size() > 0){
			Vertex newVertex = null;
			for (Edge edge : edges){
				if (stack.peek() == edge.getTo()){
					newVertex = edge.getFrom();
				}
				else if (stack.peek() == edge.getFrom()){
					newVertex = edge.getTo();
				}
				
				if (!visited.contains(newVertex) && newVertex != null ){
					visited.add(newVertex);
					break;
				} else {
					newVertex = null;
				}
			}
			if (newVertex == null)
				stack.pop();
			else{
				stack.push(newVertex);
				//currentVertex = newVertex;
			}
				
		}
		
		//Print the visited edges
		for (Vertex v : visited)
			System.out.println(v.getVertexData());
	}

}
