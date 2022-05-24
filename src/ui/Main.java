package ui;

import java.util.Scanner;
import structure.PrintPrim;
import structure.SGrafo;

public class Main {

	
	private Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Main mn=new Main();
		mn.start();

	}

	public void start() {
		System.out.println("Enter the numbers of Edges");
		int edge = sc.nextInt();
		
		SGrafo gPrim = new SGrafo(edge);
		int count=edge;
		int i =1;
		while(count>=0) {
			System.out.println("*Ingrese el " + i + " dato:");
			System.out.println("Enter the node 1");
			int n1=sc.nextInt();
			System.out.println("Enter the node 2");
			int n2=sc.nextInt();
			System.out.println("Enter the weight");
			int w=sc.nextInt();
			
			gPrim.setValue(n1, n2,w);
			i++;
			count--;
		}
		
		PrintPrim salida = gPrim.calculatePrim();
		salida.toString();
	}
}
