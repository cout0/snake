package snake;
import java.lang.Thread;
//import java.net.MalformedURLException;
import javax.swing.JFrame;
import java.awt.Robot;

public class Snake {
    public static void main(String[] args) throws Exception{
    	JFrame frame = new JFrame(); // ����һ����Ϸ����Ŀ��
    	frame.setTitle("�ҵ�̰����");
		frame.setBounds(10, 10, 900, 720); // ���ÿ�ܵĴ�С
		frame.setResizable(false); // ���ÿ�ܴ�СΪ���ܸı�
		// ����رհ�ť �ر���Ϸ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.print("ok");
		SnakePanel panel = new SnakePanel();  //��ӻ���
		frame.add(panel); // �����ʱ�����ǿյĿ�����
		frame.setVisible(true); // ������ʾ��Ϸ����
		
		Robot r1=new Robot();
		while(true) {
			SimpleAudioPlayer sound=new SimpleAudioPlayer(SimpleAudioPlayer.msc_Sound);//��������
			sound.play();
			r1.delay(1000*60);//�ӳ�2����
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