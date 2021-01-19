package com.github.rfazli.sampleintellijplugin.services

import com.github.rfazli.sampleintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
