import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> mPlayerCards;

    public Player(){
        mPlayerCards = new ArrayList<>();
    }

    public Card getCard(){
        Card card = mPlayerCards.get(mPlayerCards.size());
        mPlayerCards.remove(card);
        return card;
    }

    public void putCards(List<Card> cards){
        mPlayerCards.addAll(0,cards);
    }

    public boolean hasCard(){
        return mPlayerCards.isEmpty();
    }
}
