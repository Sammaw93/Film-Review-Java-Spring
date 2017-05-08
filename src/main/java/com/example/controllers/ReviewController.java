
        package com.example.controllers;

        import com.example.domain.Review;
        import com.example.domain.ReviewRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/reviews")
 /* Controller class that handles the CRUD operations
-------------------------------------------------- */
public class ReviewController {

    @Autowired
    private ReviewRepository repository;


    /* Shows the list of reviews on the site from the repository
-------------------------------------------------- */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listReviews(Model model) {
        model.addAttribute("reviews", repository.findAll());
        return "reviews/list";
    }

}