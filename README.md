# AWS SQS

## Propósito

O propósito principal desta aplicação é consumir mensagens de uma fila SQS (Amazon Simple Queue Service) e enviar
mensagens para a mesma fila. A aplicação utiliza Spring Boot e AWS SDK para interagir com o serviço SQS.

1. Consumir Mensagens: A classe `Consumer` está configurada para ouvir mensagens de uma fila SQS chamada `minha-fila` e
   processá-las quando recebidas.

2. Enviar Mensagens: A classe `Main` envia uma mensagem para a fila SQS `minha-fila` ao iniciar a aplicação.
   A configuração do cliente SQS é feita na classe `SqsConfig`, que define o endpoint e a região do serviço SQS.

## Enviar mensagem para a fila

```
aws --endpoint="http://localhost:4566" sqs send-message --queue-url https://localhost.localstack.cloud:4566/000000000000/minha-fila --message-body "{\"content\": \"meu valor\"}"
```

## Deletar mensagens da fila

```
aws --endpoint="http://localhost:4566" sqs purge-queue --queue-url https://localhost.localstack.cloud:4566/000000000000/minha-fila
```

Tecnologias envolvidas:
-
- JDK 21
- Spring Boot
- AWS SDK
- Amazon SQS
- LocalStack
- Maven

#### Referência
BUILD & RUN. AWS SQS: Como publicar e consumir mensagens com Spring Cloud AWS. 2025. Disponível em: https://www.youtube.com/watch?v=56_F59cIT8M. Acesso em: 22 jan. 2025.