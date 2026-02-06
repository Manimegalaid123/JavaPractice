import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicate {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println("Enter the element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)>1){
                l.add(num);
            }
        }
        System.out.println(l);

    }
}
