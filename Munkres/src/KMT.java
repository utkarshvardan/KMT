import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class KMT {
 
	 
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\input.txt");
		FileToGraph ft=new FileToGraph();
		
		int [][]w=ft.ReadMatrixFromFile(file);
		ArrayList<Nodes> nodArr = new ArrayList<Nodes>();
		for(int t=0;t<ft.getRow(); t++){
			nodArr.add(new Nodes("x"+String.valueOf(t),1));
			
		}
		System.out.println("x"+String.valueOf(2));
		
			
			
	 
		
	}
		
}
