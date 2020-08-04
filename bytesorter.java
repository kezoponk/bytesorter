import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class bytesorter {

  static JFrame frame;
  static JTextArea input, output;
  static JScrollPane inputScroll, outputScroll;
  static int index, lang = 0;

  static byte Bytes[] = new byte[200];
  static byte unsortedBytes[] = new byte[200];
  static String unsortedStrings[] = new String[200];
  static String sortedBytes[] = new String[100];

  static int realLength(String[] arr) {
    // Find real length of array since java array length is static
    int count = 0;
    for (String out : arr) {
      try {
        if (out.isBlank()) return count;
      } catch (NullPointerException e) {
        return count;
      }
      count++;
    }
    return count;
  }

  static String javaAndPythonSplitter(String line) {
    String type = "";
    String trimmed = "";
    // Ob for bytes, 0x for hex
    if (line.contains("& 0b")) type = "b";      // Byte
    else if (line.contains("& 0x")) type = "x"; // Hex
    String splittedLine[] = line.split("& 0"+type);
    // Find end of value to determine 4bit, 8bit, 16bit etc
    for (String character : splittedLine[1].split("")) {
      if(character.equals(")") || character.equals(" ")) break;
      trimmed += character;
    }
    return trimmed;
  }

  static void getBytes(String line) {
    // Find byte value
    Bytes[index] = (byte) (-1*Byte.parseByte(javaAndPythonSplitter(line), 2));
    // Make the byte value array and input text array same positions
    unsortedStrings[index] = line;
    unsortedBytes[index] = Bytes[index];
    index++;
  }

  static void sortBytes() {
    int index = 0, lineIndex = 0;
    // Sort array then align with input text
    Arrays.sort(Bytes);
    while(index<realLength(unsortedStrings)) {
      lineIndex = 0;
      for (int unsortedByte: unsortedBytes) {
        if((byte) Bytes[index] == unsortedByte) {
          sortedBytes[index] = unsortedStrings[lineIndex];
          break;
        }
        lineIndex++;
      }
      index++;
    }
    // Reverse sortedbytes to make it smallest-biggest
    lineIndex = realLength(sortedBytes)-1;
    while(lineIndex >= 0) {
      output.append(sortedBytes[lineIndex]+"\n");
      lineIndex--;
    }
  }

  static JScrollPane textarea(int bounds[], JTextArea textarea) {
    JScrollPane scrollpane = new JScrollPane((Component) null);
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scrollpane.setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);

    textarea.setForeground(new Color(0, 0, 0));
    textarea.setBackground(Color.WHITE);
    textarea.setLineWrap(true);
    textarea.setFont(new Font("Calibri", 200, 10));

    scrollpane.setViewportView(textarea);
    return scrollpane;
  }

  public static void main(String[] args) {
    frame = new JFrame();
    frame.getContentPane().setForeground(Color.WHITE);
    frame.setBounds(100, 100, 550, 455);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    input = new JTextArea();
    output = new JTextArea();

    int inputBounds[] = {10, 10, 530, 200};
    inputScroll = textarea(inputBounds, input);
    frame.add(inputScroll);

    input.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent x) {
        output.setText("");
        sortedBytes = new String[100];
        Bytes = new byte[200];
        index = 0;

        try {
          String inputs = input.getText();
          for (String line: inputs.split("\n")) {
            getBytes(line);
          }
          sortBytes();
        } catch(Exception e) {
          output.setText("Invalid byte selection\n"+e);
        }
      }
    });
    int outputBounds[] = {10, 220, 530, 200};
    outputScroll = textarea(outputBounds, output);
    frame.add(outputScroll);

    frame.setVisible(true);
  }
}
