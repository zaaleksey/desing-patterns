package Example.Proxy.Proxy;

import Example.Proxy.MediaLibrary.Video;
import Example.Proxy.MediaLibrary.YouTubeLibrary;
import Example.Proxy.MediaLibrary.YouTubeLibraryImpl;
import java.util.HashMap;

public class YouTubeCacheProxy implements YouTubeLibrary {

  private YouTubeLibrary youtubeService;
  private HashMap<String, Video> cachePopular = new HashMap<>();
  private HashMap<String, Video> cacheAll = new HashMap<>();

  public YouTubeCacheProxy() {
    this.youtubeService = new YouTubeLibraryImpl();
  }

  @Override
  public HashMap<String, Video> popularVideos() {
    if (cachePopular.isEmpty()) {
      cachePopular = youtubeService.popularVideos();
    } else {
      System.out.println("Retrieved list from cache.");
    }
    return cachePopular;
  }

  @Override
  public Video getVideo(String videoId) {
    Video video = cacheAll.get(videoId);
    if (video == null) {
      video = youtubeService.getVideo(videoId);
      cacheAll.put(videoId, video);
    } else {
      System.out.println("Retrieved video '" + videoId + "' from cache.");
    }
    return video;
  }

  public void reset() {
    cachePopular.clear();
    cacheAll.clear();
  }

}