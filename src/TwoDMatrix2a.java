
public class TwoDMatrix2a {
	
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int len = matrix.length;
	        int wid = matrix[0].length;
	        return search(matrix, target, len-1, wid-1, 0, 0 );
	    }
	    
	    public boolean search(int[][] matrix, int target, 
	                          int top, int left, int bottom, int right) {
	        System.out.println("top: " + top);
	        System.out.println("left: " + left);
	        System.out.println("bottom: " + bottom);
	        System.out.println("right: " + right);
	        System.out.println();
	        if(top == bottom && left == right){
	            if(matrix[left][top] == target) return true;
	            return false;
	        }
	        int _top = binsrchTop(matrix, target, top, bottom, left);
	        int _left = binsrchLeft(matrix, target, left, right, top);
	        int _bottom = binsrchBot(matrix, target, top, bottom, right);
	        int _right = binsrchRight(matrix, target, left, right, bottom);
	        top = _top; left = _left; bottom = _bottom; right = _right;
	        return search(matrix, target, top, left, bottom, right);
	        
	    }
	    
	    public int binsrchBot(int[][] matrix, int target, int top/*end*/, int bot/*start*/, int row) {
	        // System.out.println("top: " + top);
	        // System.out.println("bot: " + bot);
	        // System.out.println("row: " + row);
	        int m = bot + (top - bot)/2;
	        while(top >= bot) {
	            m = bot + (top - bot)/2;
	            if(matrix[row][m] > target) {
	                top = m - 1;
	            } else if(matrix[row][m] < target) {
	                bot = m + 1; 
	            } else break;
	            // System.out.println("m: " + m);
	        }
	        return m;
	    }
	    
	    public int binsrchTop(int[][] matrix, int target, int top/*end*/, int bot/*start*/, int row) {
	        // System.out.println("top: " + top);
	        // System.out.println("bot: " + bot);
	        // System.out.println("row: " + row);
	        int m = bot + (top - bot)/2;
	        while(top >= bot) {
	            m = bot + (top - bot)/2;
	            if(matrix[row][m] > target) {
	                top = m - 1;
	            } else if(matrix[row][m] < target) {
	                bot = m + 1; 
	            } else break;
	            // System.out.println("m: " + m);
	        }
	        return m;
	    }
	    
	    public int binsrchLeft(int[][] matrix, int target, int r/*end*/, int l/*start*/, int col) {
	        // System.out.println("top: " + r);
	        // System.out.println("bot: " + l);
	        // System.out.println("row: " + col);
	        int m = l + (r - l)/2;
	        while(r >= l) {
	            m = l + (r - l)/2;
	            if(matrix[m][col] > target) {
	                r = m - 1;
	            } else if(matrix[m][col] < target) {
	                l = m + 1; 
	            } else break;
	            // System.out.println("m: " + m);
	        }
	        return m;
	    }
	    
	    public int binsrchRight(int[][] matrix, int target, int r/*end*/, int l/*start*/, int col) {
	        // System.out.println("top: " + r);
	        // System.out.println("bot: " + l);
	        // System.out.println("row: " + col);
	        int m = l + (r - l)/2;
	        while(r >= l) {
	            m = l + (r - l)/2;
	            if(matrix[m][col] > target) {
	                r = m - 1;
	            } else if(matrix[m][col] < target) {
	                l = m + 1; 
	            } else break;
	            // System.out.println("m: " + m);
	        }
	        return m;
	    }

}
