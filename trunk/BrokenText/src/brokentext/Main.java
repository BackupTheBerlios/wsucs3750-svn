
package cs3750;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main
{
   private static String output;
   
   public Main()
   {
      addText1();
      addText2();
      addText3();
      addText4();
      addText5();
      addText6();
      addText7();
      addText8();
      addText9();
      addText10();
      addText11();
      addText12();
      addText13();
      addText14();
      addText15();
      addText16("that subversion has to offer.");
      addText17();
      addText18();
      addText19();
      addText20();
      
      JScrollPane jsp = new JScrollPane(new JTextArea(output));
      jsp.setPreferredSize(new java.awt.Dimension(500,150));
      JOptionPane.showMessageDialog(null, jsp,"Subversion Presentation",
	      JOptionPane.INFORMATION_MESSAGE, null);
      
   }
   public void addText1()
   {
      output = "I am broken!!";
   }
   
   public void addText2()
   {
      output += "I am broken!!";
   }
   
   public void addText3()
   {
      output += "I am broken!!";
   }
   
   public void addText4()
   {
      output += "one program at the same time. ";
   }
   
   public void addText5()
   {
      output += "As long as updating and committing ";
   }
   
   public void addText6()
   {
      output += "Take place everyone\n will be not-able ";
   }
   
   public void addText7()
   {
      output += "to see the progress ";
   }
   
   public void addText8()
   {
      output += "I am broken!!\n";
   }
   
   public void addText9()
   {
      output += "I am broken!!";
   }
   
   public void addText10()
   {
      output += "I am broken!!";
   }
   
   public void addText11()
   {
      output += "if they do a final awesome update. ";
   }
   
   public void addText12()
   {
      output += "I am broken!!\n";
   }
   
   public void addText13()
   {
      output += "a\n very simple programming example, ";
   }
   
   public void addText14()
   {
      output += "but we do hope you have ";
   }
   
   public void addText15()
   {
      output += "learned about some of the\n valuable tools ";
   }
   
   public void addText16()
   {
      output += "I am broken!!\n";
   }
   public void addText17()
   {
      output += "We thank all of you for your $20 donations and";
   }
   public void addText18()
   {
      output += "I am broken!!";
   }
   public void addText19()
   {
      output += "I am broken!!";
   }
   public void addText20()
   {
      output += "I am broken!!";
   }
   
   public static void main(String[] args)
   {
      Main main = new Main();
   }
   
}
