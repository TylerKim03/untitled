import java.lang.reflect.Array;

public class array implements Comparable {

    private int length;
    private int atIndex = 0;
    int array[];
    private int a[];
    private int b[];

    public array(int length){
        this.length = length;
        array = new int[length];
    }
    public array(int a[], int b[]){


    }

    public void removeAt(int index){
        if (index >= 0 && index < atIndex--) {
            int[] tempArray = new int [--length];
            int tempI = 0;
            for(int i = 0; i<=length; i++){
                if(i != index)
                    tempArray[tempI++] = array[i];
            }
            array = tempArray;
        }else
            throw new IllegalArgumentException(" Index out of bounds.");
    }

    public void addLast(int item){
    if(atIndex == length) {
        length++;
        int[] tempArray = new int[length];
        for (int i = 0; i < array.length; i++)
            tempArray[i] = array[i];
        array = tempArray;
    }
    array[atIndex++] = item;

    }
    public void addLast(int... items)    {
        for(int item: items)
            addLast(item);
    }
    public void print(){
        for (int i =0; i<atIndex; i++){
            System.out.println(array[i]);
        }
    }

    public int indexOf(int item) {
        for (int i = 0; i < atIndex; i++)
            if (array[i] == item)
                return i;
            return -1;

    }


    public void length(){

    }

    public int getLength()  {
        return atIndex;
    }

    public void reverse(){
        int [] tempArray = new int[length];
        for(int i = 0; i< length; i++)
            tempArray[length -i -1 ]= array[i];
        array = tempArray;
    }

    public void addFrist(int item){
        if (atIndex ==length)
            length++;
        int[] tempArray = new int[length];
        for (int i = 0; i<atIndex; i++)
            tempArray[i+1] = array[i];
        array = tempArray;
        array[0] = item;
        atIndex++;
    }

    public void addFirst(int... items){
        for (int i = items.length -1; i >= 0; i--){
            addFirst(items[i]);
        }
    }
    public static int[] arraySort(int[] arr){
        int[] res = new int[arr.length];
        int[]	workingCopy = new int [arr.length];
        arrayCopy(arr, workingCopy);

        for (int i = 0; i<res.length; i++) {
            int minIndex = arrayMinIndex(workingCopy);
            res[i] = workingCopy[minIndex];
            workingCopy[minIndex] = Integer.MAX_VALUE;
        }

        return res;
    }

    public static int arrayMinIndex(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i< arr.length; i++){
            int cur = arr[i];
            if (cur < min) {
                min = cur;
                minIndex = -1;
            }
        }
        return minIndex;
    }



    public static void arrayCopy(int[] a1, int[] a2){
        for(int i = 0; i<a1.length; i++){
            a2[i] = a1[i];
        }
    }




    @Override
   /* public int compareTo(int []a1, int[] a2) {
        if(a1.length==a2.length){
            int count=0;
            for (int i = 0; i <a1.length; i++) {
                if(a1[i]==a2[i]){
                    count++;
                }

            } if(count == a1.length){
                return 0;
            }
        }
        else{

        }
        return -1;
    }*/
    public int compareTo(Object o){
        array otherArray = (array) o;
        if (otherArray.getLength() == getLength()){
            for (int i = 0; i < getLength(); i++) {
                if(array[i] != otherArray.array[i])
                    return -1;
            }
            return 0;
        }
        return -1;
    }
    public int lastIndexOf(int item) {
        int lastIndex = 0;
        for (int i = array.length; i >= 0; i--) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int item)   {
        int start = 0;
        int last = array.length-1;
        int middle;

          while(true){
              middle = (start+last)/2;
              if(item == array[middle])  {
                  return middle;
              }else if(item>array[middle]){
                  start = middle;

              } else if (item<array[middle]){
                  last = middle;

              }

              if (start==last-1 && array[start] != item && array[last]!= item){
                  return -1;
              }

          }

    }
    public int recursiveBinarySearch(int item, int lower_boundary, int upper_boundary){
        int middle =  (lower_boundary+upper_boundary)/2;

        if (lower_boundary==upper_boundary-1 && array[lower_boundary] != item && array[upper_boundary]!= item){
            return -1;
        }
        if(item == array[middle])  {
            return middle;
        }else if(item>array[middle]){
             return recursiveBinarySearch(item, middle, upper_boundary);

        } else if (item<array[middle]){
           return recursiveBinarySearch(item, lower_boundary,middle);

        }

        return -1;
    }





}
