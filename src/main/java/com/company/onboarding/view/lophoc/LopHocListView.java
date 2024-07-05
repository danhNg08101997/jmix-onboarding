package com.company.onboarding.view.lophoc;

import com.company.onboarding.entity.LopHoc;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "lopHocs", layout = MainView.class)
@ViewController("LopHoc.list")
@ViewDescriptor("lop-hoc-list-view.xml")
@LookupComponent("lopHocsDataGrid")
@DialogMode(width = "64em")
public class LopHocListView extends StandardListView<LopHoc> {
}