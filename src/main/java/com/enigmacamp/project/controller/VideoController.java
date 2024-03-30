package com.enigmacamp.project.controller;

import com.enigmacamp.project.entity.Video;
import com.enigmacamp.project.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/video")
public class VideoController {
    private final VideoService videoService;

    @PostMapping("/save")
    public Video saveVideo(@RequestBody Video video) {
        return videoService.saveVideo(video);
    }

    @PostMapping("/delete/{id}")
    public void deleteVideoById(@PathVariable String id) {
        videoService.deleteVideoById(id);
    }

    @GetMapping("/getvideos")
    public List<Video> getAllVideo() {
        return videoService.getAllVideo();
    }
}
