package leetcode;

public class MatrixTranspose {
	
    public static int[][] transpose(int[][] matrix) {
        
        int[][] result = new int[matrix[0].length][matrix.length];
    	
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
    	
    	return result;
    }

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
		
		int[][] result = transpose(matrix);
		
		System.out.println("Transpose of Matrix:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

	}

}
