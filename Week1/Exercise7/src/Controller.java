import java.util.Random;

public class Controller {
    public static void main(String[] args)
    {
        int[] numbers = new int[50];
        Random generator = new Random();

        // Populate array
        for(int i = 0; i < 50; i++)
        {
            numbers[i] = (int) generator.nextInt(101);
        }

        // Print array
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        // Sort the array
        bubbleSort(numbers);
        System.out.println();

        // Print array
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void bubbleSort(int[] a)
    {
        for(int i =0; i<a.length; i++)
        {
            for(int j =1; j<(a.length-i); j++)
            {
                if (a[j-1]>a[j])
                    swap(a, j-1, j);
            }
        }
    }
    private static void swap(int[] a, int x ,int y)
    {
        int tempStore = a[x];
        a[x] =a[y];
        a[y] =tempStore;
    }
}
