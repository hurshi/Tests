package com.example.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

public class TPlugin implements Plugin<Project> {

    void apply(Project project) {
        System.out.println(">>>>>>>>>>>>开始>>>>>>>>>>>>")
        System.out.println("这是我们的自定义插件!")
        System.out.println(">>>>>>>>>>>>结束>>>>>>>>>>>>")
    }
}