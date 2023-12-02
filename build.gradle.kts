plugins {
    id("java")
    id("application")
}

group = "dev.thezexquex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass = "dev.thezexquex.aoc23.Main"
}

tasks.test {
    useJUnitPlatform()
}