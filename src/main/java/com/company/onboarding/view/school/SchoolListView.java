package com.company.onboarding.view.school;

import com.company.onboarding.entity.School;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "schools", layout = MainView.class)
@ViewController("School.list")
@ViewDescriptor("school-list-view.xml")
@LookupComponent("schoolsDataGrid")
@DialogMode(width = "64em")
public class SchoolListView extends StandardListView<School> {
}