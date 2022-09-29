import javax.swing.JButton
import javax.swing.JFrame

if (PinValidator.validatePin()) {

      Account userAccount = new Account("Shiv", "Kumar", 1220.56)

      UserInterface.displayMainMenu(userAccount)

      JButton button = JButton button;



            button.addActionListener(e -> System.out.println("foo"));
            button.setBounds(200, 100,100, 50);
            button.setText("1");
            button.setFocusable(false);
            button.setHorizontalTextPosition(JButton.CENTER);

      JFrame frame = new JFrame()
      frame.setTitle("Shiv's ATM");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(null)
      frame.setSize(500, 500);
      frame.setVisible(true);
      frame.add(button);
}
