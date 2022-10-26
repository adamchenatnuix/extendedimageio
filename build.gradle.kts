import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

publishing {
//    publications.registering(MavenPublication::class) {
//        from(project.components["java"])
//        groupId = "com.github.adamchenatnuix"
//        artifactId = "extendedimageio"
//        version = "1.0.0"
//    }
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.adamchenatnuix"
            artifactId = "extendedimageio"
            version = "1.0.0"

            from(components["java"])
        }
    }
}

tasks.withType<JavaCompile>() {
    options.compilerArgs.addAll(
        arrayOf(
            "--add-exports", "java.desktop/com.sun.imageio.plugins.gif=ALL-UNNAMED",
            "--add-exports", "java.desktop/com.sun.imageio.plugins.common=ALL-UNNAMED"
        )
    )
}