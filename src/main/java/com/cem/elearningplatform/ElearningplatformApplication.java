package com.cem.elearningplatform;

import com.cem.elearningplatform.models.Author;
import com.cem.elearningplatform.models.Video;
import com.cem.elearningplatform.repositories.AuthorRepository;
import com.cem.elearningplatform.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ElearningplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElearningplatformApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository, VideoRepository videoRepository
            ) {

        return args -> {
            /*var author = Author.builder()
                    .firstName("Cem")
                    .lastName("Pes")
                    .email("cempes@gmail")
                    .age(25)
                    .build();
            repository.save(author);

             */
            var video = Video.builder()
                    .name("abc")
                    .length(7)
                    .build();
            videoRepository.save(video);
        };
    }

}
