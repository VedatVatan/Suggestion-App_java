import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hw02 {
    public static void main (String [] args){

        JFrame f = new JFrame("Suggestion");
        JLabel l1,l2,l3; //Labels
        JTextField t1,t2,t3; // t1 and t2 text for game and application, you write your interest game or application
        JButton btn, rbtn; //reset button
        JRadioButton r1 = new JRadioButton("Game");
        r1.setBounds(100,30,100,30);
        JRadioButton r2 = new JRadioButton("Application");
        r2.setBounds(100,80,100,30);
        ButtonGroup bg = new ButtonGroup(); //Grouping for RadioButtons
        bg.add(r1); // Adding Radio Button 1 to group
        bg.add(r2);// Adding radio button 2 to group
        JTextArea textArea;


        l1 = new JLabel("Game");
        l1.setBounds(50,110,100,30);
        l1.setVisible(false);

        t1 = new JTextField();
        t1.setBounds(50,130,200,30);
        t1.setVisible(false); //TextField comes with Radio Button

        l2 = new JLabel("Application");
        l2.setBounds(50,170,100,30);
        l2.setVisible(false);

        t2 = new JTextField();
        t2.setBounds(50,200,200,30);
        t2.setVisible(false);//TextField comes with Radio Button

        l3 = new JLabel("Suggestions");
        l3.setBounds(50,330,200,30);
        l3.setVisible(true);

        t3 = new JTextField();
        t3.setBounds(50,350,200,30);
        t3.setVisible(true);
        t3.setEditable(false); //Disable Editing


        btn = new JButton("Suggestion"); //Suggestion Button
        btn.setBounds(50,290,100,30);

        rbtn = new JButton("Reset"); //Reset Button
        rbtn.setBounds(200,290,70,30);

        textArea = new JTextArea(50,90);




        f.add(r1);
        f.add(r2);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(btn);
        f.add(rbtn);
        f.setSize(400,500);
        f.add(textArea);
        f.add(l3);
        f.add(t3);
        f.setLayout(null);
        f.setVisible(true);

        r1.addActionListener(new ActionListener() { //Radio Button 1
            @Override
            public void actionPerformed(ActionEvent e) {

                if (r1.isSelected()&&!(r2.isSelected()))  {
                    l1.setVisible(true); t1.setVisible(true);
                }
                else {
                    l1.setVisible(false); t1.setVisible(false);
                }
                {
                }
            }
        });
        r2.addActionListener(new ActionListener() { //Radio Button 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r2.isSelected()&&!(r1.isSelected()))  {
                    l2.setVisible(true); t2.setVisible(true);
                }
                else { l2.setVisible(false); t2.setVisible(false);}

            }
        });
        btn.addActionListener(new ActionListener() { //Suggestion Button
            @Override
            public void actionPerformed(ActionEvent e) {

                if (t1.getText().equals("GTA Five")){ //If user write to GTA Five, app suggest the GPU
                    t3.setText("GTX 1060");


                } else if (t2.getText().equals("Photoshop")) {//If user write to Photoshop, app suggest the GPU
                    t3.setText("RTX 3070");

                } else t3.setText("Undefined Game / Application");


            }




        });

        rbtn.addActionListener(new ActionListener() { //Reset Button
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==rbtn){
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            }
        });
    }

}
