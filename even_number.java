import java.util.Scanner;
class even_number {

public static void main(String args[]) {

Scanner obj = new Scanner(System.in);

int n = obj.nextInt();

for(int i=2;i<=n;i+=2)
{

System.out.println(i);
}

}
}