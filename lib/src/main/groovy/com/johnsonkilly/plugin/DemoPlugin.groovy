package com.johnsonkilly.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println 'hello, world!'
        project.task("aa").doFirst {
            println 'hello, world!'
        }
    }
}