import java.util.ArrayList;
import java.util.List;

public class GraphFlow {

	private int numberofNodes;
	private int numberofEdges;
	private List<List<Edge>> adjList;
	
		
	

	public GraphFlow(int numberofNodes){
		this.numberofNodes=numberofNodes;
		this.numberofEdges=0;
		this.adjList= new ArrayList<>();
		
		for(int i=0;i<numberofNodes;i++){
			List<Edge> eList = new ArrayList<>();
			adjList.add(eList);
		}
	}

	public int getNumberofNodes() {
		return this.numberofNodes;
	}

	public int getNumberofEdges() {
		return this.numberofEdges;
	}
	
	public void addEdge(Edge edge){
		
		Nodes u =edge.getFromNode();
		Nodes v =edge.getToNode();
		u.addNeighbourNode(v);
		adjList.get(u.getId()).add(edge);
		numberofEdges++;
		
	}
	
	public List<Edge> getAdjList(Nodes n) {
		return adjList.get(n.getId());
	}
	
}
