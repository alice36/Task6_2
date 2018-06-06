public class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray(3,2);

        multiArray.print();
        System.out.println();
        multiArray.tab = multiArray.randomize();
        multiArray.print();
        System.out.println("Minimum wynosi: " + multiArray.findMin());
        System.out.println("Maximum wynosi: " + multiArray.findMax());

    }
}
