import java.util.Scanner;

public class Main {

    public static String func(String str){
        int[] arr = new int[52];
        StringBuilder builder = new StringBuilder(52);
        for(int i=0; i<str.length();i++){
            if(arr[str.charAt(i) - 'A'] != 1){
                arr[str.charAt(i) - 'A'] = 1;
                builder.append(str.charAt(i));
            }
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()){
            String str = scan.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }
    }
}
