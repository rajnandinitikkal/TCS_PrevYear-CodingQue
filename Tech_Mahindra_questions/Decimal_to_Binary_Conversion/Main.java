
public class Main {
    static void decToBinary(int n)
    {
        int binaryNum[] = new int[100];

        int i =0;
        while(n>0)
        {
            binaryNum[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j=1-1; j>=0; j--)
            System.out.println(binaryNum[j]);
        }

        public static void main(String[] args){
            // int n =17;
            int n = 33;
            System.out.println("Decimal : "+ n);
            System.out.print("Binary : ");
            decToBinary(n);
        }
    }

