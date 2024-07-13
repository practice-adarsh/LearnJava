class BottleSong
{
    public static void main(String[] args)
    {
        int BottleNum = 99;
        String Name = "Bottles";
        while (BottleNum > 0)
        {
            System.out.println(BottleNum + " Green " + Name + " Hanging on the wall");
            System.out.println(BottleNum + " Green " + Name + " Hanging on the wall");
            System.out.println("And if one Green Bottle should accidently fall, ");
            BottleNum -= 1;

            if (BottleNum == 1)
            {
                Name = "Bottle";
            }
            if (BottleNum > 0)
            {
                System.out.println("There will be " + BottleNum + " Green " + Name + " Hanging on the wall");
            }
            else
            {
                System.out.println("There will be no Green Bottles, hanging on the wall");
            }
        }
    }
}

