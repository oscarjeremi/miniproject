package com.enigmacamp.project.service;

import com.enigmacamp.project.entity.Video;

import java.util.List;

public interface VideoService {
    Video saveVideo(Video video);

    Video getVideoById(String id);

    void deleteVideoById(String id);
    List<Video> getAllVideo();

}