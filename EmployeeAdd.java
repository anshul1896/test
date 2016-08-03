/****************************************************************/
/*                      EmployeeAdd	                            */
/*                                                              */
/****************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Summary description for EmployeeAdd
 *
 */
public class EmployeeAdd extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JLabel lblmsg;
	private JTextField txteid;
	private JTextField txtename;
	private JTextField txtesalary;
	private JButton txtsave;
	private JButton txtclear;
	private JPanel contentPane;
	// End of variables declaration


	public EmployeeAdd()
	{
		super();
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */
	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel4 = new JLabel();
		lblmsg = new JLabel();
		txteid = new JTextField();
		txtename = new JTextField();
		txtesalary = new JTextField();
		txtsave = new JButton();
		txtclear = new JButton();
		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setText("EMPLOYEE ID");
		//
		// jLabel2
		//
		jLabel2.setText("EMPLOYEE NAME");
		//
		// jLabel4
		//
		jLabel4.setText("SALARY");
		//
		// lblmsg
		//
		//
		// txteid
		//
		txteid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txteid_actionPerformed(e);
			}

		});
		//
		// txtename
		//
		txtename.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtename_actionPerformed(e);
			}

		});
		//
		// txtesalary
		//
		txtesalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtesalary_actionPerformed(e);
			}

		});
		//
		// txtsave
		//
		txtsave.setText("SAVE");
		txtsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtsave_actionPerformed(e);
			}

		});
		//
		// txtclear
		//
		txtclear.setText("CLEAR ALL");
		txtclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtclear_actionPerformed(e);
			}

		});
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, jLabel1, 53,45,71,18);
		addComponent(contentPane, jLabel2, 53,86,90,18);
		addComponent(contentPane, jLabel4, 54,126,60,18);
		addComponent(contentPane, lblmsg, 202,274,60,18);
		addComponent(contentPane, txteid, 155,43,100,22);
		addComponent(contentPane, txtename, 155,82,100,22);
		addComponent(contentPane, txtesalary, 155,123,100,22);
		addComponent(contentPane, txtsave, 109,217,83,28);
		addComponent(contentPane, txtclear, 237,217,99,28);
		//
		// EmployeeAdd
		//
		this.setTitle("Employee Addition");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(813, 532));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//
	// TODO: Add any appropriate code in the following Event Handling Methods
	//
	private void txteid_actionPerformed(ActionEvent e)
	{
		System.out.println("\ntxteid_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void txtename_actionPerformed(ActionEvent e)
	{
		System.out.println("\ntxtename_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void txtesalary_actionPerformed(ActionEvent e)
	{
		System.out.println("\ntxtesalary_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void txtsave_actionPerformed(ActionEvent e)
	{
		System.out.println("\ntxtsave_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void txtclear_actionPerformed(ActionEvent e)
	{
		System.out.println("\ntxtclear_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	//
	// TODO: Add any method code to meet your needs in the following area
	//






























 

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new EmployeeAdd();
	}
//= End of Testing =


}
