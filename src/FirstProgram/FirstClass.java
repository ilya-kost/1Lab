package FirstProgram;

import FirstPackage.SecondClass;

public class FirstClass {

    public static void main(String[] s)
    {
        SecondClass o = new SecondClass();
        int i, j;
        for(i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setValue1(i);
                o.setValue2(j);
                System.out.print(o.multipleValues());
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}