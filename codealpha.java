    import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class codealpha {
}

 class WordCounterApp extends JFrame {
    private JTextArea textArea;
    private JLabel wordCountLabel;

    public WordCounterApp() {
        setTitle("Word Counter App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        // Create components
        textArea = new JTextArea();
        JButton countButton = new JButton("Count Words");
        wordCountLabel = new JLabel("Word Count: 0");

        // Set layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        add(new JScrollPane(textArea));
        add(countButton);
        add(wordCountLabel);

        // Add action listener to the countButton
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countWords();
            }
        });
    }

    private void countWords() {
        String paragraph = textArea.getText();
        String[] words = paragraph.split("\\s+");
        int wordCount = words.length;
        wordCountLabel.setText("Word Count: " + wordCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WordCounterApp app = new WordCounterApp();
                app.setVisible(true);
            }
        });
    }
}




