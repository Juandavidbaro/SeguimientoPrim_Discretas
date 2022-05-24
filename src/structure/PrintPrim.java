package structure;

import java.util.List;

public class PrintPrim {	
	private int totalWeight;
	private List<Edge> treeCostMinimum;
	
	
	public PrintPrim(int totalWeight, List<Edge> treeCostMinimum) {
		this.totalWeight = totalWeight;
		this.treeCostMinimum = treeCostMinimum;
	}


	@Override
	public String toString() {
		System.out.println("Peso total: " + this.totalWeight);
		System.out.println("Arbol: ");
		for(Edge e: this.treeCostMinimum) {
			System.out.println("[Edge: " + e.getDestinationNode() + "] , [" + e.getOriginNode()  + "]  --> Peso: " + e.getWeight());
		}
		return null;
	}
	
	
	

}
