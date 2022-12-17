package ru.miit.kisproject.services;

import ru.miit.kisproject.mapper.SysOptionsMapper;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.SysOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class RunWorkBdService {
    @Autowired
    SysOptionsMapper sysOptionsMapper;

    @Autowired
    DataStorage dataStorage;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<SysOptions> sysOptionsList = sysOptionsMapper.selectAll();
        List<SysOptions> filteredvivsdAsoupPOperList = sysOptionsList.parallelStream().filter((kodOp) -> {
            return Objects.equals(kodOp.getOptionName(), "ENABLE_CLEAR");
        }).collect(Collectors.toList());
        dataStorage.getSysOptionsList().addAll(sysOptionsList);
    }
}
