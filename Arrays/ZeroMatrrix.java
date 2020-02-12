package Arrays;

public class ZeroMatrrix {
	
    static int[][] createMatrix(int  rows, int columns)
    {
    	int[][] matrix = new int[rows][columns];
    	int[][] newMatrix=new int[matrix.length][matrix[0].length];
    	int count = 0;
    	for(int i =0;i<matrix.length;i++)
    	{
    		for(int j = 0;j<matrix[i].length;j++)
    		{
    			count++;
    			matrix[i][j] = count;
    		}
    	}
    	return matrix;
    }
    static void printMatrix(int[][] matrix)
    {
    	 for(int i =0;i<matrix.length;i++)
	    	{
	    		for(int j = 0;j<matrix[i].length;j++)
	    		{
	    			if(matrix[i][j]<10)
	    			{
	    				System.out.print(matrix[i][j]+"     ");	
	    			}
	    			else if(matrix[i][j]<100)
	    			{
	    				System.out.print(matrix[i][j] + "    ");	
	    			}
	    		}
	    		System.out.println();
	    	}
    }
    
    static void FindZero(int[][] matrix)
    {
    	boolean[] row = new boolean[matrix.length];
    	boolean[] col = new boolean[matrix[0].length];
    	
    	for(int i =0;i<matrix.length;i++)
    	{
    		for(int j = 0;j<matrix[i].length;j++)
    		{
    			if(matrix[i][j] == 0)
    			{
    				row[i] = true;
    				col[j] = true;
    			}   			
    		}
    	}
    	
    	for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				fillrow(matrix, i);
			}
		}
		
		// Nullify columns
		for (int j = 0; j < col.length; j++) {
			if (col[j]) {
				fillcol(matrix, j);
			}
		}
    }

	private static void fillcol(int[][] matrix, int col) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
	private static void fillrow(int[][] matrix, int row) {
		// TODO Auto-generated method stub
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,6,3,2},
				{2,0,4,1},
				{5,9,3,0}
		};
		
		System.out.println("Original Matrix");
		System.out.println("----------------------");
		printMatrix(matrix);
		FindZero(matrix);
		System.out.println("Zero Matrix");
		System.out.println("----------------------");
		printMatrix(matrix);
	}

}
