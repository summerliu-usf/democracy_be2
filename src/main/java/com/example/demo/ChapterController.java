package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("")
public class ChapterController {

    @Autowired
    private ChapterRepository chapterRepository;

    @GetMapping("/{bookId}/chapters/{chapId}")
    public Chapter getChapterById(@PathVariable int chapId) {
        return chapterRepository.findById(chapId).orElse(null);
    }
//
//    @GetMapping("/{bookId}/chapters/{chapId}/assistant")
//    public String getAssistantIdByChapId(@PathVariable int chapId) {
//        return chapterRepository.findAssistantIdByBookId(chapId);
//    }
//
//    @GetMapping("/{bookId}/chapters/{chapId}/podcast")
//    public String getPodcastUrlByChapId(@PathVariable int chapId) {
//        return chapterRepository.findPodcastUrlByChapId(chapId);
//    }

    @PostMapping
    public Chapter saveChapter(@RequestBody Chapter chapter) {
        return chapterRepository.save(chapter);
    }

}
