package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ExResult;
import com.company.project.model.ExTask;
import com.company.project.model.TTest;
import com.company.project.service.ExResultService;
import com.company.project.service.ExTaskService;
import com.company.project.service.TTestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

/**
* Created by CodeGenerator on 2020/07/19.
*/
@RestController
@RequestMapping("/ex/result")
public class ExResultController {
    @Resource
    ExResultService exResultService;

    @Resource
    ExTaskService exTaskService;

    @Resource
    TTestService tTestService;

    // @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    // public Result add(@RequestBody ExResult exResult) {
    //     exResultService.save(exResult);
    //     return ResultGenerator.genSuccessResult();
    // }

    // @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/add/result", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Result addResult(@RequestBody final ExResult exResult) {
        exResultService.save(exResult);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value = "/add/task", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Result addTask(@RequestBody final ExTask exTask) {
        exTaskService.save(exTask);
        exTask.getExResults().stream().forEach(result -> {
            exResultService.save(result);
        });
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value = "/add/test", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Result addTest(@RequestBody final TTest tTest) {
        tTest.setCrateTime(new Date());
        tTestService.save(tTest);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam final Integer id) {
        exResultService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(final ExResult exResult) {
        exResultService.update(exResult);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam final Integer id) {
        final ExResult exResult = exResultService.findById(id);
        return ResultGenerator.genSuccessResult(exResult);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") final Integer page,
            @RequestParam(defaultValue = "0") final Integer size) {
        // PageHelper.startPage(page, size);
        final List<ExResult> list = exResultService.findAll();
        final PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
