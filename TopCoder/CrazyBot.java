public class CrazyBot {
    double result = 0;
    double[] percentage = new double[4];
    int cnt = 0;
    int row = 0;
    int col = 0;
    
    public double getProbability(int n, int east, int west, int south, int north) {
        percentage = new double[]{ east/100, west/100, south/100, north/100 };
        cnt = n;
        for (int i = 0; i < percentage.length; i++) {
            recursive(0, 1, percentage[i]);
        }
        
        return result;
    }
    
    private void recursive(int j, double finalPercent, double pcnt) {
        if (j == cnt) {
            result += finalPercent;
        } else if (finalPercent == 0) {
        } else {
            j++;
            for (int i = 0; i < percentage.length; i++) {
                finalPercent *= pcnt;
            	recursive(j, finalPercent, percentage[i]);
            }
        }
    }
}
