import java.util.List;

public class Nodes {

	private int id;
	private String name;
	private boolean visited;
	private int weight;
	private List <Nodes> neighbourList;
	
    
	
	
	public Nodes( String name, int id , int weight){
		this.id=id;
		this.name=name;
		this.weight=weight;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public String toString(){
		return this.id+"-"+this.name;
	}
	public List<Nodes> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Nodes> neighbourList) {
		this.neighbourList = neighbourList;
	}
	
	public void addNeighbourNode(Nodes n){
		this.neighbourList.add(n);
	}
	
}
