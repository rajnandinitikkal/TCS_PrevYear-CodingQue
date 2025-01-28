package Tech_Mahindra_questions.coding_que1;

import java.util.*;
import java.util.Arrays;

public class DataServer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String data = sc.next();

    char server[] = data.toCharArray();
    Arrays.sort(server);

    int n = server.length;
    int count = 0;

    for (int i = 1; i < n; i++) {
      if (server[i] == server[i - 1]) {
        count++;
      }
    }

    System.out.println(count);
    sc.close();
  }
}