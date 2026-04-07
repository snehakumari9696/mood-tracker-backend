package com.MoodTracker.MoodTracker.service;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.MoodTracker.MoodTracker.model.Mood;

@Service
public class MoodService {

    private final List<Mood> moods = new ArrayList<>();

    public Mood addMood(String mood, String note) {
        Mood newMood = new Mood();
        newMood.setId((long) (moods.size() + 1));
        newMood.setMood(mood);
        newMood.setNote(note);
        newMood.setDate(LocalDate.now());

        moods.add(newMood);
        return newMood;
    }

    public List<Mood> getAllMoods() {
        return moods;
    }
}