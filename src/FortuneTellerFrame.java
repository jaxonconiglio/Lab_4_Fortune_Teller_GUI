import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame
{
    private ArrayList<String> fortunes = new ArrayList<>();
    private int previousFortuneIndex = -1;

    public FortuneTellerFrame() {
        fortunes.add("Get a chicken wing");
        fortunes.add("Win $1");
        fortunes.add("Have a nice day");
        fortunes.add("Get an A on a test");
        fortunes.add("Beat a game");
        fortunes.add("Have some fun");
        fortunes.add("Play the guitar");
        fortunes.add("Favorite lunch day");
        fortunes.add("Enjoy a show");
        fortunes.add("Make a cake");
        fortunes.add("See some friends");
        fortunes.add("Good luck is coming your way");

        setTitle("Fortune Teller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000, 750);
//north
        JLabel titleLabel = new JLabel("Fortune Teller", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        ImageIcon fortuneTellerIcon = new ImageIcon("fortune-teller.jpg");
        titleLabel.setIcon(fortuneTellerIcon);
        titleLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(titleLabel, BorderLayout.NORTH);
//center
        JTextArea textArea = new JTextArea();
        textArea.setFont((new Font("Arial", Font.PLAIN, 24)));
        JScrollPane scrollPane = new JScrollPane((textArea));
        add(scrollPane, BorderLayout.CENTER);
// south
        JButton fortuneButton = new JButton("Read my fortune.");
        JButton quitButton = new JButton("Quit");
        add(fortuneButton, BorderLayout.SOUTH);
        add(quitButton, BorderLayout.SOUTH);

        fortuneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String randomFortune = getRandomFortune();
                textArea.append(randomFortune + "\n"); // Append the fortune and a newline
            }
        });
    }

        private String getRandomFortune() {
            Random random = new Random();
            int randomIndex;

            do{
                randomIndex = random.nextInt(fortunes.size());
            } while (randomIndex == previousFortuneIndex);

            previousFortuneIndex = randomIndex;

            return fortunes.get(randomIndex);

        }
    }

