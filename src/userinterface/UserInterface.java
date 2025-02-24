package userinterface;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
    private JFrame frame;
    private JTextField nameField;
    private JLabel resultLabel;

    public static void main(String[] args) {
        // Tạo và hiển thị giao diện
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserInterface window = new UserInterface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserInterface() {
        initialize();
    }

    private void initialize() {
        // Khởi tạo JFrame
        //KieuDucChung lam

        // Phần tiêu đề
        //KieuDucChung lam

        // Phần nhập liệu
        //KieuDucChung

         // Phần nút bấm
        JButton submitButton = new JButton("Xác nhận");
        submitButton.setBounds(150, 130, 100, 30);
        frame.getContentPane().add(submitButton);

        // Phần hiển thị kết quả
        resultLabel = new JLabel("");
        resultLabel.setBounds(100, 180, 200, 25);
        frame.getContentPane().add(resultLabel);

        // Xử lý sự kiện nút bấm
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                resultLabel.setText("Xin chào, " + name);
            }
        });
    }
}
