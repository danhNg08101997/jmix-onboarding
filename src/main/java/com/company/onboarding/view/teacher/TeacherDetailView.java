package com.company.onboarding.view.teacher;

import com.company.onboarding.entity.Teacher;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "teachers/:id", layout = MainView.class)
@ViewController("Teacher.detail")
@ViewDescriptor("teacher-detail-view.xml")
@EditedEntityContainer("teacherDc")
public class TeacherDetailView extends StandardDetailView<Teacher> {
}