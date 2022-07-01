apply(plugin = "kotlin")
apply(plugin = "org.springframework.boot")

dependencies {
    implementation(project(":line-bot-spring-boot"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
