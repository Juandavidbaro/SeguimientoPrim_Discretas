package structure;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {

	private List<List<Edge>> arrayAdjacencyNode;

	public AdjacencyList(int amountNodes) {

		this.arrayAdjacencyNode = new ArrayList<>();

		for (int i = 0; i < amountNodes; i++) {
			arrayAdjacencyNode.add(new LinkedList<>());
		}

	}

	public void setValor(int nodeI, int nodeJ, int weight) {
		if(nodeI==nodeJ) {
			return;
		}
		
		//Se carga doble porque no es dirigido 
		this.arrayAdjacencyNode.get(nodeI).add(new Edge(weight, nodeI, nodeJ));
		this.arrayAdjacencyNode.get(nodeJ).add(new Edge(weight, nodeJ, nodeI));
	}
	
	public List<Edge> getValue(int nodeI) {
		return this.arrayAdjacencyNode.get(nodeI);
	}
	
	public int getValue(int nodeI, int nodeJ) {
		
		for(Edge a: this.arrayAdjacencyNode.get(nodeI)) {
			if(a.getDestinationNode() == nodeJ) {
				return a.getWeight();
			}
		}
		
		return -1;
	}

}