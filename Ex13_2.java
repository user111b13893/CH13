import java.util.Scanner;

public class Ex13_2 {
    public static void main(String[] args) {
        int num=12, den;
        Scanner sc = new Scanner(System.in);
        den = sc.nextInt();

        if (den != 0) {
            int ans = num / den;
            System.out.println("答案: " + ans);
        } 
        else {
            System.out.println("除數為0");
        }

        System.out.println("end of main()!!");
    }
}
