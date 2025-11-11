plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
    // FlutterFire plugin
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.ecommerce_app"
    compileSdk = 35 // Updated to highest SDK used by plugins

    ndkVersion = "27.0.12077973"

    defaultConfig {
        applicationId = "com.example.ecommerce_app"
        minSdk = flutter.minSdkVersion // Required for firebase_auth
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildTypes {
        release {
            // Replace with your release signing config
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    // Suppress obsolete Java 8 warnings
    tasks.withType<JavaCompile> {
        options.compilerArgs.add("-Xlint:-options")
    }
}

flutter {
    source = "../.."
}
