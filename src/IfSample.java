/**
 * Created by mgutsalenko on 22.01.2015.
 * Демонстрирует применение оператора if.
 */
public class IfSample {
    public static void main(String args[]){
        int x, y;

        x = 10;
        y = 20;

        if (x < y)  System.out.println("x < y");
        x = x * 2;

        if (x ==  y) System.out.println("x = y");
        x = x * 2;

        if (x > y) System.out.println("x > y");

        //этот оператор ничего не отображает
        if(x == y) System.out.println("you don't see it");

    }
}
