
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Layout extends JFrame {

	private Entry [] entryArray = new Entry[10000];
	public int cur=0;
    protected JLabel lblStudentId;
    protected JLabel lblStudentName;

    protected JLabel lblentryNumber;
    protected JLabel lblentryNumberValue;

    protected JLabel lblentryDate;
    protected JTextField txtentryDate;

    protected JLabel lblName;
    protected JTextField txtName;

    protected JLabel lblContactNumber;
    protected JTextField txtContactNumber;

    protected JLabel lblAddress;
    protected JTextField txtAddress;

 
    protected JLabel lblHorse_power;
    protected JTextField txtHorse_power;
    protected JLabel lblZones;
    protected JTextField txtZones;
    protected JLabel lblOutlets;
    protected JTextField txtOutlets;
    protected JLabel lblInstlPeriod;
    protected JLabel lblstartDate;
    protected JTextField txtstartDate;
    protected JLabel lblendDate;
    protected JTextField txtendDate;

    protected JTextArea message;
    protected JTextArea texttoshow;
    
    protected JButton btnClear;
    protected JButton btnExit;
    protected JButton btnAddEntry;
    protected JButton btnshowentries;
    protected JButton btnsearch;
    protected JButton btnload;
    protected JButton btnsave;
    
    protected JPanel pnlInfor;
    protected JPanel pnlACInfor;
    protected JPanel pnlConbine1;
    protected JPanel pnlConbine2;
    protected JPanel pnlConbine3;
    protected JPanel pnlConbine4;
    protected JPanel pnlConbine5;
    protected JPanel pnlwholeEntry;
    protected JPanel pnlPeriod;
    protected JPanel pnlPeriod1;
    protected JPanel pnlControlBar;

    public Layout() {
        super("COIT11134  Assignment 2");

        lblStudentId = new JLabel("                           12345678\n");
        lblStudentName = new JLabel("                                                 Abhi J Patel");

        lblentryNumber = new JLabel("  Entry Number");
        int entryNumber = Entry.getcurEntry();
        lblentryNumberValue = new JLabel(entryNumber + "");

        lblentryDate = new JLabel("  Date");
        txtentryDate = new JTextField(25);

        lblName = new JLabel("  Technician Name");
        txtName = new JTextField(25);

        lblContactNumber = new JLabel("  Contact Number");
        txtContactNumber = new JTextField(25);

        lblAddress = new JLabel("  Address of Installation");
        txtAddress = new JTextField(25);

        pnlInfor = new JPanel();
        pnlInfor.setLayout(new GridLayout(6,2,-90,5));
        pnlInfor.add(lblStudentName);
        pnlInfor.add(lblStudentId);
        pnlInfor.add(lblentryNumber);
        pnlInfor.add(lblentryNumberValue);
        pnlInfor.add(lblentryDate);
        pnlInfor.add(txtentryDate);
        pnlInfor.add(lblName);
        pnlInfor.add(txtName);
        pnlInfor.add(lblContactNumber);
        pnlInfor.add(txtContactNumber);
        pnlInfor.add(lblAddress);
        pnlInfor.add(txtAddress);
        //pnlInfor.setPreferredSize(new Dimension(400, 200));
        //pnlInfor.setMaximumSize(pnlInfor.getPreferredSize());
        //pnlInfor.setMinimumSize(pnlInfor.getPreferredSize());
       
        lblHorse_power = new JLabel("  Horse Power of AC");
        txtHorse_power = new JTextField(25);
        lblZones = new JLabel("  Number of Zones in AC");
        txtZones = new JTextField(25);
        lblOutlets = new JLabel("  Number of Outlets in AC");
        txtOutlets = new JTextField(25);

        pnlACInfor = new JPanel();
        pnlACInfor.setLayout(new GridLayout(3, 2,-90,5));
        pnlACInfor.add(lblHorse_power);
        pnlACInfor.add(txtHorse_power);
        pnlACInfor.add(lblZones);
        pnlACInfor.add(txtZones);
        pnlACInfor.add(lblOutlets);
        pnlACInfor.add(txtOutlets);
        //pnlACInfor.setPreferredSize(new Dimension(100, 200));
       // pnlACInfor.setMaximumSize(pnlACInfor.getPreferredSize());
        //pnlACInfor.setMinimumSize(pnlACInfor.getPreferredSize());
        
        pnlConbine1=new JPanel();
        pnlConbine1.setLayout(new BorderLayout(50,10));
        //pnlConbine1.setLayout(new GridLayout(1,2,0,5));
        pnlConbine1.add(pnlInfor, BorderLayout.NORTH);
        pnlConbine1.add(pnlACInfor, BorderLayout.SOUTH);
        
        lblInstlPeriod = new JLabel(" Installation Period");
        lblstartDate = new JLabel("  Start Date");
        txtstartDate = new JTextField(25);
        lblendDate = new JLabel("  End Date");
        txtendDate = new JTextField(25);
        
        pnlPeriod = new JPanel();
        pnlPeriod.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlPeriod.add(lblInstlPeriod);
        
        pnlPeriod1 = new JPanel();
        pnlPeriod1.setLayout(new GridLayout(3, 2,-100,5));
        pnlPeriod1.add(lblstartDate);
        pnlPeriod1.add(txtstartDate);
        pnlPeriod1.add(lblendDate);
        pnlPeriod1.add(txtendDate);

        pnlConbine2 = new JPanel();
        pnlConbine2.setLayout(new BorderLayout());
        pnlConbine2.add(pnlPeriod, BorderLayout.NORTH);
        pnlConbine2.add(pnlPeriod1, BorderLayout.SOUTH);

        pnlwholeEntry = new JPanel();
        pnlwholeEntry.setLayout(new BorderLayout());
        pnlwholeEntry.add(pnlConbine1, BorderLayout.NORTH);
        pnlwholeEntry.add(pnlConbine2, BorderLayout.SOUTH);

        message = new JTextArea(24,35);
        message.setBackground(Color.LIGHT_GRAY);
        message.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        message.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        texttoshow = new JTextArea(24, 35);
        pnlConbine3 = new JPanel();
        pnlConbine3.add(new JScrollPane(message));

        pnlConbine4 = new JPanel();
        pnlConbine4.setLayout(new BorderLayout());
        pnlConbine4.add(pnlwholeEntry, BorderLayout.WEST);
        pnlConbine4.add(pnlConbine3, BorderLayout.EAST);

        btnAddEntry = new JButton("Add Entry");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        btnshowentries = new JButton("Show Entries");
        btnsearch = new JButton("Search");
        btnload = new JButton("Load");
        btnsave = new JButton("Save");
        pnlControlBar = new JPanel();
        pnlControlBar.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));
        pnlControlBar.add(btnAddEntry);
        pnlControlBar.add(btnload);
        pnlControlBar.add(btnsave);
        pnlControlBar.add(btnsearch);
        pnlControlBar.add(btnshowentries);
        pnlControlBar.add(btnClear);
        pnlControlBar.add(btnExit);
        
        
        

        pnlConbine5 = new JPanel();
        pnlConbine5.setLayout(new BorderLayout());
        pnlConbine5.add(pnlConbine4, BorderLayout.NORTH);
        pnlConbine5.add(pnlControlBar, BorderLayout.SOUTH);

        this.add(pnlConbine5);
        this.addListeners();
        this.load();
        this.toempty();
    }

    public void addListeners() {

        btnClear.addActionListener((ActionEvent e) -> {
            clear();
        });

        btnAddEntry.addActionListener((ActionEvent e)-> {
        	EntryListener();
        });
        btnshowentries.addActionListener((ActionEvent e) ->{
        	showdetails();
        });
        btnExit.addActionListener((ActionEvent e) -> {
            clear();
            System.exit(0);
        });
        btnload.addActionListener((ActionEvent e) ->{
        	load();
        });
        btnsave.addActionListener((ActionEvent e) ->{
        	save();
        });
        btnsearch.addActionListener((ActionEvent e) ->{
        	search();
        });
    }
    //implements ActionListener
    public void EntryListener()  
    {

       // @Override
            message.setText("");

            if(checkFields()) {
            Entry aEntry = doEntry();

            clear();
            int entryNumber = Entry.getcurEntry();
            lblentryNumberValue.setText(entryNumber + "");
            JOptionPane.showMessageDialog(new JFrame(),"Your details has been entered.", "Notification", JOptionPane.PLAIN_MESSAGE);
            }

    }

    public void clear() 
    {
        txtentryDate.setText("");
        txtName.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        txtHorse_power.setText("");
        txtZones.setText("");
        txtOutlets.setText("");
        txtstartDate.setText("");
        txtendDate.setText("");
        message.setText("");
    }

    public Entry doEntry() {

        String entryDate;
        entryDate = txtentryDate.getText();
        InstlDetails technician = new InstlDetails();
        technician.setName(txtName.getText());
        technician.setContactNumber(txtContactNumber.getText());
        technician.setstartDate(txtstartDate.getText());
        technician.setendDate(txtendDate.getText());
        
        Address aAddress = new Address();
        aAddress.setAdrsOfInstl(txtAddress.getText());
        aAddress.setHorse_power(Double.parseDouble(txtHorse_power.getText()));
        aAddress.setZones(Integer.parseInt(txtZones.getText()));
        aAddress.setOutlets(Integer.parseInt(txtOutlets.getText()));
        Entry aEntry=new Entry(entryDate,technician,aAddress);
        entryArray[cur++]=aEntry;
        
        write();
        return aEntry;
    }
    
    public void showdetails()
    {
    	texttoshow.setText("");
    	if(cur==0)
    	{
    		JOptionPane.showMessageDialog(new JFrame(),"There is no any entry entered after your last visit.", "Notification", JOptionPane.PLAIN_MESSAGE);
    		message.setText("");
    		return;
    	}
    	texttoshow.setText(" New entries intered after your last visit:\n");
    	for(int i=0;i<cur;i++)
    	{
    		//entryArray[i].getAddress().getAdrsOfInstl()+" "+entryArray[i].getInstlDetails().getName()+" "+entryArray[i].getInstlDetails().getcontactNumber();
    		//texttoshow.append(String.format("%s % s %s\n", entryArray[i].getAddress().getAdrsOfInstl(),entryArray[i].getInstlDetails().getName(),entryArray[i].getInstlDetails().getcontactNumber()));
    		texttoshow.setText(texttoshow.getText()+"\n"+" Entry :"+(i+1));
    		texttoshow.setText(texttoshow.getText()+"\n"+"   Address: "+entryArray[i].getAddress().getAdrsOfInstl());
    		texttoshow.setText(texttoshow.getText()+"\n"+"   Name: "+entryArray[i].getInstlDetails().getName());
    		texttoshow.setText(texttoshow.getText()+"\n"+"   Cont No.: "+entryArray[i].getInstlDetails().getcontactNumber());
    	}
    	message.setText(texttoshow.getText());
    	
    }
    
    protected boolean checkFields() {

        /*return checkentryDate() & checkName() & checkContactNumber()
                & checkAddress() & checkstartDate() & checkendDate()
                & checkHorse_power() & checkZones() & checkOutlets();*/
        if(txtentryDate.getText().equals("") || txtName.getText().equals("") || txtContactNumber.getText().equals("") ||
        		txtAddress.getText().equals("") || txtstartDate.getText().equals("") || txtendDate.getText().equals("") ||
        		txtHorse_power.getText().equals("") || txtZones.getText().equals("") || txtOutlets.getText().equals(""))
        {
        	String s="You must enter these details :";
        	if(txtentryDate.getText().equals("")) s=s+" Entry Date,";
        	if(txtName.getText().equals("")) s=s+" Technician Name,";
        	if(txtContactNumber.getText().equals("")) s=s+" Contact Number,";
        	if(txtAddress.getText().equals("")) s=s+" Address,";
        	if(txtHorse_power.getText().equals("")) s=s+" Horse Power,";
        	if(txtZones.getText().equals("")) s=s+" Number of Zones,";
        	if(txtOutlets.getText().equals("")) s=s+" Number of Outlets,";
        	if(txtstartDate.getText().equals("")) s=s+" Start Date,";
        	if(txtendDate.getText().equals("")) s=s+" End Date,";
        	s = s.replace((char) (s.length() - 1), '.');
        	JOptionPane.showMessageDialog(new JFrame(),s, "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(!validateDate(txtentryDate.getText()))
        {
        	JOptionPane.showMessageDialog(new JFrame(),"Entry Date should be in format 'mm/dd/yyyy'.", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(txtContactNumber.getText().length()!=10)
        {
        	JOptionPane.showMessageDialog(new JFrame(),"Contact Number must be of length 10!", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(!checkNumber(txtZones.getText())) 
        {
        	JOptionPane.showMessageDialog(new JFrame(),"Number of zones should be a positive number.", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(!checkNumber(txtOutlets.getText())) 
        {
        	JOptionPane.showMessageDialog(new JFrame(),"Number of outlets should be a positive number.", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(!validateDate(txtstartDate.getText()))
        {
        	JOptionPane.showMessageDialog(new JFrame(),"Start Date should be in format 'mm/dd/yyyy'.", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        if(!validateDate(txtendDate.getText()))
        {
        	JOptionPane.showMessageDialog(new JFrame(),"End Date should be in format 'mm/dd/yyyy'.", "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        return true;
        
    }
    
    protected boolean checkentryDate() {
        // no values in the field- not fully checking for day, month and year
        if (txtentryDate.getText().equals("")) {
            message.setText(message.getText() + " \n  Enter date.\n");
            
            return false;
        } else {
            return true;
        }
    }

    protected boolean checkName() {
        if (txtName.getText().equals("")) {
            message.setText(message.getText() + "  Enter Technician name.\n");
            
            return false;
        } else {
            return true;
        }
    }
    
    protected boolean checkContactNumber() {
        if (txtContactNumber.getText().equals("")) {
            message.setText(message.getText() + "  Enter Technician's contact number.\n");
            
            return false;
        } else {
            return true;
        }
    }    

    protected boolean checkAddress() {
        if (txtAddress.getText().equals("")) {
          message.setText(message.getText() + "  Enter installation address.\n");

            return false;
        } else {
            return true;
        }
    }
    
    protected boolean checkstartDate() {
    	if (txtstartDate.getText().equals("")) {
            message.setText(message.getText() + "  Enter start date of installation.\n");
            
            return false;
        } else {
            return true;
        }
    }

    
    
    protected boolean checkendDate() {
    	if (txtendDate.getText().equals("")) {
            message.setText(message.getText() + "  Enter end date of installation.\n");
            
            return false;
        } else {
            return true;
        }
    }
    
    protected boolean checkHorse_power() {
    	if (txtHorse_power.getText().equals("")) {
            message.setText(message.getText() + "  Enter Horsepower of AC.\n");
            
            return false;
        } else {
            return true;
        }
    }

    protected boolean checkZones() {
    	if (txtZones.getText().equals("")) {
            message.setText(message.getText() + "  Enter zones of AC.\n");
             
            return false;
        } else {
            return true;
        }
    }
    
    protected boolean checkOutlets() {
    	if (txtOutlets.getText().equals("")) {
            message.setText(message.getText() + "  Enter Outlets of AC.\n");
            
            return false;
        } else {
            return true;
        }
    }   
    public boolean validateDate(String strDate)
    {
	 	/* Check if date is 'null' */
	 	if (strDate.trim().equals(""))
	 	{
	 	    return true;
	 	}
	 	/* Date is not 'null' */
	 	else
	 	{
	 	    /*
	 	     * Set preferred date format,
	 	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	 	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	 	    sdfrmt.setLenient(false);
	 	    /* Create Date object
	 	     * parse the string into date 
	              */
	 	    try
	 	    {
	 	        Date javaDate = sdfrmt.parse(strDate); 
	 	        System.out.println(strDate+" is valid date format");
	 	    }
	 	    /* Date format is invalid */
	 	    catch (ParseException e)
	 	    {
	 	        System.out.println(strDate+" is Invalid Date format");
	 	        return false;
	 	    }
	 	    /* Return true if date format is valid */
	 	    return true;
	 	}
    }
    public boolean checkNumber(String s)
    {
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2' && s.charAt(i)!='3' && s.charAt(i)!='4' && s.charAt(i)!='5' &&
    				s.charAt(i)!='6' && s.charAt(i)!='7' && s.charAt(i)!='8' && s.charAt(i)!='9')
    		{
    			return false;
    		}
    	}
    	return true;
    }
    public void toempty()
    {
		try 
		{
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/A:/Abhi_assignment/java assi 2/AC2/src/cur_details.txt"));
            bufferedWriter.write("");
            bufferedWriter.close();
		} 
		catch(IOException ex) 
		{
            System.out.println("Error writing to file");
        }
    	
    }
    public void load()
    {
    	BufferedReader reader;
        try {
            reader=new BufferedReader(new FileReader("/A:/Abhi_assignment/java assi 2/AC2/src/details.txt"));
            String line;
            message.setText(" Total Records till now");
            int t=1;
            while((line = reader.readLine())!=null) 
            {
            	message.setText(message.getText()+"\n"+" Entry :"+t+"\n");
            	message.setText(message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	line = reader.readLine();
            	
            	message.setText(message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	message.setText(message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	message.setText(message.getText()+"    "+line+"\n");
            	line = reader.readLine();
                message.setText(message.getText()+"    "+line+"\n");
                line = reader.readLine();
                message.setText(message.getText()+"    "+line+"\n");
                line = reader.readLine();
                message.setText(message.getText()+"    "+line+"\n");
                t++;
                
            }
            if(t==1)
            {
            	message.setText("There is no any new entry to show.");
            	//JOptionPane.showMessageDialog(new JFrame(),"", "Notification", JOptionPane.PLAIN_MESSAGE);
            }
            reader.close();        
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file");                  
        }
    }
    
    public void save()
    {
    	try {
    		BufferedReader reader=new BufferedReader(new FileReader("/A:/Abhi_assignment/java assi 2/AC2/src/cur_details.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("/A:/Abhi_assignment/java assi 2/AC2/src/details.txt",true));
            String line;
            message.setText(" New Saved Data :\n");
            int t=1;
            while((line=reader.readLine())!=null) 
            {
            	if(line.indexOf("Technician Name")==0)
                {
                	message.setText(message.getText()+"\n Entry : "+t+"\n");
                	t++;
                }
            	//Message.setText(Message.getText()+"\nEntry : "+t+"\n");
            	message.setText(message.getText()+"    "+line+"\n");
            	writer.write(line);
                writer.newLine();
            }
            if(t==1)
            {
            	message.setText("");
            	JOptionPane.showMessageDialog(new JFrame(),"There is no any new entry to be stored.", "Notification", JOptionPane.PLAIN_MESSAGE);
            }
            reader.close();
            writer.close();
        }
    	catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file");                  
        }
    	toempty();
    }
    
    public void search() {
    	String Technicianname=JOptionPane.showInputDialog(new JFrame(),"Enter a technician name to search","search",JOptionPane.PLAIN_MESSAGE);
		
		if(Technicianname.equals("")) 	// check whether user entered technician name or not?
		{
			JOptionPane.showMessageDialog(new JFrame(),"You must enter a search name","Warning",JOptionPane.ERROR_MESSAGE);
			return ;
		}
		String line;
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader("/A:/Abhi_assignment/java assi 2/AC2/src/details.txt"));
			int i=1;
			while((line=reader.readLine())!=null)
			{
				//Message.setText(Message.getText()+line.substring(7)+"\n"+Technicianname+"\n");
				if(line.contains(Technicianname))
				{
					if(i==1)
					{
						message.setText(" Installations that done by "+Technicianname+"\n\n");
					}
					message.setText(message.getText()+"  ("+i+")\n");
					//Message.setText(Message.getText()+"    "+line+"\n");
					line=reader.readLine();
					for(int j=0;j<6;j++)
					{
						line=reader.readLine();
						message.setText(message.getText()+"    "+line+"\n");
					}
					message.setText(message.getText()+"\n");
					i++;
				}
				else
				{
					for(int j=0;j<7;j++)
					{
						line=reader.readLine();
						//Message.setText(Message.getText()+"    "+line+"\n");
					}
				}
			}
			if(i==1)
			{
				message.setText("  Any record with name '"+Technicianname+"' is not found");
			}
			reader.close();
		}
		catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file");                  
        }
    }
    public void write()
    {
    	 try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/A:/Abhi_assignment/java assi 2/AC2/src/cur_details.txt",true));
            //bufferedWriter.write("");
          
            bufferedWriter.write("Technician Name : "+txtName.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Contact no : "+txtContactNumber.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Addres : "+txtAddress.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Start date : "+txtstartDate.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("End date : "+txtendDate.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Horse-power of AC : "+txtHorse_power.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("#Zones : "+txtZones.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("#Outlets : "+txtOutlets.getText());
            bufferedWriter.newLine();

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file");
        }
    }
}
