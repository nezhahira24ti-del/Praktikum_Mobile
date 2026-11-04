plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.nezhahira_3tic"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.nezhahira_3tic"
        minSdk = 29
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

buildFeatures{
    viewBinding = true
}
}

dependencies {
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation("androidx.gridlayout:gridlayout:1.0.0") // Tahap 4: GridLayout
    implementation("androidx.viewpager2:viewpager2:1.1.0") // Tahap 5: ViewPager2
    implementation("com.tbuonomo:dotsindicator:5.1.0") // Tahap 6: DotsIndicator
}