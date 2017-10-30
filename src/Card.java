public class Card {
    private static final String[] VALUES = new String[]{
            "6","7","8","9","10","V","D","K","T"
    };

    private String mSweet;
    private String mValue;

    enum Sweets {
        S1, S2, S3, S4;
    }

    public Card(Sweets sweet, String value){
        mSweet = sweet.name();
        mValue = value;
    }

    public String getSweet() {
        return mSweet;
    }

    public String getValue() {
        return mValue;
    }

    public boolean isEquals(Card card1, Card card2){
        return card1.getSweet().equals(card2.getSweet());
    }
}
