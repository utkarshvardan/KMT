import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class KMT {
 
	private boolean [] visited;
	private Edge[] edgeTo;
	private int vMaxFlow;
	 
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\input.txt");
		FileToGraph ft=new FileToGraph();
		
		
		int [][]w=ft.ReadMatrixFromFile(file);
		
		int numberOfnodes= ft.getRow()+ft.getCol();
		GraphFlow gf=new GraphFlow(numberOfnodes);
		ArrayList<Nodes> nodArrX = new ArrayList<Nodes>();
		ArrayList<Nodes> nodArrY = new ArrayList<Nodes>();
		for(int t=1;t<=ft.getRow(); t++){
			nodArrX.add(new Nodes("x"+String.valueOf(t),t,0)); //
			
		}
		for(int u=1;u<=ft.getCol();u++){
			nodArrY.add(new Nodes("y"+String.valueOf(u),u,0));//
		}
		
		for(int a=0;a<nodArrX.size();a++){

		System.out.println(nodArrX.get(a).getName()+","+nodArrX.get(a).getWeight());
		}
		for(int i=0;i<ft.getRow();i++){
			int max = Integer.MIN_VALUE;
			for(int j=0;j<ft.getCol();j++){
				gf.addEdge(new Edge(nodArrX.get(i), nodArrY.get(j),w[i][j]));
				if(w[i][j]> max){
					max=w[i][j];
				}
				
			}
			nodArrX.get(i).setWeight(max);
		}
		for(int a=0;a<nodArrX.size();a++){
		System.out.println(gf.getAdjList(nodArrX.get(a)));
		
		}	
		 
	 
		
	}
	
	private boolean AugPath(GraphFlow gFlow, Nodes u, Nodes v){
		edgeTo = new Edge[gFlow.getNumberofNodes()];
		visited= new boolean[gFlow.getNumberofNodes()];
		Queue<Nodes> q= new LinkedList<>();
		q.add(u);
		visited[u.getId()]= true;
		
		while (!q.isEmpty() && !visited[v.getId()]){
			Nodes s = q.remove();
			for(Edge e: gFlow.getAdjList(s)){
				Nodes t= e.getOther(s);
				
				if(e.getWeight()>0){  //-------------------------------------------Check if the actual weight for the edge*t* is coming
					if(!visited[t.getId()]){
						edgeTo[t.getId()]=e;
						visited[t.getId()]=true;
						q.add(t);
					}
				}
			}
		}
		return visited[v.getId()];
		
	}
	
	
		
}
