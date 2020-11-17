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
	 *	int count = 0은  +, - 버튼을 눌렀을때 0시작
	 *	String show = "" 은 공백
	 */
	int count = 0;
	String show = "";
	
	/**
	 * gui 뷰를 생성한다
	 * @author User
	 *
	 */
	public PC() {
		/**
		 * 메뉴창 생성
		 * x 누르면프로그램 종료
		 * 창 사이즈조절
		 * 창 배경 검정
		 * 폰트
		 */
      
      JFrame frame = new JFrame("MENU");

      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setSize(1500,800);      
      
      frame.setBackground(Color.black);
      
  
      Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
      Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
      
     /**
      * 왼쪽에 menu라는 버튼생성
      * 버튼 하나생성
      * menu를 넣을 패널생성
      * 패널 레이아웃 gridlayout 1열1항
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
       * 메뉴,가격 배열 설정 부분
       */
      String[] menu = {
            "너구리","신라면","진라면","진짬뽕","육개장","카레라면","진짜쫄면","불닭복음면","해물탕면",
           "계란볶음밥","게살볶음밥","스팸덮밥","카레볶음밥","중화볶음밥","낚지볶음밥","김치볶음밥","새우볶음밥","버터밥",
           "감자튀김","치즈스틱","모듬소세지","새우튀김","쥐     포","갈비만두","해쉬브라운","떡볶이","콘샐러드",
           "아메리카노","카페라떼","바닐라라떼","블루베리 스무디","요거트 스무디","녹차스무디","카라멜마끼야또","딸기스무디","초코스무디",
           "콜라","사이다","한라봉에이드","웰치스(포도)","웰치스(딸기)","웰치스(청포도)","쿨 피 스","아이스티","환타"

              
          };
          int price[] = {
                 3500, 3500, 3500, 3500, 3500, 3500, 3500, 3500, 3500,
                 4500, 4500, 4500, 4500, 4500, 4500, 4500, 4500, 4500,
                 3000, 3000, 3500, 4000, 2000, 3000, 3000, 3000, 2500,
                 2000, 2300, 2500, 3500, 3500, 3500, 2500, 3500, 3500,
                 1500, 1500, 1500, 1500, 1500, 1500, 1500, 1500, 1500
      
          };
         /**
          * 음식버튼을 메뉴개수만큼 생성 
          * 음식 수량 메뉴 개수만큼 생성
          * -버튼: 메뉴 개수만큼 생성
          * +버튼: 메뉴 개수만큼 생성
          * 확인:  버튼 메뉴 개수만큼 생성
          * 가격:  메뉴 개수만큼 생성
          * 아이콘: 메뉴 개수만큼 생성
          * 음식버튼을 넣을 패널생성 
          * 레이아웃은 절대위치를 사용할거라 null
          * 사이즈
          * 폰트
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
           * 버튼 설정 부분
           * 왼쪽으로 부터 간격, 가로위치,세로위치,가로길이,세로길이
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
           * 빈아이콘
           * 아이콘을 넣어주기
           */
         icon[i] = new ImageIcon(i + ".png");
         bt[i].setIcon(icon[i]);
                  
         /**
          * 음식 수량 시작 0
          * 배경 흰색
          * 수량 수정불가
          * 음식버튼의 가로세로위치를 가져와서 세로위치,가로길이,세로길이
          */
         num[i] = new TextField("0");
         num[i].setBackground(Color.white);
         num[i].setEditable(false);
         num[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
       
         /**
         * -버튼 생성
         * 음식버튼의 가로위치와 음식수량(세로위치)를 가져와서 가로 세로길이 지정
         */
         minus[i] = new Button("-");
         minus[i].setBounds(bt[i].getX(), num[i].getY(), 20, 20);
         minus[i].setEnabled(false);
        
        /**
         * +버튼 생성
         * 음식버튼의 가로위치와 음식수량(세로위치)를 가져와서 가로 세로길이 지정
         */
         plus[i] = new Button("+");
         plus[i].setBounds(bt[i].getX() + (100 - 20), num[i].getY(), 20, 20);
         plus[i].setEnabled(false);
        
        /**
         * 가격뒤에"원"넣기 
         * 음식버튼 가로위치,음식수량(세로위치)를 가져와서 "원"의 가로세로 길이지정
         */
         l[i] = new Label(price[i] + "원");
         l[i].setBounds(bt[i].getX() + 20, num[i].getY() - 25, 100, 20);

        /**
         * 확인버튼 생성
         * 음식버튼의 가로위치와, 음식수량(세로위치)를 가져와 확인버튼의 가로세로 길이지정
         */
         ok[i] = new JButton("확인");
         ok[i].setBounds(bt[i].getX(), num[i].getY() + 30, 100, 20);
         ok[i].setEnabled(false);

         /**
          * north패널에 음식버튼
          * 음식수량
          * -버튼
          * +버튼
          * "원" text
          * 확인 버튼 추가하기
          */
         North.add(bt[i]);
         North.add(num[i]);
         North.add(minus[i]);
         North.add(plus[i]);
         North.add(l[i]);
         North.add(ok[i]); 
      }
     
      /**
       * 사이즈 가로 300인 텍스트가들어갈수있는 스크롤바를 가진 창 만들기 
       * 
       * 배경 흰색
       * 수정 불가능
       * 폰트
       */
      TextArea ta = new TextArea("    ", 300, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
   
      ta.setText("   상품주문목록\n"+"   상품명        판매금액        수량        최종금액\n\n");
     
      
      ta.setBackground(Color.white);
      ta.setEditable(false);
      ta.setFont(font1);
      /**
       * 오른쪽하단에 j패널 생성
       * 폰트설정
       */
      JPanel pEast = new JPanel();
      pEast.setFont(font);
   
      /**
       * 버튼2
       * 버튼3
       * 버튼4
       * 버튼2,3,4의 레이아웃을 2행1열로배치
       * 버튼3을 생성한 pEast에 붙여주기
       * 버튼4을 생성한 pEast에 붙여주기
       * 버튼2을 생성한 pEast에 붙여주기
       * 버튼2,3,4의 사이즈
       */
      Button bt2 = new Button("상품주문하기");
      Button bt3= new Button("선불(현금결제)");
      Button bt4= new Button("선불(카드결제)");
      pEast.setLayout(new GridLayout(2,1));
      pEast.add(bt3);
   
      pEast.add(bt4);
      pEast.add(bt2);
    
      pEast.setSize(500,0);     
      

    /**
     * 버튼3 클릭시 발생 이벤트
     * joptionpane으로 지불할금액 입력받기
     * joptionpane으로 지불할금액을 입력받았으면 나올 메세지
     */
      bt3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
           JOptionPane.showInputDialog(null, "지불할 금액을 써주세요.");
            JOptionPane.showMessageDialog(null, "선택이완료되었습니다.\n주문버튼을 눌러주세요.");
          
            
               }
      });
        
      /**
       * 버튼4 클릭시 발생 이벤트
       * joptionpane으로 메세지 출력
       */
      bt4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "종업원에게 카드를 주세요.\n주문버튼을 눌러주세요.");
            
         }
      });
     
      /**
       * 버튼2클릭시 발생 이벤트
       * 주문하기 버튼을 누르면 위에 메뉴를 입력받은 text창을 가져와서 메뉴금액 출력
       * 메뉴버튼 비활성화시키기
       * -버튼 비활성화
       * +버튼 비활성화
       * 주문버튼누르면 초기화시키기
       */
      bt2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
            for (int i = 0; i < menu.length; i++) {
               bt[i].setEnabled(true);
               minus[i].setEnabled(false);
               plus[i].setEnabled(false);
               num[i].setText("0");
               ta.setText("   상품주문목록\n"+"    상품명       판매금액        수량       최종금액\n\n");
               
            }
         }
      });

      /**
       * 메뉴패널에 새 스크롤바 생성 
       * 스크롤바 항상 보이게하기
       * 패널생성	
       * borderlayout으로 레이아웃설정
       * 메뉴버튼을 west방향에 설정
       * 스크롤바는 메뉴가 있는 중앙에 생성 
       */
      JScrollPane scrollPane = new JScrollPane(North);
      scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      JPanel northPanel = new JPanel();
      northPanel.setLayout(new BorderLayout()); 
      northPanel.add(p1, BorderLayout.WEST);
      northPanel.add(scrollPane,BorderLayout.CENTER);
      
      /**
       * 위에 만들어진 패널들을 north프레임에 넣기
       * 주문목록 text를 프레임 중앙에 넣기
       * 상품주문 결제 버튼들을 프레임 동쪽에 넣기
       * 프레임 보이게하기
       */
      frame.add(northPanel, BorderLayout.NORTH);
      frame.add(ta, BorderLayout.CENTER);
      frame.add(pEast, BorderLayout.EAST);
      frame.setVisible(true);

      
      for (int i = 0; i < menu.length; i++) {
         int j = i;
         
         
         /**
          * 음식 버튼눌렀을때 이벤트
          * -버튼 활성화
          *  +버튼 활성화
          *  음식버튼 비활성화
          *  음식수량은 0부터 시작
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
         * "-" 버튼클릭시 이벤트
         * 음식수가 0보다 크면
         * 음식수 -1
         * -버튼을 눌렀을때 나오는 숫자
         * 확인버튼 활성화
         * 위에 상황이 아닐시 -버튼 비활성화
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
         * "+" 버튼클릭 이벤트
         * 음식수량 +1
         * +버튼 눌렀을때 나오는 숫자
         * 확인버튼 활성화
         * 0보다 음식수량이 크면
         * - 버튼활성화
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
        * 확인 버튼클릭 이벤트
        * 인버튼클릭시 주문한 정보를 가져와서 text창에 출력
        * 한번 선택된 음식은 확인버튼만 비활성화
        */
         ok[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               show = bt[j].getActionCommand();
               ta.append("   " + show + "        " + price[j] + "          " + count + "         " + price[j] * count
                     +   "원" + "\n");
               ok[j].setEnabled(false);
            }
         });
         
         

      }

   }

	public static void main(String[] args) {
		new PC();
	}

}