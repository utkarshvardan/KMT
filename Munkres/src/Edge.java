
public class Edge {

	private Nodes fromNode;
	private Nodes toNode;
	private final int weight;
	
	public Edge(Nodes fromNode, Nodes toNodes, int weight){
		this.fromNode=fromNode;
		this.toNode=toNodes;
		this.weight=weight;
		
	}
	public Edge(Edge edge){
		this.fromNode=edge.getFromNode();
		this.toNode=edge.getToNode();
		this.weight=edge.getWeight();
	}
	public Nodes getFromNode() {
		return fromNode;
	}

	public void setFromNode(Nodes fromNode) {
		this.fromNode = fromNode;
	}

	public Nodes getToNode() {
		return toNode;
	}

	public void setToNode(Nodes toNode) {
		this.toNode = toNode;
	}


	public int getWeight() {
		return weight;
	}
	
	public String toString(){
		return "("+fromNode+","+toNode+")"+weight;
	}
	
	public Nodes getOther(Nodes node){
		if(node== fromNode){
			return toNode;
		} else
		{
			return fromNode;
		}
	}
	

	
		
}
