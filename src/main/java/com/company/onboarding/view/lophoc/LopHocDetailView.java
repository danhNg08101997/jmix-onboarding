package com.company.onboarding.view.lophoc;

import com.company.onboarding.entity.LopHoc;
import com.company.onboarding.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "lopHocs/:id", layout = MainView.class)
@ViewController("LopHoc.detail")
@ViewDescriptor("lop-hoc-detail-view.xml")
@EditedEntityContainer("lopHocDc")
public class LopHocDetailView extends StandardDetailView<LopHoc> {
}