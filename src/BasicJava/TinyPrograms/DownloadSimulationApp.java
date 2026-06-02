package BasicJava.TinyPrograms;

 class DownloadTaskThread extends Thread {
    String fileName;

    public DownloadTaskThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(fileName + "download started...");
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000); //pauses Thread for one second
                System.out.println(fileName + " downlading..." + (i * 20) + "%");

            }

            System.out.println(fileName + " download completed");
        } catch (InterruptedException e) {
            System.out.println(fileName + " download interrupted!");
        }
    }
}

    public class DownloadSimulationApp {
        public static void main(String[] args) {
          DownloadTaskThread file1  = new DownloadTaskThread("Movie.mp4");
            DownloadTaskThread file2  = new DownloadTaskThread("Music.mp3");
            DownloadTaskThread file3  = new DownloadTaskThread("Game.zip");

            file1.start();
            file2.start();
            file3.start();

            System.out.println("All Downloads are running in the background");


        }
    }






