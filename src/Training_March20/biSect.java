package Training_March20;

import java.util.*;
public class biSect
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int elements = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < elements; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.print("The ArrayList you entered: [");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
        System.out.println("Enter the number to be added");
        int value = sc.nextInt();
        arr.add(biSectArray(arr, value),value);
        System.out.println(arr);

    }

    private static int biSectArray(ArrayList<Integer> arr, int value)
    {
        {
            int start =0,end= arr.size()-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr.get(mid) == value)
                     return mid;
                else if (arr.get(mid) < value)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return end+1;
        }
    }
}
