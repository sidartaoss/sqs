package tech.buildrun.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    public static final String SQS_QUEUE =
            "minha-fila";

    @SqsListener(SQS_QUEUE)
    public void receiveMessage(final Message aMessage) {
        System.out.println("Received message: " + aMessage.content());
    }

}
