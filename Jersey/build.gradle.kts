plugins {
    kotlin("jvm")
}

group = "me.kz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.glassfish.jersey.containers:jersey-container-grizzly2-http:2.43")
    implementation("org.glassfish.jersey.inject:jersey-hk2:2.28")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}