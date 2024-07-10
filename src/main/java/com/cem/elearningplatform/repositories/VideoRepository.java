package com.cem.elearningplatform.repositories;

import com.cem.elearningplatform.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
