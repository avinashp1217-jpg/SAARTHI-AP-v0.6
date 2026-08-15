plugins {
    id("com.android.application") version "8.7.3"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "com.saarthi.ap"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.saarthi.ap"
        minSdk = 24
        targetSdk = 35
        versionCode = 6
        versionName = "0.6"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
}
