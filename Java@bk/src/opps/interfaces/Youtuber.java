package opps.interfaces;

public abstract interface Youtuber extends VideoEditer {
	abstract void makeVideo();  //we can't impliment method of interface its just like abstract class.
								//by default it has public ,static and final in it.
	default void uploadVideo() {
		System.out.println("youtuber can upload video");
	} //ths is a special case in which you can impliment your method by giving it a default keyword.
}
