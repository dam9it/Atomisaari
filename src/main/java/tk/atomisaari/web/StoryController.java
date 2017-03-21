package tk.atomisaari.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.atomisaari.domain.Story;
import tk.atomisaari.domain.StoryRepository;




@Controller
public class StoryController {
	@Autowired
	private StoryRepository repository;
	
    @RequestMapping(value="/")
    public String studentList(Model model) {	
        model.addAttribute("stories", repository.findAll());
        model.addAttribute("story", new Story());
        return "index";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Story story, Model model){
        repository.save(story);
        model.addAttribute("stories", repository.findAll());
        return "index";
    }        
    
	
}
