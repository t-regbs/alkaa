plugins {
    id("kotlin")
}
apply {
    from("$rootDir/config/quality.gradle")
}

dependencies {
    implementation(Deps.koin.core)
    implementation(Deps.logging)
    implementation(Deps.coroutines.core)

    testImplementation(Deps.test.junit)
    testImplementation(Deps.test.mockk)
    testImplementation(Deps.coroutines.test)
}
