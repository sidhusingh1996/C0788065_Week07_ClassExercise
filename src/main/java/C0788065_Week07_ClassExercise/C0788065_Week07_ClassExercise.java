package C0788065_Week07_ClassExercise;

public class C0788065_Week07_ClassExercise {
    public static void main(String[] args) {
        int[] array = {34, 23, 64, 66, 44, 1, 98, 39, 17, 87};
        System.out.println("\n\nArray in correct order:");
        for (int a : array) {
            System.out.print(a + "  ");
        }

        System.out.println("\n\nArray in reverse order:");
        for (int i = array.length - 1 ; i >= 0 ; i-- )  {
            System.out.print(array[i] + "  ");
        }
    }
}
