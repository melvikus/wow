package wow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.DropMode;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainfr {

	private JFrame frmWow;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					SqlReplace a = new SqlReplace(new String[]{"a","aa"});
					mainfr window = new mainfr();
					window.frmWow.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainfr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWow = new JFrame();
		frmWow.setTitle("WOW");
		frmWow.setIconImage(Toolkit.getDefaultToolkit().getImage(mainfr.class.getResource("/resource/wrench.png")));
		frmWow.setBounds(100, 100, 727, 559);
		frmWow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWow.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmWow.getContentPane().add(tabbedPane, "name_76883163807562");
		
		JPanel panelSQLReplace = new JPanel();
		tabbedPane.addTab("SQL replace", null, panelSQLReplace, null);
		panelSQLReplace.setLayout(new MigLayout("", "[grow]", "[50][grow]"));
		
		textField = new JTextField();
		panelSQLReplace.add(textField, "flowx,cell 0 0");
		textField.setColumns(10);
		
		JPanel panelSqlReplaceSettings = new JPanel();
		panelSQLReplace.add(panelSqlReplaceSettings, "cell 0 0,growx,aligny top");
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panelSQLReplace.add(splitPane, "cell 0 1,grow");
		
		
		JTextPane textPane_2 = new JTextPane();
		
		
		JScrollPane txtpnDfsdfsf = new JScrollPane(textPane_2);
		txtpnDfsdfsf.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		txtpnDfsdfsf.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane.setLeftComponent(txtpnDfsdfsf);
		


		
		JPanel panelVysledek = new JPanel();
		splitPane.setRightComponent(panelVysledek);
		panelVysledek.setLayout(new MigLayout("", "[grow]", "[20][grow]"));
		
		JPanel panelVysledekButtons = new JPanel();
		panelVysledek.add(panelVysledekButtons, "cell 0 0,growx,aligny top");
		
		JButton btnKoprovatDoSchrnky = new JButton("Kop\u00EDrovat do schr\u00E1nky");

		panelVysledekButtons.add(btnKoprovatDoSchrnky);
		
		JTextPane textPaneVysledek = new JTextPane();
		
		JScrollPane scrollPaneVysledek = new JScrollPane(textPaneVysledek);
		scrollPaneVysledek.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneVysledek.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelVysledek.add(scrollPaneVysledek, "cell 0 1,grow");
		
		JPanel panelTest = new JPanel();
		tabbedPane.addTab("test", null, panelTest, null);
		panelTest.setLayout(new MigLayout("", "[grow]", "[grow][grow]"));
		
		JPanel panel_2 = new JPanel();
		panelTest.add(panel_2, "cell 0 0,grow");
		

		btnKoprovatDoSchrnky.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textField.getText()
				textPaneVysledek.setText( textPane_2.getText().replaceAll( textField.getText() , "")   );
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frmWow.setJMenuBar(menuBar);
		
		JMenu mnHlavn = new JMenu("Hlavn\u00ED");
		menuBar.add(mnHlavn);
		
		JMenuItem mntmUkonit = new JMenuItem("Ukon\u010Dit");
		mntmUkonit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnHlavn.add(mntmUkonit);
	}
}
