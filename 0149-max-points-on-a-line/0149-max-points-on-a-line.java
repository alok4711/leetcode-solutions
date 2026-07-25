class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1||points.length==2) return points.length;
        
        int ans=0;
        for(int i = 0; i < points.length; i++){
            HashMap<String, Integer> hm=new HashMap<>();
            int max = 0;
            for (int j = i + 1; j < points.length; j++){
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;
                if (dx == 0) {
                    dy = 1;
                }
                else if (dy == 0) {
                    dx = 1;
                }
                else if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }
                String key = dx + "/" + dy;

                hm.put(key, hm.getOrDefault(key, 0) + 1);
                max = Math.max(max, hm.get(key));
            }
            ans = Math.max(ans, max + 1);
        }
        
        return ans;
    }
    int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}