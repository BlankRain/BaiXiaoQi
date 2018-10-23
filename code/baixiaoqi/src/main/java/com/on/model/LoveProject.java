package com.on.model;

import java.util.List;

/**
 * 爱心项目
 */
public interface LoveProject {

    String id();

    String name();

    List<ProjectStandard> referedStandards();
}
