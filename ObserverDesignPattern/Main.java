public class Main {

    public static void main(String args[]){

        YoutubeChannel channel = new YoutubeChannel();
        Subscriber sub1 = new Subscriber("Harsh");
        Subscriber sub2 = new Subscriber("Sharma");

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.newVideUploaded();
    }

}
