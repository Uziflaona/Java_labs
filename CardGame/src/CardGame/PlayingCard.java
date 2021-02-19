package CardGame;

public class PlayingCard {

       public static final String[] SUITS_LIST = {
               "Пик", "Бубен", "Черв", "Треф"
       };

       public static final String[] RANK_LIST = {
               "2", "3", "4", "5", "6", "7", "8", "9", "10",
               "Валет", "Королева", "Король", "Туз"
       };

       private String suit = null;
       private String rank = null;

       public PlayingCard(String suit, String rank) {
           this.suit = suit;
           this.rank = rank;
       }

       @Override
       public String toString() {
       return rank+" "+suit;
       }
}
