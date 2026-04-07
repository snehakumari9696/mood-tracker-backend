package com.MoodTracker.MoodTracker.controller;
import com.MoodTracker.MoodTracker.service.MoodService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.MoodTracker.MoodTracker.model.Mood;


@RestController
@RequestMapping("/api/moods")
public class MoodController {

    private final MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @PostMapping
    public Mood addMood(@RequestBody Mood mood) {
        return moodService.addMood(mood.getMood(), mood.getNote());
    }

    @GetMapping
    public List<Mood> getMoods() {
        return moodService.getAllMoods();
    }
}