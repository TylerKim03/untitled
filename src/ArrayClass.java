public class ArrayClass {
    public static void main(String[] args) {

        array array = new array(3);
        array.addLast(4);
        array.addLast(5);
        array.addLast(6);
        array.addLast(7);
        array.addLast(8);
        array.addLast(9);
        array.addLast(10);
        int result = array.recursiveBinarySearch(8,0,array.getLength()-1);
        System.out.println(result);



       /* array.addLast(4);
        array.addFrist(5);
        array.addFrist(3);
        array.print(); // 2 4 5
        System.out.println("length = " + array.getLength());
        array.removeAt(0);
        array.reverse();
        array.print();
        System.out.println(array.indexOf(5));
        System.out.println(array.indexOf(0));

        array a3 = new array
        array a1 = new array(3);
        array a2 = new array(4);
*/
    }
}
