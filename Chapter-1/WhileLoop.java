class WhileLoop
{
    public static void main(String[] args)
    {
        int x = 0;
        while (x < 5)
        {
            System.out.println("x is " + x);
            System.out.println("This is inside the loop");
            x++;
        }
        System.out.println("This is outside the loop");
    }
}

