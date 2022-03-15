package com.github.nicholaslyang.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.nicholaslyang.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
