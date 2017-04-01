package com.sergeikostin.controller;


import com.sergeikostin.model.User;
import com.sergeikostin.model.UserRepository;
import com.sergeikostin.model.Video;
import com.sergeikostin.model.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/videos")
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewVideo (@RequestParam String artistName, @RequestParam String videoName,
                                             @RequestParam String imageUrl, @RequestParam long numOfViews) {

        Video video = new Video();
        video.setArtistName(artistName);
        video.setVideoName(videoName);
        video.setNumOfViews(numOfViews);
        video.setImageUrl(imageUrl);
        videoRepository.save(video);
        return "Video Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Video> getAllVideos() {
        return videoRepository.findAll();
    }
}
