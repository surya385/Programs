package programs;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] spiral = new int[6][6]; 
		int value = 1; int maxRow=3; 
		int minRow=0; int maxCol=3; int minCol=0; 
		while(value<=16){
		for(int col=minCol;col<=maxCol; col++){
		spiral[minRow][col] = value; 
		value++; } 
		for(int row=minRow+1; row<=maxRow; row++){
		spiral[row][maxCol] = value; 
		value++; }
		for(int col=maxCol-1;col>=minCol;col--){
		spiral[maxRow][col] = value; value++;}
		for(int row=maxRow-1;row>=minRow+1;row--){
		spiral[row][minCol] = value; value++; }
		maxRow--; 
		minRow++; maxCol--; minCol++;
		} 
		for(int row=0; row<=3; row++)
		{
		for(int col=0; col<=3; col++)
		{
		System.out.print(spiral[row][col]+"\t"); 
		}
		System.out.println(); 
		} 
	
	}
}
