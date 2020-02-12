package Arrays;

public class RotateMatrix {
	
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
	
	static int[][] rotateMatrixBy90DegreeClockwise(int[][] matrix) 
	{
		 
		int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix
		 
		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];
		 
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[0].length; j++) 
			{
				rotatedMatrix[j][ (totalColsOfRotatedMatrix -1)- i] = matrix[i][j]; 
			}
		}
		return rotatedMatrix;
	}
	
    static int[][] rotateMatrixBy90DegreeCounterClockwise(int[][] matrix) 
	{
		int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix
		 
		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];
		 
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[0].length; j++) 
			{
				rotatedMatrix[j][ (totalColsOfRotatedMatrix-1)- i] = matrix[i][j]; 
			}
		}
		return rotatedMatrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = createMatrix(4,5);
		System.out.println("Original Matrix");
		System.out.println("----------------------");
		printMatrix(matrix);
		
		int[][] rotatedMatrix = rotateMatrixBy90DegreeClockwise(matrix);
		System.out.println("Rotated Matrix");
		System.out.println("----------------------");
		printMatrix(rotatedMatrix);
		

	}

}
