package com.MoodTracker.MoodTracker.repo;

import com.MoodTracker.MoodTracker.model.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MoodRepository extends JpaRepository<Mood, Long> {

    List<Mood> findByDate(LocalDate date);
}
