object Dependencies {
    object Versions {
        const val ktxVersion = "1.7.0"
        const val composeVersion = "1.0.5"
    }

    object Compose {
        const val composeUI = "androidx.compose.ui:ui:${Dependencies.Versions.composeVersion}"
        const val composeUITooling = "androidx.compose.ui:ui-tooling:${Dependencies.Versions.composeVersion}"
        const val composeUIToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Dependencies.Versions.composeVersion}"
        const val composeUITest = "androidx.compose.ui:ui-test-junit4:${Dependencies.Versions.composeVersion}"

        const val composeMaterial = "androidx.compose.material:material:${Dependencies.Versions.composeVersion}"
    }

//    implementation ("androidx.core:core-ktx:1.7.0")
//    implementation ("androidx.appcompat:appcompat:1.4.0")
//    implementation ("androidx.activity:activity-compose:1.4.0")
//    implementation ("com.google.android.material:material:1.4.0")
//
//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
//
//    testImplementation ("junit:junit:4.13.2")
//    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
}