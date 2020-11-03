plugins {
    id("gradlebuild.distribution.packaging")
}

dependencies {
    coreRuntimeOnly(platform(project(":core-platform")))

    pluginsRuntimeOnly(platform(project(":distributions-basics")))

    pluginsRuntimeOnly(project(":scala"))
    pluginsRuntimeOnly(project(":ear"))
    pluginsRuntimeOnly(project(":code-quality"))
    pluginsRuntimeOnly(project(":jacoco"))
    pluginsRuntimeOnly(project(":ide"))
}
