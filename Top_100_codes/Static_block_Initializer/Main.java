package Top_100_codes.Static_block_Initializer;

public class Main {
    public static void main(String[] args) {
        if(flag){
            int area = H*B;
            System.out.println(area);
        }
    }
    static int B,H;
    static boolean flag = true;

    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if(B<=0 ||H<=0){
            System.out.println("")
            flag = true;
        }
    }

    
}
