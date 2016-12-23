package com.hdl.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TestProjectServiceImpl implements TestProjectService {

    @Override
    public List<FieldComparisonFailure> compare(String expect, String actual) {

        List<FieldComparisonFailure> list = new ArrayList<FieldComparisonFailure>();
        Comparator comparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }

            public boolean equals(Object obj) {
                return false;
            }
        };
        Collections.sort(list,comparator);
        return list;
    }

}