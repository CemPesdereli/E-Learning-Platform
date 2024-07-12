package com.cem.elearningplatform;

import com.cem.elearningplatform.models.Author;
import com.cem.elearningplatform.models.Video;
import com.cem.elearningplatform.repositories.AuthorRepository;
import com.cem.elearningplatform.repositories.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

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
            for(int i=0;i<50;i++){
                Faker faker = new Faker();


                var author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .email(faker.name().username()+"@gmail.com")
                        .age(faker.number().numberBetween(17,73))
                        .build();

                repository.save(author);
            }

            /*var author = Author.builder()
                    .id(1)
                    .firstName("Cem")
                    .lastName("Pesdereli")
                    .email("cempesdereli@gmail.com")
                    .age(25)
                    .build();


            repository.save(author);*/
           // repository.updateAuthor(22,1);
            System.out.println("updated count: "+repository.updateAllAuthors(22));
            //List<Author> authors = repository.findAll();
//            for(Author author: authors){
//                author.setAge(22);
//                repository.save(author);
//            }

           // System.out.println(repository.findAllByFirstNameContainingIgnoreCase("u"));



            /*var video = Video.builder()
                    .name("abc")
                    .length(7)
                    .build();
            videoRepository.save(video);

             */
        };
    }

}
