# AVRO EXEC SAMPLE

Run `./mvnw exec:exec` to generate avsc definitions from avdl schemas.

It will fail with:

```shell
[ERROR] Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.5.0:exec (default-cli) on project avro-exec: Execution default-cli of goal org.codehaus.mojo:exec-maven-plugin:3.5.0:exec failed: Plugin org.codehaus.mojo:exec-maven-plugin:3.5.0 or one of its dependencies could not be resolved:
[ERROR] 	Could not find artifact org.apache.avro:trevni-core:jar:tests:1.11.4 in central (https://repo.maven.apache.org/maven2)
[ERROR] 	Could not find artifact org.apache.avro:trevni-avro:jar:tests:1.11.4 in central (https://repo.maven.apache.org/maven2)
```

## M2 repository

If your m2 repository is not in the standard location (~/.m2/repository), ad example because you are
using split repositories, override the `m2.repository` property.
