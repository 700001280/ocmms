package com.ocmms.cmms.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ocmms.cmms.model.TaskStatus;
import com.ocmms.cmms.model.TaskType;
import com.ocmms.cmms.model.Tasks;
import com.ocmms.cmms.model.Users;
import com.ocmms.cmms.repository.TaskRepository;
import com.ocmms.cmms.repository.UsersRepository;

@Controller
public class TaskController {
	@Autowired
	private TaskRepository taskService;
	@Autowired
	private UsersRepository accountService;	

	@ModelAttribute("taskTypes")
	public List<TaskType> populateTaskTypes() {
		return Arrays.asList(TaskType.ALL);
	}

	@ModelAttribute("taskStatus")
	public List<TaskStatus> populateTaskStatus() {
		return Arrays.asList(TaskStatus.ALL);
	}

	@ModelAttribute("owners")
	public Iterable<Users> populateOwners() {
		return accountService.findAll();
	}

	@ModelAttribute("allTasks")
	public Iterable<Tasks> populateVarieties() {
		return this.taskService.findAll();
	}

	/*@RequestMapping({ "task/tasks" })
	public String list(ModelMap model, @SortDefault("owner") Pageable pageable) {
		model.addAttribute("allTasks1", taskService.findAll(pageable));
		Tasks t = new Tasks();
		t.setDescription("description");
		t.setAssignDate(new Date());
		t.setMemo("memo");
		t.setStatus(TaskStatus.PENGDING);
		t.setTaskType(TaskType.MOC);
		taskService.save(t);
		model.addAttribute("task", t);
		return "task/tasks";
	}*/
	
	@RequestMapping(value =  "task/list", method = RequestMethod.GET)
	public String list(ModelMap model) {	
		return "task/list";
	}
	
	@RequestMapping(value =  "task/show/{id}", method = RequestMethod.GET)
	public String showTask(@PathVariable("id") Long id,final Tasks task,ModelMap model) {
		model.addAttribute("task", this.taskService.findOne(id));		
		return "task/show";
	}
	
	@RequestMapping(value =  "task/update", method = RequestMethod.POST)
	public String updateTask(@Valid  @ModelAttribute Tasks task, final BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {				
			return "task/list";
		}
		//task.setId(Long.MAX_VALUE);		
		this.taskService.save(task);		
		return "redirect:/task/list";
	}

	@RequestMapping(value ="task/update/{id}", method = RequestMethod.GET)
	public String updateTask(@PathVariable("id") Long id,ModelMap model) {		
		model.addAttribute("task",this.taskService.findOne(id));		
		return "task/update";
	}
	
	@RequestMapping(value ="task/delete/{id}", method = RequestMethod.GET)
	public String deleteTask(@PathVariable("id") Long id) {		
		this.taskService.delete(id);		
		return "redirect:/task/list";
	}
	
	@RequestMapping(value =  "task/create", method = RequestMethod.GET)
	public String create(ModelMap model) {			
		model.addAttribute("task", new Tasks());		
		return "task/create";
	}


	@RequestMapping(value =  "task/create", method = RequestMethod.POST)
	public String saveTask(@Valid  @ModelAttribute Tasks task, final BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {				
			return "task/list";
		}
		task.setId(Long.MAX_VALUE);		
		this.taskService.save(task);		
		return "redirect:/task/list";
	}

}
