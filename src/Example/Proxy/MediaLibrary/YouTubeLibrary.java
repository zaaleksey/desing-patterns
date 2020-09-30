package Example.Proxy.MediaLibrary;

import java.util.HashMap;

public interface YouTubeLibrary {

  HashMap<String, Video> popularVideos();
  Video getVideo(String videoId);

}
