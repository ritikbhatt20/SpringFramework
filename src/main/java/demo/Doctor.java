package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
//means whatever the class we have created is the component that you can use to create the beans out of it
public class Doctor implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    //    properties
    private String qualification;
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }
//    adding the object itself

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called");
    }

//    once the object is created, at that time if you want to call anything
//    Custom method implementation for bean lifecycle
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }
}
