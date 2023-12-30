package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
        System.out.println("User landed on netbanking page");
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on practice page");

    }
    @When("User Sign up into application")
    public void user_sign_up_into_application(List<String> data) {
        //driver.findElements(sendkeys(data.get(0))
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

    }
//    @When("^User login into application with (.+) and password (.+)$")
//    public void user_login_into_application_with_and_password(String Username, String Password) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println(Username + " and password is " + Password);

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String Username, String Password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(Username + " and password is " + Password);
    }
    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        //home page validation
        System.out.println("Validated home page");
    }
    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //validating the cards
        System.out.println("validated cards");
    }
    //
    @Given("setup the entries in database")
    public void setupEntries(){
        System.out.println("*****************");
    }

    @When("launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("launch browser");
    }
    @And("hit the home page url of banking site")
    public void hit_the_home_page_url_of_banking_site() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hitting url");
    }





}