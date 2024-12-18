# AVRO EXEC SAMPLE

Run `./mvnw exec:exec` to generate avsc definitions from avdl schemas.

Run `./mvnw spring-boot:run` to run the application. It should log an hello world message and exit.

## M2 repository

If your m2 repository is not in the standard location (~/.m2/repository), ad example because you are
using split repositories, override the `m2.repository` property.
