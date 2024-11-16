public class MyArrayList {
    int capacity;
    int noOfItems;
    int[] items;

    //Constructor

    public MyArrayList() {
        capacity = 5; //Default;
        noOfItems = 0;
        items = new int[capacity];
    }

    private int[] doublingArr(int[] arr){
        capacity *= 2;
        int[] tempArr = new int[capacity];

        for(int i = 0; i<arr.length; i++){
            tempArr[i] = arr[i];
        }

        return tempArr;
    }

    public void add(int e){
        if(noOfItems >= capacity){
            items = doublingArr(items);
        }
        items[noOfItems] = e;
        noOfItems++;
    }

    public void add(int pos, int e){
        if(noOfItems >= capacity){
            items = doublingArr(items);
        }
        for(int i = noOfItems; i>pos; i--){
            items[i] = items[i-1];
        }

        items[pos] = e;
        noOfItems++;
    }

    public void remove(int pos){
        for (int i = pos; i<noOfItems;i++){
            items[i] = items[i+1];
        }

        items[noOfItems--] = 0;
    }

    public int indexOf(int e){
        for (int i=0; i<noOfItems; i++){
            if(items[i] == e){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return noOfItems == 0;
    }

    public int first(){
        return items[0];
    }

    public int last(){
        return items[noOfItems-1];
    }

    public int get(int pos){
        return items[pos];
    }

    public void set(int pos, int e){
        items[pos] = e;
    }

    public int size(){
        return capacity;
    }

    public void print(){
        System.out.println("Print List: ");

        for(int i=0; i < noOfItems; i++){
            System.out.print(items[i] + " ");
        }
        System.out.println();

    }
}
