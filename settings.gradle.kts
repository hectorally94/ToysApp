pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ToysApp"
include(":app")
include(":feature:feature-toys")
include(":feature:feature-payment")
include(":android-lib:logcat-logger")
include(":android-lib:navigation")
include(":android-lib:base")
include(":lib:logger")
include(":lib:console-logger")
include(":lib:crypto")
