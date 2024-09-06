
public class problem2
{
    public static void main(String[] args) 
    {
        String name1 = "Sandy";
        String name2 = "David";
        String name3 = "Elaine";
        String name4 = "Jesse";
        String temp = name1;
        name1 = name4;
        name4 = temp;
        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.print(name4);
    }
}