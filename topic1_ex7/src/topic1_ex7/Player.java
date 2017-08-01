package topic1_ex7;

public class Player {
	//test audio player
	public static void main(String[] args) {
		Song pr = new Song("pr", "ji ji ji");//new song
		Song despacito = new Song("despacito", "despacito");//new song
		Song pinkFloyd = new Song("pink floyd", "the wall");
		Song acdc = new Song("acdc", "hells bells");
		MusicPlayer player = new MusicPlayer();//new player list
		
		player.addSong(pr);//add songs to list
		player.addSong(despacito);
		player.addSong(pinkFloyd);
		player.addSong(acdc);
		
		player.play();//test play
		player.stop();//test stop
		player.play();
		player.play();
		player.stop();
		player.play();
		
	}

}
