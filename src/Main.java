package pack;
import Language.Morse;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        Morse a = new Morse(sc.nextLine(),true);
        System.out.println(a);
        a.setMsg(sc.nextLine());
        a.toMorse();
        System.out.println(a);
        a.setMsg(sc.nextLine());
        a.fromMorse();
        System.out.println(a);
        a = new Morse(sc.nextLine(),false);
        System.out.println(a);
    }
}
