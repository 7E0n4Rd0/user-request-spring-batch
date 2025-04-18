package com.leonardo.user_request_spring_batch.processor;

import com.leonardo.user_request_spring_batch.dto.UserDTO;
import com.leonardo.user_request_spring_batch.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelectFieldsUserDataProcessorConfig {

    private static Logger logger = LoggerFactory.getLogger(SelectFieldsUserDataProcessorConfig.class);
    private int counter = 1;
    @Bean
    public ItemProcessor<UserDTO, User> selectFieldsUserDataProcessor(){
        return new ItemProcessor<UserDTO, User>() {
            @Override
            public User process(UserDTO item) throws Exception {
                User user = new User(item.getLogin(), item.getName(), item.getAvatarUrl());
                logger.info("[PROCESSOR STEP] user fields " + counter + " - " + user);
                counter++;
                return user;
            }
        };
    }
}
