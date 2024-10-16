import java.util.*;
public class DobbleGame
{
    private static final int SYMBOL_COUNT = 5; // Number of symbols per card
    private static final String[] SYMBOLS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public static void main(String[] args)
    {   
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean status=true;
        int score=0;
        while(status)
        {
            System.out.println("Let's play the Dobble Game");
            int randomIndex=random.nextInt(SYMBOLS.length);//generates random number b/w 0 and length of the Symbols array(26)
            String commonSymbol = SYMBOLS[randomIndex];
            List<String> card1 = generateCard(commonSymbol);
            List<String> card2 = generateCard(commonSymbol);
            System.out.println("Card 1: " + card1);
            System.out.println("Card 2: " + card2);
            System.out.print("Identify the common symbol: ");
            String userSymbol = sc.nextLine();
            userSymbol=userSymbol.toUpperCase();// i am converting the user  input to upper case 
            if (userSymbol.equals(commonSymbol))
            {
                System.out.println("Correct!");
                score=score+10;
            }
            else
            {
                System.out.println("Wrong! The correct symbol was: " + commonSymbol);
                System.out.println("Thank you for playing Your total score= "+score);
                status=false;
            }
           
        }
        sc.close();
    }

    private static List<String> generateCard(String commonSymbol) {
        Random random = new Random();
        List<String> card = new ArrayList<>();
        // Add the common symbol
        card.add(commonSymbol);
        List<String> availableSymbols = new ArrayList<>();
        Collections.addAll(availableSymbols, SYMBOLS);
        availableSymbols.remove(commonSymbol);//removing common symbol
        Collections.shuffle(availableSymbols);
        for (int i = 0; i < SYMBOL_COUNT - 1; i++)
        {
            card.add(availableSymbols.get(i));
            availableSymbols.remove(availableSymbols.get(i));
        }
        Collections.shuffle(card);
        return card;
    }
}
//Feeling happy Understood the logic behind this game..#happy coding!!
