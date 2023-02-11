import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame extends JFrame implements ActionListener {
    // create a list of cards
    private List<String> cards;
    // create an index to keep track of the current card
    private int currentCard;

    public CardGame() {
        // set the title and size of the window
        setTitle("Card Game");
        setSize(300, 200);

        // create the list of cards and shuffle them
        cards = new ArrayList<>();
        cards.add("Ace of Spades");
        cards.add("Two of Spades");
        cards.add("Three of Spades");
        // ... add more cards here
        Collections.shuffle(cards);

        // create a button to draw the next card
        JButton button = new JButton("Draw Card");
        button.addActionListener(this);

        // add the button to the content pane
        getContentPane().add(button, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        // get the next card and display it in a message box
        String card = cards.get(currentCard);
        currentCard++;
        JOptionPane.showMessageDialog(this, "You drew the " + card);
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.setVisible(true);
    }
}
