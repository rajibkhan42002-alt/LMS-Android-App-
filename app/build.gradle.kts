plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
    alias(libs.plugins.hiltAndroid)
    alias(libs.plugins.safe.args)
}

android {
    namespace = "com.lms_application"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.lms_application"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    viewBinding {
        enable = true
    }


}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.cardview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)

    // dagger hilt
    implementation(libs.dagger.hilt.android)
    kapt(libs.dagger.hilt.compiler)


    // coroutines
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    // view model
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.livedata)

    // navigation
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    //SDP - a scalable size unit
    implementation(libs.ssp.android)
    implementation(libs.sdp.android)

    // glide
    implementation (libs.glide)

}