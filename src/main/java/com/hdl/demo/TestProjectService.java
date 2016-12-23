package com.hdl.demo;

import java.util.List;

public interface TestProjectService {
    List<FieldComparisonFailure> compare(String expect, String actual);

}