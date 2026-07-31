class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int totalArea=(ax2-ax1)*(ay2-ay1);
        totalArea+=(bx2-bx1)*(by2-by1);
        int x = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int y = Math.min(ay2, by2) - Math.max(ay1, by1);
        if(x<1 || y<1) return totalArea;
        totalArea-=x*y;
        return totalArea;
    }
}