public class Welcome {
    public static void main(String[] args)
    {
        String greeting = "Selamat datang ke Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}
