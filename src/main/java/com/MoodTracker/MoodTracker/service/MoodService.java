package com.MoodTracker.MoodTracker.service;



import com.MoodTracker.MoodTracker.model.Mood;
import com.MoodTracker.MoodTracker.repo.MoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MoodService {
    private final MoodRepository moodRepository;
    public Mood addMood(String mood, String note) {

        Mood m=new Mood();
        m.setMood(mood);
        m.setNote(note);
        m.setDate(LocalDate.now());

        return moodRepository.save(m);
    }
    public List<Mood> getAllMoods() {
        return moodRepository.findAll();
    }
}
