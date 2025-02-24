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
        //NguyenVanBao

        // Phần hiển thị kết quả
        //NguyenVanBao

        // Xử lý sự kiện nút bấm
        //NguyenVanBao
       
    }
}
