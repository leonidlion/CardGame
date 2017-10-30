import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Card> mCardList = new ArrayList<>();

    public boolean addCard(Card card){
        boolean isSuccess = true;

        if (mCardList.isEmpty()){
            isSuccess = true;
        }else {
            if (mCardList.get(mCardList.size()).getSweet().equals(card.getSweet())){
                isSuccess = false;
            }else {
                isSuccess = true;
            }
        }
        mCardList.add(card);

        return isSuccess;
    }

    public void clearStack(){
        mCardList.clear();
    }
}
