class statics {
   static int i;
static int j;
int k;
static {

   i =10;
  j =20;
  System.out.println(i);
  System.out.println("static block called");
}
}

public class a_5_q_1 {
  public static void main(String args[]) {

  System.out.println(statics.j);
}
}