package ru.miit.kisproject.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.SysOptions;

import java.util.List;


@RestController
@RequestMapping("/kis")
@Tag(name = "Сервис КИС", description = "Опции ..")
public class KisController {

    @Autowired
    DataStorage dataStorage;

    @Operation(
            summary = "Опции",
            description = "Сервис возвращает опции системы"
    )
    @GetMapping(value = "/sys_options", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysOptions> getSysOptions(){
        return dataStorage.getSysOptionsList();
    }
}
