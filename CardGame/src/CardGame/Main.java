package CardGame;


import static CardGame.PlayingCard.RANK_LIST;
import static CardGame.PlayingCard.SUITS_LIST;

public class Main {

    public static void main(String[] args) {
        PlayingCard[] card;
        card = new PlayingCard[52]; // initialisation of array
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 13; j++) {
                card[(i*13)+j] = new PlayingCard(SUITS_LIST[i], RANK_LIST[j]); //filling yhe array
            }
        }
        for (int i=0; i<52; i++) {
            System.out.println(card[i] + "\n");
        }
    }
}
