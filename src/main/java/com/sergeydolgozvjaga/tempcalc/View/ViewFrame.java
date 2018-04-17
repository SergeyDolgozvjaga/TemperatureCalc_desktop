package com.sergeydolgozvjaga.tempcalc.View;

import javax.swing.*;
import java.util.logging.Logger;

/**
* Class describes size of frame, that will launch
* */
public class ViewFrame extends JFrame {

    private final Logger logger = Logger.getLogger(String.valueOf(ViewFrame.class));

    private Panels panels;

    public ViewFrame(){
        initUI();
    }

    /**
     * Method initiate frame, that will show app window
     * */
    private void initUI() {

        logger.info("start initUI");
        panels = new Panels();

        JFrame frame = new JFrame();
        // set window size
        frame.setSize(320, 300);
        frame.setTitle("Sorted List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panels);
        frame.pack();
        frame.setVisible(true);
        logger.info("exit initUI");
    }
}
