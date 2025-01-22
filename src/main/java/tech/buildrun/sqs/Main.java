package tech.buildrun.sqs;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.buildrun.sqs.consumer.Message;

import java.util.Objects;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static final String QUEUE_URL =
            "https://localhost.localstack.cloud:4566/000000000000/minha-fila";

    private final SqsTemplate sqsTemplate;

    public Main(final SqsTemplate sqsTemplate) {
        this.sqsTemplate = Objects.requireNonNull(sqsTemplate);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        sqsTemplate.send(QUEUE_URL, new Message("meu valor de start"));
    }
}
