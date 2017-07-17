package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
    /////This part of the code will read the username from the UserName.txt file

        // The name of the file to open.
        String fileName = "UserName.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);


            //This logic analyzes if the UserName file is empty or not, and asks the user if they were the previous one to use the program
            if ((line = bufferedReader.readLine()) != null) {
                if (JOptionPane.showConfirmDialog(null, "Hi there! Is this " + line + "?", "Who am I speaking to?",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    // yes option
                    JOptionPane.showMessageDialog(null,"Great to speak to you again, " + line + "!");
                } else {
                    // no option

                    //This erases the old UserName
                    FileWriter fwOb = new FileWriter("UserName.txt", false);
                    PrintWriter pwOb = new PrintWriter(fwOb, false);
                    pwOb.flush();
                    pwOb.close();
                    fwOb.close();

                    String userName = JOptionPane.showInputDialog("Hi! I'm Alexa. What's your name?");
                    JOptionPane.showMessageDialog(null,"Great to meet you, " + userName +"!");


                    // The name of the file to open.
                    String fileName2 = "UserName.txt";

                    try {
                        // Assume default encoding.
                        FileWriter fileWriter =
                                new FileWriter(fileName2);

                        // Always wrap FileWriter in BufferedWriter.
                        BufferedWriter bufferedWriter =
                                new BufferedWriter(fileWriter);

                        // Note that write() does not automatically
                        // append a newline character.
                        bufferedWriter.write(userName);


                        // Always close files.
                        bufferedWriter.close();
                    }
                    catch(IOException ex) {
                        System.out.println(
                                "Error writing to file '"
                                        + fileName2 + "'");
                        // Or we could just do this:
                        // ex.printStackTrace();
                    }

                    JOptionPane.showMessageDialog(null,"I am an artificial intelligence machine capable of constantly " +
                            "learning through my interactions.\nI'd love to learn more about you, " + userName + ".");
                    JOptionPane.showMessageDialog(null,"Let's start with your credit card number:");
                    JOptionPane.showMessageDialog(null,"I'm just joking! We're not that close yet.");

                }
            }

            // Always close files.
            bufferedReader.close();
            //Error handling
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
/////Continues dialogue after code determines who you are
        JOptionPane.showMessageDialog(null,"Let me help you set up an account");

        //May opens box with multiple entries
        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Username: "));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Password: "));
        myPanel.add(new JPasswordField(6));
        //myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter a Username and Password", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Username: " + xField.getText());
            System.out.println("Password: XXXXXXX"); //+ yField.getText());
        }






                String[] choices = { "What is your most discouraging childhood memory? (1000 word minimum)", "A tortoise lay on it's back, it's belly in the hot sun beating it's little legs trying " +
                        "to turn itself over but it can't, not without your help, but you're not helping. Why is that?", "Mother's maiden name", "Your social security number"};
                String input = (String) JOptionPane.showInputDialog(null, "Choose a security question below:",
                        "Please select a security question just in case you forget your password", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                        choices, // Array of choices
                        choices[0]); // Initial choice

        String securityQuestionAnswer = JOptionPane.showInputDialog(input);

                //Testing message box with custom strings as options
        Object[] possibleValues = { "Jokes", "Calculator"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "What would you like to do?", null,
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
                System.out.println(selectedValue)
            }
        }

////    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////TEST CODE/////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



///////This initiates the dialogue
//
//        JOptionPane.showMessageDialog(null,"I am an artificial intelligence machine capable of constantly " +
//                "learning through my interactions.\nI'd love to learn more about you, " + userName + ".");
//        JOptionPane.showMessageDialog(null,"Let's start with your credit card number:");
//        JOptionPane.showMessageDialog(null,"I'm just joking! We're not that close yet.");
////Joke
//        if (JOptionPane.showConfirmDialog(null, "Oh! I heard the funniest joke earlier. Do you want to hear it?", null,
//                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            // yes option
//            JOptionPane.showInputDialog("Great! What do you get when you put a vest on an alligator?");
//            JOptionPane.showMessageDialog(null,"An investigator!");
//            JOptionPane.showMessageDialog(null,"Thank you, thank you. I have been called the Jerry Seinfeld of my generation.");
//        } else {
//            // no option
//            JOptionPane.showMessageDialog(null,"You suck");
//        }
//        //Testing message box with custom strings as options
//        Object[] possibleValues = { "Jokes", "Calculator"};
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "What would you like to do?", null,
//                JOptionPane.INFORMATION_MESSAGE, null,
//                possibleValues, possibleValues[0]);
//    }
//}


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////// END TEST CODE/////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        /////This initiates the dialogue
//        String userName = JOptionPane.showInputDialog("Hi! I'm Alexa. What's your name?");
//        JOptionPane.showMessageDialog(null,"Great to meet you, " + userName +"!");
//        JOptionPane.showMessageDialog(null,"I am an artificial intelligence machine capable of constantly " +
//                        "learning through my interactions.\nI'd love to learn more about you, " + userName + ".");
//        JOptionPane.showMessageDialog(null,"Let's start with your credit card number:");
//        JOptionPane.showMessageDialog(null,"I'm just joking! We're not that close yet.");
////Joke
//        if (JOptionPane.showConfirmDialog(null, "Oh! I heard the funniest joke earlier. Do you want to hear it?", null,
//                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            // yes option
//            JOptionPane.showInputDialog("Great! What do you get when you put a vest on an alligator?");
//            JOptionPane.showMessageDialog(null,"An investigator!");
//            JOptionPane.showMessageDialog(null,"Thank you, thank you. I have been called the Jerry Seinfeld of my generation.");
//        } else {
//            // no option
//            JOptionPane.showMessageDialog(null,"You suck");
//        }
//        //Testing message box with custom strings as options
//        Object[] possibleValues = { "Jokes", "Calculator"};
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "What would you like to do?", null,
//                JOptionPane.INFORMATION_MESSAGE, null,
//                possibleValues, possibleValues[0]);
//    }
//}













        //Random Jason Notes
//Static, without making an object, you can use it. An object is an instance of a class. Your main.java is a class.
//    Non-static (Class Variable)
//        //variables can be numbers, strings, characters, arrays, ect.
//        int age = 23;
//        String name = "Josh";
//        String intro = "Hi, my name is ";
//        String intro2 = " and my age is ";
//
//        //Printing things out to console:
//        System.out.println(intro + name + intro2 + age + ".");
//        System.out.println("This is pretty neat!");
//        System.out.println("This can be pretty easy ok");
//
//        //Some simple math
//        int sum = 4 + 8;
//        System.out.println(sum);
//
//
//        //How to take inputs
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userNumber = userInput.nextInt();
//        System.out.println(userNumber);


        //Testing popup dialogue
//        int someNumber = Integer.parseInt(JOptionPane.showInputDialog("Type in a grade: "));
//        System.out.println(someNumber);
//    Introductory Conversation

//while(true) {
//    int someNumber = Integer.parseInt(JOptionPane.showInputDialog("Guess the number I'm thinking" +
//            " of between 0 and 10"));
//    Random r = new Random();
//    int randomNumber = r.nextInt(10);
//
//    if (randomNumber == someNumber) {
//        JOptionPane.showMessageDialog(null, "That's right!");
//    } else
//        JOptionPane.showMessageDialog(null, "That's not right. The random number was actually " + randomNumber + ".");
//
//
//}

