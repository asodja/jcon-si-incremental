plugins {
    id("jcon.java-conventions")
}

// library -> web-app
dependencies {
    implementation(project(":library"))
}
