# Troubleshooting

> Easy mistakes and how to fix them

## Maven Dependency Resolution

**Symptom**: On Maven dependency resolve (command: `mvn dependency:resolve`), the dependency cannot be resolved (here 1.71 does not exist):

```shell
[ERROR] Failed to execute goal on project JavaWork: Could not resolve dependencies for project com.bogdan:JavaWork:jar:1.`0-SNAPSHOT: Could not find artifact com.beust:jcommander:jar:1.71 in central (https://repo.maven.apache.org/maven2) -> [Help 1]
```

Or alternatively:

```shell
[ERROR] Failed to execute goal on project JavaWork: Could not resolve dependencies for project com.bogdan:JavaWork:jar:1.0-SNAPSHOT: Failure to find com.beust:jcommander:jar:1.71 in https://repo.maven.apache.org/maven2 was cached in the local repository, resolution will not be reattempted until the update interval of central has elapsed or updates are forced
```

**Solution**: Ensure the version exists by [checking versions online](https://search.maven.org/artifact). The documentation is out of date (as of 2022-10-09).
