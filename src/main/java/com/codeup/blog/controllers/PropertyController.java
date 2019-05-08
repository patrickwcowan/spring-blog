//package com.codeup.blog;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//class PropertyController {
//
//    private final PropertyRepository propertyDao;
//
//    public PropertyController(PropertyRepository propertyDao) {
//        this.propertyDao = propertyDao;
//    }
//
//    @GetMapping("/properties")
//    public String index(Model model){
//        Property p1 = new Property("1130 Rattler gap",4,2.5,3.8,200000);
//        Property p2 = new Property("9819 Gazelle Ford", 3,2,1.8,150000);
//        propertyDao.save(p1);
//        propertyDao.save(p2);
//
//        model.addAttribute("properties", propertyDao.findAll());
//        return "properties/index";
//    }
//}
