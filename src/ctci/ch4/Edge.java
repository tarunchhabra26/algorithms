package ctci.ch4;

public class Edge {
	private Vertex to;
	private Vertex from;
	private int weight;
	
	public Edge(Vertex to, Vertex from, int weight){
		this.to = to;
		this.from = from;
		this.weight = weight;
	}
	
	public Edge(Vertex to, Vertex from){
		this.to = to;
		this.from = from;
	}
	
	public Vertex getTo() {
		return to;
	}
	public void setTo(Vertex to) {
		this.to = to;
	}
	public Vertex getFrom() {
		return from;
	}
	public void setFrom(Vertex from) {
		this.from = from;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
