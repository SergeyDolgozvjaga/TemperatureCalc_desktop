package com.sergeydolgozvjaga.tempcalc.View;

import com.sergeydolgozvjaga.tempcalc.Logic.Operations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

/**
* Class describes printed elements
* and their layouts on the frame
* */
public class Panels extends JPanel {

    private final Logger logger = Logger.getLogger(String.valueOf(Panels.class));
    private Operations oper;

    public Panels(){

        super(new BorderLayout());
        this.add(mainPanel(), BorderLayout.CENTER);
        oper = new Operations();

    }

    /** Labels, that show information on the frame */
    private JLabel labelInfo = new JLabel("Enter number and select type temperature");
    private JLabel type = new JLabel("Enter a type: k - kalvin, c - celsius, f - fahrenheit");
    private JLabel labelResult = new JLabel("Result is: ");
    private JLabel labelShow = new JLabel();

    /** TextFields, that can help insert data about search */
    private JTextField numberField =  new JTextField(10);
    private JTextField typeField =  new JTextField(10);

    /**
    * Method add all elements to Panel
    * to their grouping
    *
    * @return Panel;
    * */
    private JPanel mainPanel(){

        JPanel panel = new JPanel(new GridLayout(8, 1));

        panel.add(labelInfo);
        panel.add(numberField);
        panel.add(type);
        panel.add(typeField);
        panel.add(labelResult);
        panel.add(labelShow);
        panel.add(btnConvert());
        panel.add(btnExit());

        return panel;
    }

    /**
    * Method describes behavior
    * of button "Convert"
    *
    * If button pressed - application
    * convert values from temperature system
    * to another
    *
    * @return button "Convert"
    * */
    private JButton btnConvert(){
        logger.info("start btnConvert");
        JButton btnConvert = new JButton("Convert");
        btnConvert.addActionListener((ActionEvent e) -> {

            int temp = Integer.parseInt(numberField.getText());
            String typeFieldString = typeField.getText();

            if (typeFieldString.equals("k")){
                labelShow.setText("Kalvin is: " + temp + " Celsius is: " + oper.kalvinToCelsiusAll(temp) + " Fahrenheit is: " + oper.kalvinToFahrenheitAll(temp));
            } else if (typeFieldString.equals("c")){
                labelShow.setText("Kalvin is: " + new Operations().celsiusToKalvinAll(temp) + " Celsius is: " + temp + " Fahrenheit is: " + oper.celsiusToFahrenheitAll(temp));
            } else if (typeFieldString.equals("f")){
                labelShow.setText("Kalvin is: " + oper.fahrenheitToKalvinAll(temp) + " Celsius is: " + oper.fahrenheitToCelsiusAll(temp) + " Fahrenheit is: " + temp);
            }
        });
        logger.info("exit btnConvert");
        return btnConvert;
    }

    /**
     * Method describes behavior
     * of button "Exit"
     *
     * If button pressed - application is closed
     *
     * @return button "Exit"
     * */
    private JButton btnExit(){
        logger.info("start btnExit");
        JButton btnExit= new JButton("Exit");
        btnExit.addActionListener((ActionEvent e) -> {
            System.out.println("Exit");
            System.exit(0);
        });
        logger.info("exit btnExit()");
        return btnExit;
    }
}

