class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int l=0;
        int r=list.size();
        int mid=(l+r)/2;
        while(l<r){
            mid=(l+r)/2;
            if(list.get(mid)<num) l=mid+1;
            else r=mid;
        }
        list.add(r, num);
    }
    
    public double findMedian() {
        if(list.size()%2!=0) return list.get(list.size() / 2);
        else return (list.get(list.size() / 2) + list.get((list.size() / 2)-1))/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */