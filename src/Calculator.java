import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class Calculator extends JFrame
{
    //variables to store the numbers ditacted
    private double firstNumber;
    private double secondNumber;

    //string variables to store numbers ditacted
    private String firstNum="";

    //variable to store the result of our calculation
    private double result=0;

    // variable to detect operation performed
    private char operation;


    private JPanel outputPanel;//Panel to show the output
    private JPanel NumbersPanel;//Panel to store the numbers
    private JPanel operationPanel;//Panel to store the operation signs

    private JButton buttonOfOne;
    private JButton buttonOfTwo;
    private JButton buttonOfThree;
    private JButton buttonOfFour;
    private JButton buttonOfFive;
    private JButton buttonOfSix;
    private JButton buttonOfSeven;
    private JButton buttonOfEight;
    private JButton buttonOfNine;
    private JButton buttonOfZero;
    private JButton buttonOfPoint;
    // Created the buttons for numbers

    private JButton buttonOfAddition;
    private JButton buttonOfSubtraction;
    private JButton buttonOfMultiplication;
    private JButton buttonOfDivision;
    private JButton buttonToShowSolution;
    private JButton buttonForClear;
    // Created the buttons for the maths operators

    //Label field for the output
    private JLabel fieldForOutput;

    public static void main(String[] args)
    {
        // We don't plan to make any changes to our calculator so we can just make anonymous object of calculator
        new Calculator();
        
    }

    

    public Calculator()
    {
        super("Personal Calculator"); //using constructor to set title for the frame.
        Container calculatorContents = getContentPane();
        setTitle("CASIO Calculator"); // Taking the famous brand's name for marketing
        setSize(315, 550); // Sets the size of the calculator frame.
        setResizable(false);//because components are sized optimally to this size better if not resized by user
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of calculator when closed.
        setBackground(Color.BLACK);
        setLayout(null); //we will manually place our components
        setLocation(300,200);
        
        fieldForOutput = new JLabel();
        //Increasing default size and change the font into more readable form
        fieldForOutput.setFont(new Font("Serif",Font.BOLD,40));

        operationPanel = new JPanel();
        operationPanel.setBackground(Color.BLUE);
        operationPanel.setLayout(new GridLayout(5,1,3,3));
        operationPanel.setBounds(225,110,75,400);

        NumbersPanel = new JPanel();
        NumbersPanel.setBackground(Color.RED);
        NumbersPanel.setLayout(new GridLayout(4,3,5,5));
        NumbersPanel.setBounds(0,110,225,400);

        outputPanel = new JPanel();
        outputPanel.setBackground(Color.GRAY);
        outputPanel.setBounds(0,0,300,100);
        outputPanel.setLayout(new FlowLayout());
        outputPanel.add(fieldForOutput);

        //Create the buttons with their text
        buttonOfZero = new JButton("0");
        buttonOfOne = new JButton("1");
        buttonOfTwo = new JButton("2");
        buttonOfThree = new JButton("3");
        buttonOfFour = new JButton("4");
        buttonOfFive = new JButton("5");
        buttonOfSix = new JButton("6");
        buttonOfSeven = new JButton("7");
        buttonOfEight = new JButton("8");
        buttonOfNine = new JButton("9");
        buttonOfPoint = new JButton(".");
        buttonToShowSolution = new JButton("=");

        buttonOfAddition = new JButton("+");
        buttonOfMultiplication = new JButton("x");
        buttonOfSubtraction = new JButton("-");
        buttonOfDivision = new JButton("/");
        buttonForClear = new JButton("C");

        //let's add the buttons to their respective panel
        NumbersPanel.add(buttonOfNine);
        NumbersPanel.add(buttonOfEight);
        NumbersPanel.add(buttonOfSeven);
        NumbersPanel.add(buttonOfSix);
        NumbersPanel.add(buttonOfFive);
        NumbersPanel.add(buttonOfFour);
        NumbersPanel.add(buttonOfThree);
        NumbersPanel.add(buttonOfTwo);
        NumbersPanel.add(buttonOfOne);
        NumbersPanel.add(buttonOfPoint);
        NumbersPanel.add(buttonOfZero);
        NumbersPanel.add(buttonToShowSolution);

        operationPanel.add(buttonOfAddition);
        operationPanel.add(buttonOfSubtraction);
        operationPanel.add(buttonOfMultiplication);
        operationPanel.add(buttonOfDivision);
        operationPanel.add(buttonForClear);

        //Link the buttons with the action listener
        buttonOfAddition.addActionListener(new eventListener());
        buttonOfMultiplication.addActionListener(new eventListener());
        buttonOfSubtraction.addActionListener(new eventListener());
        buttonOfDivision.addActionListener(new eventListener());
        buttonOfPoint.addActionListener(new eventListener());
        buttonToShowSolution.addActionListener(new eventListener());
        buttonForClear.addActionListener(new eventListener());
        buttonOfOne.addActionListener(new eventListener());
        buttonOfTwo.addActionListener(new eventListener());
        buttonOfThree.addActionListener(new eventListener());
        buttonOfFour.addActionListener(new eventListener());
        buttonOfFive.addActionListener(new eventListener());
        buttonOfSix.addActionListener(new eventListener());
        buttonOfSeven.addActionListener(new eventListener());
        buttonOfEight.addActionListener(new eventListener());
        buttonOfNine.addActionListener(new eventListener());
        buttonOfZero.addActionListener(new eventListener());

        calculatorContents.add(outputPanel); //add the output panel to the frame
        calculatorContents.add(NumbersPanel);//add the numbers panel to the frame
        calculatorContents.add(operationPanel);//add the operations panel to the frame
        setVisible(true); //makes the frame visible
    
    }

    private class eventListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            // If the 'C' button is clicked (which stands for clear) the whole output panel is cleared
            if(e.getSource() == buttonForClear)
            {
                firstNum = "";
                fieldForOutput.setText(firstNum);

            }

            // If the buttons for the numbers are clicked respective value will be recorded on the output panel
            if(e.getSource() == buttonOfZero)  
            {
                firstNum = firstNum.concat("0");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfOne)  
            {
                firstNum = firstNum.concat("1");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfTwo)  
            {
                firstNum = firstNum.concat("2");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfThree)  
            {
                firstNum = firstNum.concat("3");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfFour)  
            {
                firstNum = firstNum.concat("4");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfFive)  
            {
                firstNum = firstNum.concat("5");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfSix)  
            {
                firstNum = firstNum.concat("6");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfSeven)  
            {
                firstNum = firstNum.concat("7");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfEight)  
            {
                firstNum = firstNum.concat("8");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfNine)  
            {
                firstNum = firstNum.concat("9");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfPoint)  
            {
                if(!firstNum.contains("."))
                {
                    firstNum = firstNum.concat(".");
                    fieldForOutput.setText(firstNum);
                }
            }  
 


            // If one of the operation's button is clicked, the whole text before click of operation will be recorded
            // and the input field will be set to empty string so the next number could be recored.
            if(e.getSource() == buttonOfAddition)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '+';
            }

            if(e.getSource() == buttonOfSubtraction)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '-';
            }

            if(e.getSource() == buttonOfDivision)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '/';
            }

            if(e.getSource() == buttonOfMultiplication)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '*';
            }


            // If the equal sign is clicked then the second number will be the input after the first number
            // and the result will be displayed with respect to operation recorded
            if(e.getSource()== buttonToShowSolution)
            {
                secondNumber = Double.parseDouble(firstNum);

                if(operation == '+')
                result = firstNumber+secondNumber;
                else if(operation == '-')
                result = firstNumber+secondNumber;
                else if(operation == '/')
                result = firstNumber/secondNumber;
                else if(operation == '*')
                result = firstNumber*secondNumber;

                fieldForOutput.setText(""+result);
                firstNum = "";

            }
            
        }
    }
   
}