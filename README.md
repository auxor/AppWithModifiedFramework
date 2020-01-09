## AppWithModifiedFramework

This is an demo project to use modified android framework.

1. Modify the aosp framework
2. Build and get the classes.jar in out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/
3. Put the classes.jar in libs
4. Modify the root project's build.gradle (or subproject)

```
subprojects {
    gradle.projectsEvaluated {
        tasks.withType(JavaCompile) {
            options.compilerArgs.add("-Xbootclasspath/p:${rootDir}/libs/framework.jar")
        }
    }
}
```
