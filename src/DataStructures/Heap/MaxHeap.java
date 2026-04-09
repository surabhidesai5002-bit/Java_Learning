package DataStructures.Heap;

import java.util.Arrays;

public class MaxHeap {

    int[] arr;//to store the heap elements
    int maxSize;//max size of heap
    int heapSize;//current no of heap elements

    MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.heapSize = 0;
    }

    //helper functions to find parent left and right child
    int parent(int i){return (i-1)/2; }
    int leftChild(int i){ return 2*i+1;}
    int rightChild(int i){ return 2*i+2;}
    void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //heapify or heap sort
    void heapify(int i){
        int leftChild = leftChild(i);
        int rightChild = rightChild(i);
        int largest = i;

        if(leftChild< heapSize && arr[leftChild]>arr[largest]){
            largest = leftChild;
        }

        if(rightChild< heapSize && arr[rightChild]>arr[largest]){
            largest = rightChild;
        }

        if(largest!=i){
            swap(i,largest);
            heapify(largest);
        }
    }

    //Insert
    void insert(int key){
        if(heapSize==maxSize){
            System.out.println("OverFlow ! cannot insert any more elements.");
            return;
        }

        heapSize++;
        int i = heapSize-1;
        arr[i] = key;

        /*heapify up used only onspot so we use that inside functions only while in case of heap sort and increase we
        use them several times so we created sseprate functions and call them when needed*/

        while(i > 0 && arr[parent(i)] < arr[i]){
            swap(i, parent(i));
            i=parent(i);
        }
    }

    //Extract
    int extractMax(){
        if(heapSize<=0){
            return Integer.MIN_VALUE;
        }
        int root = arr[0];
        arr[0]=arr[heapSize-1];
        heapSize--;
        heapify(0);
        return root;
    }

    void increaseKey(int i,int newVal){
        arr[i]= newVal;

        //Heapify up
        while(i>0 && arr[parent(i)]<arr[i]){
            swap(i, parent(i));
            i=parent(i);
        }
    }
    //remove
    void remove(int i){
        increaseKey(i, Integer.MAX_VALUE);
        extractMax();
    }

    int getMax(){
        if(heapSize>0){
            return arr[0];
        }
        return Integer.MAX_VALUE;
    }

    void printHeap(){
        System.out.println(Arrays.toString(Arrays.copyOf(arr,heapSize)));
    }
}

class Driver{
    static void main(String[] args) {
        MaxHeap mh = new MaxHeap(10);
        mh.insert(3);
        mh.insert(10);
        mh.insert(12);
        mh.insert(8);
        mh.insert(2);
        mh.insert(14);

        System.out.println("Maximum element is " + mh.getMax());
        System.out.println("Extracted element is " + mh.extractMax());
        System.out.print("Heap : ");
        mh.printHeap();


    }
}
