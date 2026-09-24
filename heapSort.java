public static void heapSort(int arr[]){
        //build maxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            maxHeapify(arr,i,n);
        }
        //swap last and first
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeapify(arr,0,i);
        }
}

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
