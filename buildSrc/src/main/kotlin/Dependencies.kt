object Dependencies {

    // Kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"

    // Androidx
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxRecyclerview = "androidx.recyclerview:recyclerview:${Versions.androidxRecyclerView}"
    const val androidxConstraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintLayout}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidxCoreKtx}"
    const val androidxLifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidxLifecycle}"
    const val androidxLifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.androidxLifecycle}"
    const val androidxRoomRuntime = "androidx.room:room-runtime:${Versions.androidxRoom}"
    const val androidxRoomCompiler = "androidx.room:room-compiler:${Versions.androidxRoom}"
    const val androidxPaging = "androidx.paging:paging-runtime:${Versions.androidxPaging}"
    const val androidxWorkRuntime = "androidx.work:work-runtime:${Versions.androidxWorkRuntime}"
    const val materialComponents = "com.google.android.material:material:${Versions.materialComponents}"

    // Non-Google
    const val dagger = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"

    // Unit Test
    const val junit = "junit:junit:${Versions.junit}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val okhttpMockServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    // Android Test
    const val androidxTestCore = "androidx.test:core:${Versions.androidxTestCore}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTestRunner}"
    const val androidxTestRules = "androidx.test:rules:${Versions.androidxTestRules}"
    const val androidxEspresso = "androidx.test.espresso:espresso-core:${Versions.androidxEspresso}"
    const val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockito}"
}

object Versions {

    // Kotlin
    const val kotlin = "1.3.41"
    const val kotlinCoroutines = "1.2.2"

    // Androidx
    const val androidxAppCompat = "1.0.2"
    const val androidxRecyclerView = "1.0.0"
    const val androidxConstraintLayout = "1.1.3"
    const val androidxCoreKtx = "1.0.2"
    const val androidxLifecycle = "2.0.0"
    const val androidxRoom = "2.1.0"
    const val androidxPaging = "2.1.0"
    const val androidxWorkRuntime = "2.0.1"
    const val materialComponents = "1.0.0"

    // Non-Google
    const val dagger = "2.23.2"
    const val okhttp = "4.0.0"
    const val retrofit = "2.6.0"
    const val picasso = "2.71828"

    // Unit Test
    const val junit = "4.12"
    const val mockito = "2.28.2"
    const val mockitoKotlin = "2.1.0"

    // Android Test
    const val androidxTestCore = "1.2.0"
    const val androidxTestRunner = "1.2.0"
    const val androidxTestRules = "1.2.0"
    const val androidxEspresso = "3.2.0"
}