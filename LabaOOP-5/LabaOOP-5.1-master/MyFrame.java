package com.company;
import java.awt.*;
import javax.swing.*;


public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Image Application");
        setSize(808, 729);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
        setResizable(false);
    }
}
