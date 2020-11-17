package Facade;

import Facade.MediaFramework.AudioMixer;
import Facade.MediaFramework.BitrateReader;
import Facade.MediaFramework.Codec;
import Facade.MediaFramework.CodecFactory;
import Facade.MediaFramework.MPEG4CompressionCodec;
import Facade.MediaFramework.OggCompressionCodec;
import Facade.MediaFramework.VideoFile;
import java.io.File;

public class VideoConversionFacade {

  public File convertVideo(String fileName, String format) {
    System.out.println("VideoConversionFacade: conversion started.");
    VideoFile file = new VideoFile(fileName);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;
    if (format.equals("mp4")) {
      destinationCodec = new OggCompressionCodec();
    } else {
      destinationCodec = new MPEG4CompressionCodec();
    }
    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    File result = (new AudioMixer()).fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed.");
    return result;
  }

}
