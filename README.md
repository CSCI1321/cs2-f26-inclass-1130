# CS2 Sandbox

A Gradle project for trying out Java and JavaFX code in CS2 (Fall 2026).

## Requirements

- **JDK 21.** Gradle is configured to find or download a matching JDK automatically, so you usually don't need to install one by hand.
- Nothing else. The included Gradle wrapper (`gradlew`) downloads Gradle itself, and the JavaFX libraries come in through the build.

## Running a program

Run everything from the project root (the folder containing this file).

macOS / Linux:

```
./gradlew run
```

Windows:

```
gradlew.bat run
```

With no arguments this runs `cs2.sandbox.App`. The first run takes a while because Gradle downloads its dependencies.

### Running a different class

Pass the fully qualified class name (package + class) with `-Pmain=`:

```
./gradlew run -Pmain=cs2.sandbox.AppFX
```

The class needs a `public static void main(String[] args)` method. JavaFX programs work too, and the JavaFX libraries are already on the path.

The path under `app/src/main/java/` gives you the name: `app/src/main/java/cs2/sandbox/AppFX.java` becomes `cs2.sandbox.AppFX`.

### Included examples

| Class | What it does |
| --- | --- |
| `cs2.sandbox.App` | Prints "Hello, Java!" to the console |
| `cs2.sandbox.AppFX` | Opens a JavaFX window and draws a few shapes |

## Other useful commands

| Command | What it does |
| --- | --- |
| `./gradlew build` | Compile everything and run the tests |
| `./gradlew test` | Run the tests only |
| `./gradlew clean` | Delete the `build/` folder |

## Project layout

```
app/src/main/java/   your source code (one folder per package)
app/src/test/java/   unit tests
app/build.gradle     build configuration
```

## Troubleshooting

- **`Permission denied: ./gradlew`** (macOS/Linux): run `chmod +x gradlew`.
- **Gradle can't find a JDK 21:** install one (for example [Temurin 21](https://adoptium.net/)) and make sure `java -version` reports 21.
- **JavaFX class fails with a "JavaFX runtime components are missing" error:** run it with `./gradlew run -Pmain=...` from a terminal. Launching it some other way (for example an editor's "Run" button) may not put the JavaFX libraries on the path.
