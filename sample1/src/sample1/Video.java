package sample1;

public class Video {
	public String name;
	public int playCount;
	public void play() {
		System.out.println("再生");
		this.playCount++;
	}
	public int getPlayCount() {
		return this.playCount;
	}
}
