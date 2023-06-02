# Task avoidance

This example project shows how tasks avoidance works. 
We are simulating slow compilation, see `buildSrc/src/main/kotlin/jcon.java-conventions.gradle.kts` where we slow down a compile task.

What to do:
1. Run `./gradlew clean`: with Gradle you normally don't run clean, but let's have a clean state here
2. Run `./gradlew compileJava`: first run of compileJava, all projects are recompiled
3. Change Desktop.java in desktop-app
4. Run `./gradlew compileJava`: this time, only desktop-app is recompiled
5. Change Mobile.java in mobile-app
6. Run `./gradlew compileJava`: this time, only mobile-app is recompiled

This is task avoidance and it saves a lot of time when working on a big projects with lots of tasks.
While this looks simple, the important bit here is, that with Gradle task avoidance is reliable and we can have incremental builds.
One side effect of that is, that there is no need to run `clean` for a compile, test or build tasks, which can speed up builds a lot.

Also when combined with [Build Cache](https://docs.gradle.org/current/userguide/build_cache.html) this can additionally improve build times.
One good example where Build Cache can improve build times significantly is, when you switch branches.
