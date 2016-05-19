public class Rotate {
	public static void rotateAnticlockwise(char[][] matrix){
		int n=matrix.length;
		if (n <= 1) {
	        return; // nothing to do
	    }
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-i-1;j++){
				char saved=matrix[i][j];
				matrix[i][j]=matrix[j][n-i-1];
				matrix[j][n-i-1]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[n-j-1][i];
				matrix[n-j-1][i]=saved;
			}
			
		}
		
	}
	
	
	public static void rotateClockwise(char a[][]) {
	    int n = a.length;
	    if (n <= 1) {
	        return; // nothing to do
	    }

	    /* layers */
	    for (int i = 0; i < n / 2; i++) {
	        /* elements */
	        for (int j = i; j < n - i - 1; j++) {
	            char saved = a[i][j];
	            a[i][j] = a[n - j - 1][i];
	            a[n - j - 1][i] = a[n - 1 - i][n - 1 - j];
	            a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
	            a[j][n - 1 - i] = saved;
	        }
	    }
	}
	public static void main(String[] args){
		char matrix[][] = new char[][] { {'A', 'B', 'C', 'D' },
				{ 'E', 'F', 'G', 'H' }, {'I','J','K','L'},{'M', 'N', 'O', 'P'}};
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		rotateClockwise(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		rotateAnticlockwise(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}