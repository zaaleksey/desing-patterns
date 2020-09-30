package Example.Proxy;

import Example.Proxy.Downloader.YouTubeDownloader;
import Example.Proxy.MediaLibrary.YouTubeLibraryImpl;
import Example.Proxy.Proxy.YouTubeCacheProxy;

public class Main {

  public static void main(String[] args) {
    YouTubeDownloader naiveDownloader = new YouTubeDownloader(new YouTubeLibraryImpl());
    YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);

    System.out.println("YouTubeLibraryImpl: " + naive);
    System.out.println("YouTubeCacheProxy: " + smart);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
  }

  private static long test(YouTubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }

}
