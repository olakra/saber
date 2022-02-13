object BuildPlugins {
    val GRADLE_TOOLS by lazy { "com.android.tools.build:gradle:${Versions.GRADLE_TOOLS}" }
    val KOTLIN_PLUGINS by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}" }
}

object Dependencies {
    val androidX = AndroidX
    val kotlin = Kotlin

    val test = Test
    val androidTest = AndroidTest

    val compose = Compose

    object Compose {
        val ui by lazy { "androidx.compose.ui:ui:${Versions.COMPOSE_VERSION}" }
        val uiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_VERSION}" }
        val uiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_VERSION}" }
        val foundation by lazy { "androidx.compose.foundation:foundation:${Versions.COMPOSE_VERSION}" }
        val material by lazy { "androidx.compose.material:material:${Versions.COMPOSE_VERSION}" }
        val materialIcons by lazy { "androidx.compose.material:material-icons-core:${Versions.COMPOSE_VERSION}" }
        val materialIconsExtended by lazy { "androidx.compose.material:material-icons-extended:${Versions.COMPOSE_VERSION}" }
        val runtimeLiveData by lazy { "androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE_VERSION}" }
        val runtimeRxJava by lazy { "androidx.compose.runtime:runtime-rxjava2:${Versions.COMPOSE_VERSION}" }
        val uiTest by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_VERSION}" }

    }

    object AndroidX {
        val core by lazy { "androidx.core:core-ktx:1.6.0" }
        val appCompat by lazy { "androidx.appcompat:appcompat:1.3.1" }
    } // androidX

    object Kotlin {
        val kotlinStandardLibrary by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}" }
    }

    object Test {
        val junit by lazy { "junit:junit:${Versions.JUNIT_VERSION}" }
    }

    object AndroidTest {
        val junit by lazy { "androidx.test.ext:junit:1.1.3" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_VERSION}" }
    }
}