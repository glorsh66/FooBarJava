public class FooBarJava {
//    Write a program that prints the numbers from 1 to 100.
//    But for multiples of three print “Foo” instead of the number
//    and for the multiples of five print “Bar”.
//    For numbers which are multiples of both three and five print “FooBar”.


    public static void FooBar(int f, int to)
    {
        for (int i = f; i <= to; i++)
        {
            if ( (i % 5) == 0 && (i%3) == 0) System.out.println("FooBar");
            else if ((i % 5) == 0) System.out.println("Bar");
            else if ((i % 3) == 0) System.out.println("Foo");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FooBar(1,100);
    }

}
