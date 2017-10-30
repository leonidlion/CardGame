import java.util.ArrayList;
import java.util.List;

public class Game {
    private Bank mBank;
    private Player mPlayer;
    private Player mComp;

    public Game(){
        mBank = new Bank();
        mPlayer = new Player();
        mComp = new Player();
    }

    public void play(){

    }

    private List<Card> generateCard(){
        return new ArrayList<>();
    }

    private List<Card> blendCardDeck(List<Card> cards){
        return cards;
    }
}
