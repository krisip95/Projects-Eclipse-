package edu.smg;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
    //    JOptionPane.showMessageDialog(null,
        //        "There's no input here, just a message",
        //        "Title",
        //        0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
               "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        System.out.println(input1);
        
       // String[] acceptableValues = {"Cake", "Chcolate", "Ice cream"};
        //String input2 = (String)JOptionPane.showInputDialog(null,
    //            "Choose a dessert",
         //       "Desserts",
     //           2,
     //           null,
       //         acceptableValues,
        //      acceptableValues[1]);
      //  System.out.println(input2);
    }
}
