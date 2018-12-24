public class CrazyBot {
    boolean[][] grid = new boolean[100][100];
    double[] percentage = new double[4];
    int[] vx = new int[]{1, -1, 0, 0};
    int[] vy = new int[]{0, 0, -1, 1};
    
    int row = 0;
    int col = 0;
    
    public double getProbability(int n, int east, int west, int south, int north) {
        percentage = new double[]{ east/100, west/100, south/100, north/100 };
        
        return recursive(50, 50, n);
    }
    
    private double recursive(int x, int y, int n) {
        if (grid[x][y]) return 0;
       	if (n == 0) return 1;
        
        double ret = 0;        
        for (int i = 0; i < percentage.length; i++) {
            ret += recursive(x + vx[i], y + vy[i], n - 1) * percentage[i];
        }
        grid[x][y] = true;
        
        return ret;
    }
}
