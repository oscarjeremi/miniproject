package com.enigmacamp.project.service.impl;

import com.enigmacamp.project.entity.Video;
import com.enigmacamp.project.repository.VideoRepository;
import com.enigmacamp.project.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    VideoRepository videoRepository;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }
    @Override
    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public Video getVideoById(String id) {
        return videoRepository.findById(id).get();
    }

    @Override
    public void deleteVideoById(String id) {
        videoRepository.deleteById(id);
    }

    @Override
    public List<Video> getAllVideo() {
        return videoRepository.findAll();
    }
}
