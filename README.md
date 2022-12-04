# simple-kotlin

A very basic simple kotlin application with some tests and resource reading.

## building

On windows:
```shell
.\gradlew.bat clean build
```

On linux:
```shell
./gradlew clean build
```

## Running
As above, pick correct gradle wrapper script to run. Here I'll illustrate just linux

```shell
./gradlew run --args="a b c"
```

Note this is an `application` because of that being specified in the build.gradle.kts in the `plugins` section,
and the main class that is run is set in the same file with:

```gradle
application {
    mainClass.set("net.example.MainKt")
}
```
