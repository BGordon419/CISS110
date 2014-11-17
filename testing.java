public class testing {

  public static void main(String[] args) {

    int[] test = new int[10];

    for(int temp : test) {
      test[temp] = temp;
    }
  }

  public static void Output(int var) {
    System.out.println(var);

  }
}
