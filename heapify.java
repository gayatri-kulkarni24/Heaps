private void heapify(int i){
            int leftChildIdx=2*i+1;
            int rightChildIdx=2*i+2;
            int minIdx=i;
            if(leftChildIdx < arr.size() && arr.get(minIdx) > arr.get(leftChildIdx)){
                minIdx=leftChildIdx;
            }
            if(rightChildIdx < arr.size() && arr.get(minIdx) > arr.get(rightChildIdx)){
                minIdx=rightChildIdx;
            }
            if(minIdx!=i){
                //swap->minidx and i
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
        }
