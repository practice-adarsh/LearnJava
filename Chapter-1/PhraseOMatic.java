class PhraseOMatic
{
    public static void main(String[] args)
    {
        //make three sets of words to choose from.
        String[] ListOne = { "He", "She", "It", "They", "Us", "We", "Him", "Her", "We", "I" };
        String[] ListTwo = { "Run", "Eat", "Jump", "Sing", "Write", "Read", "Dance", "Speak", "Drive", "Swim" };
        String[] ListThree = { "Quickly", "Beautifully", "Eagerly", "Loudly", "Quitely", "Slowly", "Happily", "Fast", "Carefully", "Brightly" };

        //find out how many words are in each list
        int lengthOfListOne = ListOne.length;
        int lengthOfListTwo = ListTwo.length;
        int lengthOfListThree = ListThree.length;

        //generate three random numbers
        java.util.Random RandomGenerator = new java.util.Random();
        int RandInt1 = RandomGenerator.nextInt(lengthOfListOne);
        int RandInt2 = RandomGenerator.nextInt(lengthOfListTwo);
        int RandInt3 = RandomGenerator.nextInt(lengthOfListThree);

        //build a phrase
        String phrase = ListOne[RandInt1] + " " + ListTwo[RandInt2] + " " + ListThree[RandInt3];

        //print out the phrase
        System.out.println(phrase);
    }
}

