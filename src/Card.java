public class Card {
    private String mSuit;
    private String mValue;

    enum SUIT {
        HEART, DIAMOND, CLUB, SPADE
    }

    enum VALUE {
        V6, V7, V8, V9, V10, JACK, QUEEN, KING, ACE
    }

    public Card(SUIT suit, VALUE value){
        mSuit = suit.name();
        mValue = value.name();
    }

    public String getSuit() {
        return mSuit;
    }

    public String getValue() {
        return mValue;
    }

    public boolean isEquals(Card card){
        return mSuit.equals(card.getSuit());
    }
}
