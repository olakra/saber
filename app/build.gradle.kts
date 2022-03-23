plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = ApplicationConfig.COMPILE_SDK_VERSION
    buildToolsVersion = ApplicationConfig.BUILD_TOOLS_VERSION

    defaultConfig {
        applicationId = "com.oscarlakra.learning.android.saber"
        minSdk = ApplicationConfig.MIN_SDK_VERSION
        targetSdk = ApplicationConfig.TARGET_SDK_VERSION
        versionCode = ApplicationConfig.VERSION_CODE
        versionName = ApplicationConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    implementation(Dependencies.kotlin.kotlinStandardLibrary)

    implementation(Dependencies.androidX.core)
    implementation(Dependencies.androidX.appCompat)

    implementation(Dependencies.compose.ui)
    implementation(Dependencies.compose.uiToolingPreview)
    implementation(Dependencies.compose.foundation)
    implementation(Dependencies.compose.material)
    implementation(Dependencies.compose.materialIcons)
    implementation(Dependencies.compose.materialIconsExtended)
    implementation(Dependencies.compose.runtimeLiveData)
    implementation(Dependencies.compose.runtimeRxJava)

    debugImplementation(Dependencies.compose.uiTooling)

    androidTestImplementation(Dependencies.compose.uiTest)

    // Testing dependencies
    implementation(Dependencies.test.junit)
    implementation(Dependencies.androidTest.junit)
    implementation(Dependencies.androidTest.espresso)
}

kapt {
    correctErrorTypes = true
    useBuildCache = true
}