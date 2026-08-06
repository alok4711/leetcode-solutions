class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack=new Stack<>();
        String[] arr = preorder.split(",");
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i].equals("#") && stack.isEmpty() && i==n-1) return true;
            if(arr[i].equals("#")){
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
            else stack.push(arr[i]);
        }
        return false;
    }
}