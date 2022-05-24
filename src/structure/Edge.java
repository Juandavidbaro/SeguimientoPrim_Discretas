package structure;

public class Edge implements Comparable<Edge> {

	private int weight;
	private int originNode;
	private int destinationNode;

	public Edge(int weight, int originNode, int destinationNode) {
		this.weight = weight;
		this.originNode = originNode;
		this.destinationNode = destinationNode;
	}
	
		
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getOriginNode() {
		return originNode;
	}

	public void setOriginNode(int originNode) {
		this.originNode = originNode;
	}

	public int getDestinationNode() {
		return destinationNode;
	}

	public void setDestinationNode(int destinationNode) {
		this.destinationNode = destinationNode;
	}

	@Override
	public String toString() {
		return "Arista [weight=" + weight + ", originNode=" + originNode + ", destinationNode=" + destinationNode + "]";
	}

	@Override
	public int compareTo(Edge otra) {
		return this.weight - otra.weight;
	}

}
