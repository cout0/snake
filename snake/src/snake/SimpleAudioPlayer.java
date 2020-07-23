package snake;
import java.io.File;
//import java.lang.invoke.ConstantCallSite;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.Manager;
import javax.media.Player;
 
//@SuppressWarnings("restriction")
public class SimpleAudioPlayer {
	static String msc_Die="msc/die.wav";//��������
	static String msc_Eat="msc/eat.wav";//��ʳ������
	static String msc_Sound="msc/sound.wav";//��������
	private Player audioPlayer = null;//����һ�����Žӿ�
	public SimpleAudioPlayer() {
		return;
	}
	public SimpleAudioPlayer(URL url) throws Exception{//����һ��׼��Player,׼���ò���
		audioPlayer = Manager.createRealizedPlayer(url);
	}
	@SuppressWarnings("deprecation")
	public SimpleAudioPlayer(File file) throws MalformedURLException, Exception{//�������ļ���ΪURL
		this(file.toURL());
	}
	@SuppressWarnings("deprecation")
	public SimpleAudioPlayer(String str) throws MalformedURLException, Exception {//�ַ���·����URL
		File file = new File(str);
		URL url=file.toURL();
		audioPlayer = Manager.createRealizedPlayer(url);
	}
	public void play(){//ֱ�ӵ��ò��ŷ����Ϳ���
		audioPlayer.start();
	}
	
	public void stop(){//ֹͣ��ʱ��һ��Ҫ�ͷ���Դ
		audioPlayer.stop();
		audioPlayer.close();
	}
	
	public static void main(String [] args) throws MalformedURLException, Exception{
		/*File file = new File("msc/die.wav");
		System.out.println(file.toURL());*/
		String string="msc/die.wav";
		SimpleAudioPlayer Player = new SimpleAudioPlayer(string);
		Player.play();
	}
}