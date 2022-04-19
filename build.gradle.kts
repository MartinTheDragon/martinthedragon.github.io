plugins {
    kotlin("js") version "1.6.20"
}

group = "at.martinthedragon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    val kotlinReactWrappersVersion = "18.0.0-pre.330-kotlin-1.6.20"
    val kotlinReactRouterDomWrapperVersion = "6.3.0-pre.330-kotlin-1.6.20"
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:$kotlinReactWrappersVersion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:$kotlinReactWrappersVersion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-css:$kotlinReactWrappersVersion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:$kotlinReactRouterDomWrapperVersion")
    implementation(npm("bootstrap", "5.1"))
    implementation(kotlin("stdlib-js"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}
