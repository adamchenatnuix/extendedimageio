import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

version = "1.0.0"

tasks.withType<JavaCompile>() {
    options.compilerArgs.addAll(
        arrayOf(
            "--add-exports", "java.desktop/com.sun.imageio.plugins.gif=ALL-UNNAMED",
            "--add-exports", "java.desktop/com.sun.imageio.plugins.common=ALL-UNNAMED"
        )
    )
}