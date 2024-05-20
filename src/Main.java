import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int count = 0;
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Guessing guess = new Guessing(5, 1);

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("guess a number in the box");
        JTextField tF = new JTextField(5);
        JButton button2 = new JButton("submit");
        JButton nextLvlButton = new JButton("Next Level");
        JLabel messegeL = new JLabel(" ");
        JLabel messegeLTwo = new JLabel(" ");
        //
        // JPanel gamePanel1 = new JPanel();

        // JButton button = new JButton("yes!");

        //add to a gui make a new oneJButton nextLvlButton = new JButton("Next Level");
tF.setSize(55,45);
    panel.setBackground(Color.pink);
    button2.setBackground(new Color(50,20,8,100));
        //button2.setSize(5,5);
        tF.setSize(6,7);

        Guessing one = new Guessing(6, 1);
        guess.startLevel();


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi");



                //// convert string into int
                int blah = Integer.parseInt(tF.getText());
                // if(blah = )
                String starry = guess.guess(blah);

                label1.setText(starry);

                if (starry.equals("You won the game")) {
                    panel.add(nextLvlButton);
                    count+=1;
                }


                nextLvlButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        guess.startLevel();

                      guess.setLevel(count);

                        label1.setText(starry);
                        panel.add(messegeL);
                        panel.add(messegeLTwo);
                        messegeL.setText("the random number range has been increased with your level");
                        messegeLTwo.setText(String.valueOf(guess.getLevel()));

                    }
                });


            }
        });

        tF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bye");
                String blah = tF.getText();
            }

        });


        panel.add(label1);
        panel.add(tF);
        panel.add(button2);
        frame.add(panel);
        frame.setVisible(true);

    }
}