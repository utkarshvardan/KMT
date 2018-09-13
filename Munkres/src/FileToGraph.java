import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileToGraph {
	
	int row;
	int col;
	int w[][];
	

	public int[][] getW() {
		return w;
	}


	public void setW(int[][] w) {
		this.w = w;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public  int[][] ReadMatrixFromFile (File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int size=0;
		
		String line = null;
		 row = 0;
		while ((line = br.readLine()) != null) {
			
		//System.out.println(line);
		String[] column = line.split(" ");
		if(w== null){
		size=column.length;
		w=new int [size][size];
		}
			for ( col = 0; col<size; col++)
			{
				
				 w[row][col]=Integer.parseInt(column[col]);
				 
			}
			row++;
			
		
			
		}
		
		return w;
	 
		
	}
}
