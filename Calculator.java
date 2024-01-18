import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener
{
    boolean isNewInput=true;
    boolean isOperatorClicked=false;
    String oldValue;
    String newValue;

    JFrame jf;
    JTextField displayLabel;
    JButton clearButton;
    JButton delButton;
    JButton squareButton;
    JButton divisionButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton productButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton minusButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton plusButton;
    JButton posOrNegButton;
    JButton zeroButton;
    JButton dotButton;
    JButton equalButton;

    double result =0;
    char operation = ' ';
    public Calculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(440,600);
        jf.setLocation(500,100);
        jf.getContentPane().setBackground(new Color(40, 40, 40)); 

        displayLabel=new JTextField(" ");
        displayLabel.setBounds(30,50,360,40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        Font labelFont=new Font("Arial",Font.PLAIN,20);
        displayLabel.setFont(labelFont);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        clearButton=new JButton("Clear");
        clearButton.setBounds(30,120,80,60);
        clearButton.setFont(new Font("Arial", Font.PLAIN,10) );
        clearButton.addActionListener(this);
        jf.add(clearButton);

        delButton=new JButton("Del");
        delButton.setBounds(120,120,80,60);
        delButton.setFont(new Font("Arial", Font.PLAIN,10) );
        delButton.addActionListener(this);
        jf.add(delButton);

        squareButton=new JButton("x^2");
        squareButton.setBounds(210,120,80,60);
        squareButton.setFont(new Font("Arial", Font.PLAIN,30) );
        squareButton.addActionListener(this);
        jf.add(squareButton);

        divisionButton=new JButton("/");
        divisionButton.setBounds(310,120,80,60);
        divisionButton.setFont(new Font("Arial", Font.PLAIN,35) );
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,200,80,60);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(120,200,80,60);
        eightButton.setFont(new Font("Arial", Font.PLAIN,35) );
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(210,200,80,60);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(nineButton);

        productButton=new JButton("*");
        productButton.setBounds(310,200,80,60);
        productButton.addActionListener(this);
        productButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(productButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,280,80,60);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(120,280,80,60);
        fiveButton.setFont(new Font("Arial", Font.PLAIN,35) );
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(210,280,80,60);
        sixButton.setFont(new Font("Arial", Font.PLAIN,35) );
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton=new JButton("-");
        minusButton.setBounds(310,280,80,60);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(minusButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30,360,80,60);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(120,360,80,60);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(210,360,80,60);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(threeButton);

        plusButton=new JButton("+");
        plusButton.setBounds(310,360,80,60);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(plusButton);


        posOrNegButton=new JButton("+/-");
        posOrNegButton.setBounds(30,440,80,60);
        posOrNegButton.addActionListener(this);
        posOrNegButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(posOrNegButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(120,440,80,60);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(zeroButton);

        dotButton=new JButton(".");
        dotButton.setBounds(210,440,80,60);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(dotButton);

        equalButton=new JButton("=");
        equalButton.setBounds(310,440,80,60);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN,35) );
        jf.add(equalButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Calculator();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==clearButton)
        {
            
            displayLabel.setText("");
            result=0;
            operation=' ';
            displayLabel.requestFocus();
        }
        else if(e.getSource()==oneButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"1");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==twoButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"2");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==threeButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"3");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==fourButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"4");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==fiveButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"5");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==sixButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"6");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==sevenButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"7");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==eightButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"8");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==nineButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"9");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==zeroButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            if(isOperatorClicked)
            {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"0");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==dotButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            displayLabel.setText(displayLabel.getText()+".");
            displayLabel.requestFocus();
        }
        else if(e.getSource()==productButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            else
            {
                String currentValue=displayLabel.getText();
                if(!currentValue.isEmpty())
                {
                    int currentValueI =Integer.parseInt(currentValue);
                    performOperation(currentValueI);
                    displayLabel.setText(result +"");
                }
            }
            isOperatorClicked = true;
            operation = '*';
            displayLabel.requestFocus();
        }
        else if(e.getSource()==delButton)
        {
            String currentValue= displayLabel.getText();
            
            if(!currentValue.isEmpty())
            {
                currentValue = currentValue.substring(0,currentValue.length()-1);
                displayLabel.setText(currentValue);
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==squareButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            String currentValue=displayLabel.getText();
            if(!currentValue.isEmpty())
            {
                double currentValueDouble=Double.parseDouble(currentValue);
                currentValueDouble=currentValueDouble * currentValueDouble;
                displayLabel.setText(currentValueDouble+"");
            }
            displayLabel.requestFocus();
        }
        else if(e.getSource()==divisionButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            else
            {
                String currentValue=displayLabel.getText();
                if(!currentValue.isEmpty())
                {
                    int currentValueI =Integer.parseInt(currentValue);
                    performOperation(currentValueI);
                    displayLabel.setText(result +"");
                }
            }
            isOperatorClicked = true;
            operation = '/';
            displayLabel.requestFocus();
        }
        else if(e.getSource()==minusButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            else
            {
                String currentValue=displayLabel.getText();
                if(!currentValue.isEmpty())
                {
                    int currentValueI =Integer.parseInt(currentValue);
                    performOperation(currentValueI);
                    displayLabel.setText(result +"");
                }
            }
            isOperatorClicked = true;
            operation = '-';
            displayLabel.requestFocus();
        }
        else if(e.getSource()==plusButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("");
                isNewInput = false;
            }
            else
            {
                String currentValue=displayLabel.getText();
                if(!currentValue.isEmpty())
                {
                    int currentValueI =Integer.parseInt(currentValue);
                    performOperation(currentValueI);
                    displayLabel.setText(result +"");
                }
            }
            isOperatorClicked = true;
            operation = '+';
            displayLabel.requestFocus();
        
        }
        else if(e.getSource()==equalButton)
        {
            if(!isNewInput)
            {
                String newValue=displayLabel.getText();
                int newValueD=Integer.parseInt(newValue);
                performOperation(newValueD);
                displayLabel.setText(result+"");
                isNewInput = true;               
            }
        }
        else if(e.getSource()==posOrNegButton)
        {
            if(isNewInput)
            {
                displayLabel.setText("-");
                isNewInput = false;
            }
            else
            {
                String currentValue=displayLabel.getText();
                if(!currentValue.isEmpty() && !currentValue.equals("0") && !currentValue.equals(".")) 
                {
                    int  currentValueI=Integer.parseInt(currentValue);
                    currentValueI = -currentValueI;
                    displayLabel.setText(currentValueI+"");
                    isOperatorClicked=true;
                }
            }
           displayLabel.requestFocus();
        }
    }
    public void performOperation(int newValue)
    {
        if(result == 0 && !isNewInput)
        {
            result =newValue;
        }
        switch(operation)
        {
            case '+':
                result=result+newValue;
                break;

            case '-':
                result=result-newValue;
                break;
            case '*':
                result=result*newValue;
                break;
            case '/':
                if(newValue != 0)
                {
                    result=result/newValue;
                }
                else
                {
                    displayLabel.setText("Error");
                    isNewInput = true;
                    return;
                }
                break;
            default:
                result = newValue;
                break;
         }
         displayLabel.setText(Integer.toString((int) result));
    }
    

}