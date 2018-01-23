
public class Knapsack01 {
	
	static int[] val = {60, 100, 120};
	static int[] weights = {10, 20, 30};
	
	public static int recKnap(int itemNum, int totWt) {
		if(itemNum == 0 || totWt == 0) return 0;
		if(weights[itemNum - 1] > totWt) {
			return recKnap(itemNum - 1, totWt);
		} else {
			return Math.max(recKnap(itemNum - 1, totWt), 
					val[itemNum - 1] + recKnap(itemNum - 1, totWt - weights[itemNum - 1]));
		}
	}
	
	public static int knapsackDP(int n, int W) {
		int[][] knap = new int[n+1][W+1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= W; j++) {
				if( i == 0 || j == 0) knap[i][j] = 0;
				else if(weights[i-1] > j) knap[i][j] = knap [i-1][j];
				else {
					knap[i][j] = Math.max(val[i - 1] + knap[i -1][j - weights[i - 1]], knap[i-1][j]);
				}
			}
		}
		
		return knap[n][W];
	}
	
	public static void main(String[] args) {
		//System.out.println(recKnap(val.length, 25));
		System.out.println(knapsackDP(val.length, 50));
	}

}
