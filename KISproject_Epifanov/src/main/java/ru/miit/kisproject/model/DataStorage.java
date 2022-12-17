package ru.miit.kisproject.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataStorage {
    private final List<SysOptions> sysOptionsList = new ArrayList<>();

    public List<SysOptions> getSysOptionsList() {
        return sysOptionsList;
    }

}
