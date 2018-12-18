package com.nf147.ssms.controller;


import com.nf147.ssms.demo_formatter.Person;
import com.nf147.ssms.demo_formatter.PersonFromId;
import com.nf147.ssms.service.DemoService;
import mass.resultDemo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ddd")
@RestController
@CrossOrigin
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.GET)
    public Person home(@RequestParam(value = "id", required = false)
                       @PersonFromId("en") Person person) {
        return person;
    }

    /* @GetMapping("/code")
     public Result<Student> code() {
         Result<Student> result = new Result<>();
         try {
             Student student = demoService.getStudent();
             Page<Student> pager = PageHelper.startPage(3, 10);
             return result.setCode(200).setData(student).setPager(pager);
         } catch (ConnException e) {
             return result.setCode(402).setErrMsg(e.getMessage() + " 其他的东西");
         } catch (Exception e) {
             return result.setCode(407).setError(e);
         }
     }
     @GetMapping("/code2")
     public Result<Student> code2() {
         try {
             Student student = demoService.getStudent();
             Page<Student> pager = PageHelper.startPage(3, 10);
             return new Result<>(200, student, pager);
         } catch (ConnException e) {
             return new Result<>(402, e.getMessage());
         } catch (Exception e) {
             return new Result<>(407, e);
         }
     }*/
    @GetMapping("/code")
    public ResultVo code() {
        ResultVo<Object> vo = new ResultVo<>();
       /*try {
           Student student = demoService.getStudent();
           Page<Student> pager = PageHelper.startPage(3, 10);
          return vo.status(202).body(student);
       } catch (ConnException e) {
           return vo.status(300);
       } catch (Exception e) {
           return vo.status(400);
       }*/
        ResponseEntity.status(303).body("ksddjfksd");
        return null;
    }
}
