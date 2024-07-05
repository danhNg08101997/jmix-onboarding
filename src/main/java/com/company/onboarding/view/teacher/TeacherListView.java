package com.company.onboarding.view.teacher;

import com.company.onboarding.entity.Teacher;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "teachers", layout = MainView.class)
@ViewController("Teacher.list")
@ViewDescriptor("teacher-list-view.xml")
@LookupComponent("teachersDataGrid")
@DialogMode(width = "64em")
public class TeacherListView extends StandardListView<Teacher> {
}