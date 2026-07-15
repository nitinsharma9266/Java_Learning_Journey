// class A
// {
// 	public static void main(String[] args)
// 	{
// 		System.out.println("Hello World");
// 	}
// }

// import javax.swing.*;

// public class FirstSwingProgram {
//     public static void main(String[] args) {

//         // Create Window
//         JFrame frame = new JFrame("Ansh's First App...");

//         // Set window size
//         frame.setSize(500, 300);

//         // Close button properly closes application
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Make window visible
//         frame.setVisible(true);
//     }
// }

// import javax.swing.*;
// import java.awt.*;

// public class DarkThemeDemo {
//     public static void main(String[] args) {

//         JFrame frame = new JFrame("Dark Theme");

//         frame.setSize(600,400);

//         frame.getContentPane().setBackground(Color.PINK);

//         JLabel label =
//                 new JLabel("Welcome Ansh");

//         label.setForeground(Color.GREEN);

//         frame.add(label);

//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         frame.setVisible(true);
//     }
// }

import javax.swing.*;

public class  Goal {
    public static void main(String[] args) {

        JFrame frame =
                new JFrame("Ansh's Coding Journey");

        frame.setSize(600, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label =
                new JLabel(
                    "Today: Core Java | Tomorrow: Flutter Developer 🚀"
                );

        frame.add(label);

        frame.setVisible(true);
    }
}