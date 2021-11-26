plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdk = Versions.SDK.COMPILE

    defaultConfig {
        minSdk = Versions.SDK.MINIMUM
        targetSdk = Versions.SDK.TARGET

        applicationId = "com.oscarlakra.learning.android.saber"

        versionCode = Versions.App.versionCode
        versionName = Versions.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.5"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation (Library.Compose.ui)
    implementation (Library.Compose.uiToolingPreview)
    implementation (Library.Compose.material)
    debugImplementation (Library.Compose.uiTooling)

    implementation (Library.AndroidX.coreKtx)
    implementation (Library.AndroidX.aptCompat)
    implementation (Library.material)

    implementation (Library.AndroidX.lifecycleRuntimeKtx)
    implementation (Library.AndroidX.activityCompose)

    testImplementation (Library.junit)

    androidTestImplementation (Library.AndroidX.Test.junitExt)
    androidTestImplementation (Library.AndroidX.Test.espressoCore)
    androidTestImplementation (Library.Compose.uiTest)
}