object BuildPlugins {
    val GRADLE_TOOLS by lazy { "com.android.tools.build:gradle:${Versions.GRADLE_TOOLS}" }
    val KOTLIN_PLUGINS by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}" }
}

object Dependencies {
    val androidX = AndroidX
    val kotlin = Kotlin

    val test = Test
    val androidTest = AndroidTest

    val material by lazy { "com.google.android.material:material:${Versions.MATERIAL_VERSION}" }

    object AndroidX {
        val core by lazy { "androidx.core:core-ktx:1.6.0" }
        val appCompat by lazy { "androidx.appcompat:appcompat:1.3.1" }
    } // androidX

    object Kotlin {
        val kotlinStandardlibrary by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}" }
    }

    object Test {
        val junit by lazy { "junit:junit:${Versions.JUNIT_VERSION}" }
    }

    object AndroidTest {
        val junit by lazy { "androidx.test.ext:junit:1.1.3" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_VERSION}" }
    }
}