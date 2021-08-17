package com.github.nicsilver.jumpertest.listeners//package com.github.nicsilver.jumpertest.listeners

import com.github.nicsilver.jumpertest.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
