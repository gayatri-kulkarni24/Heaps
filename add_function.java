static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int X=arr.size()-1; //child idx
            int par=(X-1)/2;  //parent idx
            while(arr.get(X)< arr.get(par)){
                //swap
                int temp=arr.get(X);
                arr.set(X,arr.get(par));
                arr.set(par,temp);
            }
            X=par;
            par=(X-1)/2;
        }
}
