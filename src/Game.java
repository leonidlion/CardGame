import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    private Bank mBank;
    private Player mPlayer;
    private Player mComp;

    public Game(){
        mBank = new Bank();
        mPlayer = new Player("Human");
        mComp = new Player("Comp");
    }

    public void play(){
        giveCartsToPlayers();

        boolean isPlayerFirst = new Random().nextBoolean();

        startGameMatch(isPlayerFirst ? mPlayer : mComp,
                isPlayerFirst ? mComp : mPlayer);
    }

    private void giveCartsToPlayers(){
        List<Card> cardList = generateCard();

        mPlayer.putCards(cardList.subList(0, cardList.size() / 2));
        mComp.putCards(cardList.subList(cardList.size() / 2, cardList.size()));
    }

    private void startGameMatch(Player firstPlayer, Player secondPlayer){
        System.out.println("FIRST PLAYER: " +firstPlayer.getName());
        while (true){
            if (playerMove(firstPlayer) || playerMove(secondPlayer)){
                break;
            }
        }
    }

    private boolean playerMove(Player player){
        boolean isPlayerWinMatch = false;
        if (player.hasCard()) {
            if (!mBank.addCard(player.getCard())) {
                mPlayer.putCards(mBank.getBankCards());
                mBank.clearBank();
                System.out.println("Player " + player.getName() + " lose round");
            } else {
                System.out.println("Player " + player.getName() + " win round");
            }
        }else {
            isPlayerWinMatch = true;
            System.out.println("Player " + player.getName() + " win match!");
        }
        return isPlayerWinMatch;
    }

    private List<Card> generateCard(){
        List<Card> cardDeck = new ArrayList<>();
        for (Card.SUIT suit : Card.SUIT.values()){
            for (Card.VALUE value : Card.VALUE.values()){
                Card card = new Card(suit, value);
                cardDeck.add(card);
            }
        }
        Collections.shuffle(cardDeck);
        return cardDeck;
    }
}
