package GUI;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import parser.*;
import parser.Compiler;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
public class show extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String fname;
	public static File sf;
	public JTextArea area1;
	public JTextArea area2;
	public JTextArea area3;
//	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public void word_analysis()
	{
		String word="";
		Compiler.WordAnalysis();
		try {
			FileReader fr=new FileReader("WordAnalysis.txt");
			int rd=fr.read();
			while(rd!=-1)
			{
				word+=(char)rd;
				rd=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    area1.setText(word);//set text for textarea , change to tab1
		
	}
	public void grammar_analysis()
	{
		String tree="";
		try {
			
			FileReader fr=new FileReader("GrammerTree.txt");
			int rd=fr.read();
			while(rd!=-1)
			{
				tree+=(char)rd;
				rd=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		area2.setText(tree);//set text for textarea , change to tab2
	}
	
	public void content_analysis()
	{
		parser.Compiler.QTInfoTable();//��Ԫʽ��
		
		String sys="";
		try {
			FileReader fr=new FileReader("Systable.txt");
			int rd=fr.read();
			while(rd!=-1)
			{
				sys+=(char)rd;
				rd=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		area3.setText(sys);//set text for textarea , change to tab1
	}
	
	
	public static void main(String[] args) {
		try {
			show s = new show();
			s.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the frame.
	 */
	public show() {
		
		setBackground(new Color(255, 250, 205));
		setTitle("MiniC\u7F16\u8BD1\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 478);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u6D4B\u8BD5\u7A0B\u5E8F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 10, 295, 399);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(332, 10, 285, 399);
		contentPane.add(tabbedPane);
		
		JLayeredPane tab1 = new JLayeredPane();
		tab1.setToolTipText("");
		tabbedPane.addTab("词法分析", null, tab1, null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 280, 370);
		tab1.add(scrollPane_3);
		
		area1 = new JTextArea();
		scrollPane_3.setViewportView(area1);
		
		JLayeredPane tab2 = new JLayeredPane();
		tabbedPane.addTab("语法分析", null, tab2, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 280, 370);
		tab2.add(scrollPane_2);
		
		area2 = new JTextArea();
		scrollPane_2.setViewportView(area2);
		
		JLayeredPane tab3 = new JLayeredPane();
		tabbedPane.addTab("语义分析", null, tab3, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 280, 370);
		tab3.add(scrollPane_1);
		
	    area3 = new JTextArea();
		scrollPane_1.setViewportView(area3);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);


		JMenuItem menuItem = new JMenuItem("\u6253\u5F00");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jfc=new JFileChooser("./"); // 打开当前文件路径
				jfc.showOpenDialog(null);
				
				sf=jfc.getSelectedFile(); // 获取文件
				fname=sf.getAbsolutePath();
				
				String source=""; // 保存文件内容
				try {
					// 读取文件
					FileReader fr=new FileReader(fname); 
					int rd=fr.read();
					while(rd!=-1)
					{
						source+=(char)rd;
						rd=fr.read();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				textArea.setText(source); // 显示文件内容
				// 读入jjt
				FileInputStream fileStream;
				Compiler parser;
		        try {
		                  fileStream = new FileInputStream(sf);
		                  parser = new Compiler(fileStream);
		         try {
		        	 
		                         SimpleNode n = parser.Start();
		                         n.clearnTxt();
		                         n.dump("");
		                 fileStream.close();
		                 } catch (Exception e) {
		                        System.out.println("NOK.");
		                        System.out.println(e.getMessage());
		                        parser.ReInit(System.in);
		                 } catch (Error e) {
		                        System.out.println("Oops.");
		                        System.out.println(e.getMessage());
		                }
		        } catch (FileNotFoundException e1) {
		                e1.printStackTrace();
		        }
		        word_analysis();
				grammar_analysis();
				content_analysis();
				Compiler.count=0; //四元式标号
				Compiler.ncount=0; //临时变量下标
				Compiler.j=0;
				Compiler.mylist.clear();//结点集合
				Compiler.myQTInfo.clear(); //四元式
				Compiler.table.clear();//四元式链表，用来存储结果
				Compiler.myNodeList.clear();//封装结点集合，对结点进行处理
				    
			}
			
		});
		
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5173\u4E8E");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextArea group=new JTextArea("项目组成员：\n软件132 郝金强，软件143 杨帅，软件143 岳冠桥\n软件143 王鹤淳，软件143 程虹翔，软件143 宁林");
				Font font = new Font("宋体", Font.BOLD, 18);
				group.setFont(font);
				JOptionPane.showMessageDialog(null, group, "成员信息", JOptionPane.PLAIN_MESSAGE);
			}
		});
		menu_1.add(menuItem_2);
		
	}
}
