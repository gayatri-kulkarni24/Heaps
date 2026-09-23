public int remove(){
            //remove 1st node
            int data=arr.get(0);
            //swap 1st and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //remove last element
            arr.remove(arr.size()-1);
            //fix heap
            heapify(0);
            return data;
        }
