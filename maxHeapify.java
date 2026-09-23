public static void maxHeapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left < size && arr[maxIdx] < arr[left]){
            maxIdx=left;
        }
        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx=right;
        }
        if(i!=maxIdx){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            maxHeapify(arr,maxIdx,size);
        }
    }
