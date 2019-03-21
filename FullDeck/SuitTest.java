public class SuitTest {
    Suit suit;

    public SuitTest(Suit suit) {
        this.suit = suit;
    }

    public void tellSuit() {
        switch(suit) {
            case DIAMONDS:
                System.out.println("Diamonds");
                break;

            case CLUBS:
                System.out.println("Clubs");
                break;

            case HEARTS:
                System.out.println("Hearts");
                break;

            case SPADES:
                System.out.println("Spades");
                break;

            default:
                System.out.println("Default case");
                break;
        }
    }

//    public static void main(String[] args) {
//        SuitTest firstSuit = new SuitTest(Suit.DIAMONDS);
//        firstSuit.tellSuit();
//
//        SuitTest secondSuit = new SuitTest(Suit.CLUBS);
//        secondSuit.tellSuit();
//    }
//
}
