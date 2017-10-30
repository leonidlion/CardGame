import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Card> mCardList;

    public Bank(){
        mCardList = new ArrayList<>();
    }

    public boolean addCard(Card card){
        boolean isSuccess;

        if (mCardList.isEmpty()){
            isSuccess = true;
        }else {
            if (mCardList.get(mCardList.size() - 1).isEquals(card)){
                isSuccess = false;
            }else {
                isSuccess = true;
            }
        }
        mCardList.add(card);

        return isSuccess;
    }

    public List<Card> getBankCards(){
        return mCardList;
    }

    public void clearBank(){
        mCardList.clear();
    }
}
