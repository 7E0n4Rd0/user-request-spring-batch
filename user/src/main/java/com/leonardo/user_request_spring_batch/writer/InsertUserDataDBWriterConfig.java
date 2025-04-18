package com.leonardo.user_request_spring_batch.writer;

import com.leonardo.user_request_spring_batch.entity.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertUserDataDBWriterConfig{


    @Bean
    public ItemWriter<User> insertUserDataDBWriter(){
        return users -> users.forEach(System.out::println);
    }

}
