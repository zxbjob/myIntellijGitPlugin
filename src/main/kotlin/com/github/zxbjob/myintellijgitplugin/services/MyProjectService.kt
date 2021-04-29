package com.github.zxbjob.myintellijgitplugin.services

import com.github.zxbjob.myintellijgitplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
