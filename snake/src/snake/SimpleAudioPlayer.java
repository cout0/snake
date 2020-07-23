package snake;
import java.io.File;
//import java.lang.invoke.ConstantCallSite;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.Manager;
import javax.media.Player;
 
//@SuppressWarnings("restriction")
public class SimpleAudioPlayer {
	static String msc_Die="msc/die.wav";//死亡音乐
	static String msc_Eat="msc/eat.wav";//吃食物音乐
	static String msc_Sound="msc/sound.wav";//背景音乐
	private Player audioPlayer = null;//建立一个播放接口
	public SimpleAudioPlayer() {
		return;
	}
	public SimpleAudioPlayer(URL url) throws Exception{//创建一个准备Player,准备好播放
		audioPlayer = Manager.createRealizedPlayer(url);
	}
	@SuppressWarnings("deprecation")
	public SimpleAudioPlayer(File file) throws MalformedURLException, Exception{//将本地文件改为URL
		this(file.toURL());
	}
	@SuppressWarnings("deprecation")
	public SimpleAudioPlayer(String str) throws MalformedURLException, Exception {//字符串路径到URL
		File file = new File(str);
		URL url=file.toURL();
		audioPlayer = Manager.createRealizedPlayer(url);
	}
	public void play(){//直接调用播放方法就可以
		audioPlayer.start();
	}
	
	public void stop(){//停止的时候一定要释放资源
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