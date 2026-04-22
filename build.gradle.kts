plugins {
    kotlin("jvm") version "1.9.24"
    application
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.example.demo.AppKt")
}

tasks.test {
    useJUnitPlatform()
}
