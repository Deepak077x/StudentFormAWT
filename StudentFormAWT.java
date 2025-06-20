import java.awt.*;
import java.awt.event.*;
import java.io.*;
class StudentFormAWT extends Frame implements ActionListener{
	Panel pnl;
	Button btn;
	TextField roll,name,branch;
	Label lbl;

	StudentFormAWT(){
	setTitle("record");
	setVisible(true);
	setSize(500,300);
	
	pnl=new Panel();
	pnl.setLayout(new GridLayout(4, 2, 10, 10));
	pnl.setBackground(Color.green);

	lbl=new Label("ROll no: ");
	pnl.add(lbl);
	roll=new TextField(20);
	pnl.add(roll);
        

	lbl=new Label("Name: ");
	pnl.add(lbl);
        name = new TextField(20);
        pnl.add(name);


	lbl=new Label("branch: ");
	pnl.add(lbl);
        branch = new TextField(20);
        pnl.add(branch);
	

	btn=new Button("Submit");
	btn.addActionListener(this);
	pnl.add(btn);
	

	add(pnl);
        
	}
	  public void actionPerformed(ActionEvent e) {
        String r = roll.getText();
        String n = name.getText();
        String b = branch.getText();

        try {
            FileWriter fw = new FileWriter("StudentRecord.txt", true);
            fw.write("Roll No: " + r + ", Name: " + n + ", Branch: " + b + "\n");
            fw.close();
            System.out.println("Data saved successfully.");
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }
		
	public static void main(String[] args){
		new StudentFormAWT();

		

	}
}