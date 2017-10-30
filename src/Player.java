import java.util.ArrayList;
import java.util.List;

public class Player {
    private String mName;
    private List<Card> mPlayerCards;

    public Player(String name){
        mName = name;
        mPlayerCards = new ArrayList<>();
    }

    public Card getCard(){
        return mPlayerCards.remove(mPlayerCards.size() - 1);
    }

    public String getName(){
        return mName;
    }

    public void putCards(List<Card> cards){
        mPlayerCards.addAll(0,cards);
    }

    public boolean hasCard(){
        return !mPlayerCards.isEmpty();
    }
}