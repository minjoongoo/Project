package project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class PC {
	/**
	 *	int count = 0��  +, - ��ư�� �������� 0����
	 *	String show = "" �� ����
	 */
	int count = 0;
	String show = "";
	
	/**
	 * gui �並 �����Ѵ�
	 * @author User
	 *
	 */
	public PC() {
		/**
		 * �޴�â ����
		 * x ���������α׷� ����
		 * â ����������
		 * â ��� ����
		 * ��Ʈ
		 */
      
      JFrame frame = new JFrame("MENU");

      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setSize(1500,800);      
      
      frame.setBackground(Color.black);
      
  
      Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
      Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
      
     /**
      * ���ʿ� menu��� ��ư����
      * ��ư �ϳ�����
      * menu�� ���� �гλ���
      * �г� ���̾ƿ� gridlayout 1��1��
      */
      String[]m = {"MEUN"};
      JButton[] btns= new JButton[1];
      JPanel p1=new JPanel();
      p1.setLayout(new GridLayout(1,1));
      for(int i = 0; i < m.length; ++i) {
         btns[i] = new JButton(m[i]);
         p1.add(btns[i]);
               
      }
      /**
       * �޴�,���� �迭 ���� �κ�
       */
      String[] menu = {
            "�ʱ���","�Ŷ��","�����","��«��","������","ī�����","��¥�̸�","�Ҵߺ�����","�ع�����",
           "���������","�Ի캺����","���Ե���","ī��������","��ȭ������","����������","��ġ������","���캺����","���͹�",
           "����Ƣ��","ġ�ƽ","���Ҽ���","����Ƣ��","��     ��","���񸸵�","�ؽ�����","������","�ܻ�����",
           "�Ƹ޸�ī��","ī���","�ٴҶ��","��纣�� ������","���Ʈ ������","����������","ī��Ḷ���߶�","���⽺����","���ڽ�����",
           "�ݶ�","���̴�","�Ѷ�����̵�","��ġ��(����)","��ġ��(����)","��ġ��(û����)","�� �� ��","���̽�Ƽ","ȯŸ"

              
          };
          int price[] = {
                 3500, 3500, 3500, 3500, 3500, 3500, 3500, 3500, 3500,
                 4500, 4500, 4500, 4500, 4500, 4500, 4500, 4500, 4500,
                 3000, 3000, 3500, 4000, 2000, 3000, 3000, 3000, 2500,
                 2000, 2300, 2500, 3500, 3500, 3500, 2500, 3500, 3500,
                 1500, 1500, 1500, 1500, 1500, 1500, 1500, 1500, 1500
      
          };
         /**
          * ���Ĺ�ư�� �޴�������ŭ ���� 
          * ���� ���� �޴� ������ŭ ����
          * -��ư: �޴� ������ŭ ����
          * +��ư: �޴� ������ŭ ����
          * Ȯ��:  ��ư �޴� ������ŭ ����
          * ����:  �޴� ������ŭ ����
          * ������: �޴� ������ŭ ����
          * ���Ĺ�ư�� ���� �гλ��� 
          * ���̾ƿ��� ������ġ�� ����ҰŶ� null
          * ������
          * ��Ʈ
          */
         
         JButton bt[] = new JButton[menu.length];
         
          TextField num[] = new TextField[menu.length]; 
         
          Button minus[] = new Button[menu.length]; 
          
          Button plus[] = new Button[menu.length];
          
          JButton ok[] = new JButton[menu.length];
          
          Label l[] = new Label[menu.length];  
          
          ImageIcon icon[] = new ImageIcon[menu.length];
         
          Panel North = new Panel();
          
          North.setLayout(null);
          
          North.setSize(0, 500);
          North.setFont(font);

          
          /**
           * ��ư ���� �κ�
           * �������� ���� ����, ������ġ,������ġ,���α���,���α���
           * 
           */
      for (int i = 0; i < menu.length; i++) {
           
         bt[i] = new JButton(menu[i]);
            if (i  <6) {
               bt[i].setBounds(25 + i * 250, 50, 110, 100);		
            } else {
               
               bt[i].setBounds(25 + (i - 6) * 250, 300, 110, 100);   
            }
            
          /**
           * �������
           * �������� �־��ֱ�
           */
         icon[i] = new ImageIcon(i + ".png");
         bt[i].setIcon(icon[i]);
                  
         /**
          * ���� ���� ���� 0
          * ��� ���
          * ���� �����Ұ�
          * ���Ĺ�ư�� ���μ�����ġ�� �����ͼ� ������ġ,���α���,���α���
          */
         num[i] = new TextField("0");
         num[i].setBackground(Color.white);
         num[i].setEditable(false);
         num[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
       
         /**
         * -��ư ����
         * ���Ĺ�ư�� ������ġ�� ���ļ���(������ġ)�� �����ͼ� ���� ���α��� ����
         */
         minus[i] = new Button("-");
         minus[i].setBounds(bt[i].getX(), num[i].getY(), 20, 20);
         minus[i].setEnabled(false);
        
        /**
         * +��ư ����
         * ���Ĺ�ư�� ������ġ�� ���ļ���(������ġ)�� �����ͼ� ���� ���α��� ����
         */
         plus[i] = new Button("+");
         plus[i].setBounds(bt[i].getX() + (100 - 20), num[i].getY(), 20, 20);
         plus[i].setEnabled(false);
        
        /**
         * ���ݵڿ�"��"�ֱ� 
         * ���Ĺ�ư ������ġ,���ļ���(������ġ)�� �����ͼ� "��"�� ���μ��� ��������
         */
         l[i] = new Label(price[i] + "��");
         l[i].setBounds(bt[i].getX() + 20, num[i].getY() - 25, 100, 20);

        /**
         * Ȯ�ι�ư ����
         * ���Ĺ�ư�� ������ġ��, ���ļ���(������ġ)�� ������ Ȯ�ι�ư�� ���μ��� ��������
         */
         ok[i] = new JButton("Ȯ��");
         ok[i].setBounds(bt[i].getX(), num[i].getY() + 30, 100, 20);
         ok[i].setEnabled(false);

         /**
          * north�гο� ���Ĺ�ư
          * ���ļ���
          * -��ư
          * +��ư
          * "��" text
          * Ȯ�� ��ư �߰��ϱ�
          */
         North.add(bt[i]);
         North.add(num[i]);
         North.add(minus[i]);
         North.add(plus[i]);
         North.add(l[i]);
         North.add(ok[i]); 
      }
     
      /**
       * ������ ���� 300�� �ؽ�Ʈ�������ִ� ��ũ�ѹٸ� ���� â ����� 
       * 
       * ��� ���
       * ���� �Ұ���
       * ��Ʈ
       */
      TextArea ta = new TextArea("    ", 300, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
   
      ta.setText("   ��ǰ�ֹ����\n"+"   ��ǰ��        �Ǹűݾ�        ����        �����ݾ�\n\n");
     
      
      ta.setBackground(Color.white);
      ta.setEditable(false);
      ta.setFont(font1);
      /**
       * �������ϴܿ� j�г� ����
       * ��Ʈ����
       */
      JPanel pEast = new JPanel();
      pEast.setFont(font);
   
      /**
       * ��ư2
       * ��ư3
       * ��ư4
       * ��ư2,3,4�� ���̾ƿ��� 2��1���ι�ġ
       * ��ư3�� ������ pEast�� �ٿ��ֱ�
       * ��ư4�� ������ pEast�� �ٿ��ֱ�
       * ��ư2�� ������ pEast�� �ٿ��ֱ�
       * ��ư2,3,4�� ������
       */
      Button bt2 = new Button("��ǰ�ֹ��ϱ�");
      Button bt3= new Button("����(���ݰ���)");
      Button bt4= new Button("����(ī�����)");
      pEast.setLayout(new GridLayout(2,1));
      pEast.add(bt3);
   
      pEast.add(bt4);
      pEast.add(bt2);
    
      pEast.setSize(500,0);     
      

    /**
     * ��ư3 Ŭ���� �߻� �̺�Ʈ
     * joptionpane���� �����ұݾ� �Է¹ޱ�
     * joptionpane���� �����ұݾ��� �Է¹޾����� ���� �޼���
     */
      bt3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
           JOptionPane.showInputDialog(null, "������ �ݾ��� ���ּ���.");
            JOptionPane.showMessageDialog(null, "�����̿Ϸ�Ǿ����ϴ�.\n�ֹ���ư�� �����ּ���.");
          
            
               }
      });
        
      /**
       * ��ư4 Ŭ���� �߻� �̺�Ʈ
       * joptionpane���� �޼��� ���
       */
      bt4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "���������� ī�带 �ּ���.\n�ֹ���ư�� �����ּ���.");
            
         }
      });
     
      /**
       * ��ư2Ŭ���� �߻� �̺�Ʈ
       * �ֹ��ϱ� ��ư�� ������ ���� �޴��� �Է¹��� textâ�� �����ͼ� �޴��ݾ� ���
       * �޴���ư ��Ȱ��ȭ��Ű��
       * -��ư ��Ȱ��ȭ
       * +��ư ��Ȱ��ȭ
       * �ֹ���ư������ �ʱ�ȭ��Ű��
       */
      bt2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
            for (int i = 0; i < menu.length; i++) {
               bt[i].setEnabled(true);
               minus[i].setEnabled(false);
               plus[i].setEnabled(false);
               num[i].setText("0");
               ta.setText("   ��ǰ�ֹ����\n"+"    ��ǰ��       �Ǹűݾ�        ����       �����ݾ�\n\n");
               
            }
         }
      });

      /**
       * �޴��гο� �� ��ũ�ѹ� ���� 
       * ��ũ�ѹ� �׻� ���̰��ϱ�
       * �гλ���	
       * borderlayout���� ���̾ƿ�����
       * �޴���ư�� west���⿡ ����
       * ��ũ�ѹٴ� �޴��� �ִ� �߾ӿ� ���� 
       */
      JScrollPane scrollPane = new JScrollPane(North);
      scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      JPanel northPanel = new JPanel();
      northPanel.setLayout(new BorderLayout()); 
      northPanel.add(p1, BorderLayout.WEST);
      northPanel.add(scrollPane,BorderLayout.CENTER);
      
      /**
       * ���� ������� �гε��� north�����ӿ� �ֱ�
       * �ֹ���� text�� ������ �߾ӿ� �ֱ�
       * ��ǰ�ֹ� ���� ��ư���� ������ ���ʿ� �ֱ�
       * ������ ���̰��ϱ�
       */
      frame.add(northPanel, BorderLayout.NORTH);
      frame.add(ta, BorderLayout.CENTER);
      frame.add(pEast, BorderLayout.EAST);
      frame.setVisible(true);

      
      for (int i = 0; i < menu.length; i++) {
         int j = i;
         
         
         /**
          * ���� ��ư�������� �̺�Ʈ
          * -��ư Ȱ��ȭ
          *  +��ư Ȱ��ȭ
          *  ���Ĺ�ư ��Ȱ��ȭ
          *  ���ļ����� 0���� ����
          */
         bt[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               minus[j].setEnabled(true);
               plus[j].setEnabled(true);
               bt[j].setEnabled(false);
               ok[j].setEnabled(true);

               count = 0;
            }
         });

        /**
         * "-" ��ưŬ���� �̺�Ʈ
         * ���ļ��� 0���� ũ��
         * ���ļ� -1
         * -��ư�� �������� ������ ����
         * Ȯ�ι�ư Ȱ��ȭ
         * ���� ��Ȳ�� �ƴҽ� -��ư ��Ȱ��ȭ
         */
         minus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if (count > 0) {
                  count = count - 1;
                  num[j].setText(count + "");
                  ok[j].setEnabled(true);
               } else {
                  minus[j].setEnabled(false);
               }
               
            }
         });

        /**
         * "+" ��ưŬ�� �̺�Ʈ
         * ���ļ��� +1
         * +��ư �������� ������ ����
         * Ȯ�ι�ư Ȱ��ȭ
         * 0���� ���ļ����� ũ��
         * - ��ưȰ��ȭ
         */
         plus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               count = count + 1;
               num[j].setText(count + "");
               ok[j].setEnabled(true);
               if (count > 0) {
                  minus[j].setEnabled(true);
               }
               
            }
         });

       /**
        * Ȯ�� ��ưŬ�� �̺�Ʈ
        * �ι�ưŬ���� �ֹ��� ������ �����ͼ� textâ�� ���
        * �ѹ� ���õ� ������ Ȯ�ι�ư�� ��Ȱ��ȭ
        */
         ok[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               show = bt[j].getActionCommand();
               ta.append("   " + show + "        " + price[j] + "          " + count + "         " + price[j] * count
                     +   "��" + "\n");
               ok[j].setEnabled(false);
            }
         });
         
         

      }

   }

	public static void main(String[] args) {
		new PC();
	}

}