package com.leonardo.user_request_spring_batch.step;

import com.leonardo.user_request_spring_batch.dto.UserDTO;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class FetchUserDataAndStoreDBStepConfig {

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Value("${chunkSize}")
    private int chunkSize;

    @Bean
    public Step fetchUserDataAndStoreDBStep(ItemReader<UserDTO> fetchUserDataReader,
                ItemWriter<UserDTO> insertUserDataDBWriter,
                JobRepository jobRepository){
        return new StepBuilder("fetchUserDataAndStoreDBStep", jobRepository)
                .<UserDTO, UserDTO>chunk(chunkSize, transactionManager)
                .reader(fetchUserDataReader)
                .writer(insertUserDataDBWriter)
                .build();
    }

}
