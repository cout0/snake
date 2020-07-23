package snake;
import java.lang.Thread;
//import java.net.MalformedURLException;
import javax.swing.JFrame;
import java.awt.Robot;

public class Snake {
    public static void main(String[] args) throws Exception{
    	JFrame frame = new JFrame(); // 创建一个游戏界面的框架
    	frame.setTitle("我的贪吃蛇");
		frame.setBounds(10, 10, 900, 720); // 设置框架的大小
		frame.setResizable(false); // 设置框架大小为不能改变
		// 点击关闭按钮 关闭游戏界面
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.print("ok");
		SnakePanel panel = new SnakePanel();  //添加画布
		frame.add(panel); // 刚添加时画布是空的看不到
		frame.setVisible(true); // 允许显示游戏界面
		
		Robot r1=new Robot();
		while(true) {
			SimpleAudioPlayer sound=new SimpleAudioPlayer(SimpleAudioPlayer.msc_Sound);//背景音乐
			sound.play();
			r1.delay(1000*60);//延迟2分钟
			r1.delay(1000*60);
			sound.stop();
		}
    }

}

class music_sound extends Thread{
	SimpleAudioPlayer sound;
	public music_sound()  throws Exception{
		sound=new SimpleAudioPlayer(SimpleAudioPlayer.msc_Die);
	}
	public void run() {
		sound.play();
	}
}