package topic1_ex7;

import java.util.ArrayList;
import java.util.List;
// this class add play and stop songs
public class MusicPlayer {
	States play;// new states
	States stop;
	private int count;// counter
	private List<Song> songsList;// songs list
	//constructor whit no arguments
	public MusicPlayer() {
		songsList = new ArrayList<>();
		play = States.PLAY;
		stop = States.STOP;
		count = 0;
	}
	//function add
	public void addSong(Song song){
		songsList.add(song);
	}
	//function play
	public void play(){
		if(count <= songsList.size()){
		System.out.println(play.toString()+" "+songsList.get(count));
		count++;
		}
		else System.out.println("end list");
	}
	//function stop
	public void stop(){
		int a = count;
		System.out.println(stop.toString()+" "+songsList.get(--a));
	}
}
