import java.io.*;
import javax.swing.*;
public class Window {
    public static void f1Window() throws IOException {
        F1Window w =new F1Window();
        w.setTitle("F1 Focus");
        w.setResizable(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.pack();
        w.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        Window.f1Window();
    }
}
