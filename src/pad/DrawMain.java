package pad;

import javax.swing.UIManager;
//主函数类


public class DrawMain {
	public static void main(String[] args) {
		// TODO 主函数
		try {//将界面设置为当前windows界面风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {}
		DrawPad drawpad = new DrawPad("java绘图板");
      
	}
}
