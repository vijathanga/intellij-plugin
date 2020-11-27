package com.github.vijathanga.intellijdeploy.services

import com.intellij.openapi.project.Project
import com.github.vijathanga.intellijdeploy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
