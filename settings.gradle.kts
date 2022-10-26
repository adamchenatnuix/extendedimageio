buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        classpath("org.gradle.kotlin:gradle-kotlin-dsl-plugins:3.1.0")
    }
}

rootProject.name = "extendedimageio"
