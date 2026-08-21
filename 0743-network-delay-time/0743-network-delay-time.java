class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] ans=new int[n+1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[k]=0;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[1]-b[1]);
        pq.add(new int[]{k, 0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int vertex=curr[0];
            int weight=curr[1];

            if(weight>ans[vertex]) continue;

            for(int[] node: times){
                if(node[0]!=vertex) continue;

                int nextVertex=node[1];
                int nextWeight=node[2];

                if(ans[vertex]+nextWeight<ans[nextVertex]){
                    ans[nextVertex]=ans[vertex]+nextWeight;
                    pq.add(new int[]{nextVertex, ans[nextVertex]});
                }
            }
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            if (ans[i] == Integer.MAX_VALUE)
                return -1;

            max = Math.max(max, ans[i]);
        }

        return max;
    }
}