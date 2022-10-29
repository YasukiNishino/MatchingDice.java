import java.util.*;


public class MatchingDice{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = 1;
        String str = line.substring(n);
        
        String[] stringArray = str.split("");
        int[] arr = new int[3];
        
        for(int i = 0; i < stringArray.length; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[1] == arr[2]){
            System.out.println("Yes");
        } else { 
            System.out.println("No");
        }
    }
}