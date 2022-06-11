package com.github.boommanpro.typingpractice.services

import com.intellij.openapi.project.Project
import com.github.boommanpro.typingpractice.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
