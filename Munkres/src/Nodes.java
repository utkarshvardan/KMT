
public class Nodes {

	private int id=0;
	private String name;
	private boolean visited;
	private int weight;
	

	public Nodes(String name , int weight){
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
	
}
