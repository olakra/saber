object Library {
    const val gradle = "com.android.tools.build:gradle:${Versions.GRADLE}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_GRADLE_PLUGIN}"

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
        const val uiTest = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"

        const val material = "androidx.compose.material:material:${Versions.COMPOSE}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.KTX}"
        const val aptCompat = "androidx.appcompat:appcompat:${Versions.APP_COMPACT}"

        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME_KTX}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"

        object Test {
            const val junitExt = "androidx.test.ext:junit:${Versions.ANDROIDX_EXT_JUNIT}"
            const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        }
    }

    const val material = "com.google.android.material:material:${Versions.MATERIAL}"

    const val junit = "junit:junit:${Versions.JUNIT}"

}