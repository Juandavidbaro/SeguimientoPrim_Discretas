package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class SGrafo {
	private List<Node> nodes;
	private int amountNodes;
	private AdjacencyList adjacencyList;

	public SGrafo(int amountNodes) {
		this.amountNodes = amountNodes;
		this.nodes = new ArrayList<>();

		for (int i = 0; i < amountNodes; i++) {
			nodes.add(new Node(i));
		}

		this.adjacencyList = new AdjacencyList(amountNodes);
	}

	public void setValue(int nodoI, int nodoJ, int peso) {
		this.adjacencyList.setValor(nodoI, nodoJ, peso);
	}

	public PrintPrim calculatePrim() {
		List<Integer> connectedNodes = new LinkedList<>();
		int totalWeight = 0, currentNode = 0;
		PriorityQueue<Edge> queueNodeEdge = new PriorityQueue<>();
		List<Edge> treeCostMinimum = new LinkedList<>();
		Edge aristaAux;
		
		//Se agrega el nodo sin analizar
		connectedNodes.add(currentNode);

		while (connectedNodes.size() != this.amountNodes) {
			for (Edge e : this.adjacencyList.getValue(currentNode)) {
				queueNodeEdge.add(e);
			}

			// Se necesita una arista que NO esté en el conjunto solucion
			// La cola extrae la de menor peso
			aristaAux = queueNodeEdge.poll();
			while (connectedNodes.contains(aristaAux.getDestinationNode())) {
				aristaAux = queueNodeEdge.poll();
			}
			
			currentNode = aristaAux.getDestinationNode();
			treeCostMinimum.add(aristaAux);
			// Se acumula el peso y se agrega 
			totalWeight += aristaAux.getWeight();
			connectedNodes.add(currentNode);
			
		}

		return new PrintPrim(totalWeight, treeCostMinimum);
	}

}