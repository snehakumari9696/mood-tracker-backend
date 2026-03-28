package com.MoodTracker.MoodTracker.controller;

import com.MoodTracker.MoodTracker.model.Mood;
import com.MoodTracker.MoodTracker.service.MoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/moods")
@RequiredArgsConstructor
public class MoodController {
    private final MoodService moodService;

    @PostMapping
    public Mood addMood(@RequestBody Map<String, String> payload) {
        return moodService.addMood(payload.get("mood"), payload.get("note"));
    }

    @GetMapping
    public List<Mood> getMoods() {
        return moodService.getAllMoods();
    }
}
