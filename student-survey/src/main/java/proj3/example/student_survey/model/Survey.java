package proj3.example.student_survey.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "surveydata")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_Name", nullable = false)
    private String firstName;

    @Column(name = "last_Name", nullable = false)
    private String lastName;

    @Column(name = "street_Address", nullable = false)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private int zip;

    @Column(name = "tele_Number", nullable = false)
    private long teleNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "survey_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date surveyDate;

    @Column(name = "likes_about_campus", nullable = false)
    @Enumerated(EnumType.STRING)
    private CampusPreference likesAboutCampus;

    @Column(name = "interested_in_uni", nullable = false)
    @Enumerated(EnumType.STRING)
    private InterestSource interestedInUni;

    @Column(name = "recommend", nullable = false)
    @Enumerated(EnumType.STRING)
    private Recommendation recommend;

    
    //getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(long teleNumber) {
        this.teleNumber = teleNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public CampusPreference getLikesAboutCampus() {
        return likesAboutCampus;
    }

    public void setLikesAboutCampus(CampusPreference likesAboutCampus) {
        this.likesAboutCampus = likesAboutCampus;
    }

    public InterestSource getInterestedInUni() {
        return interestedInUni;
    }

    public void setInterestedInUni(InterestSource interestedInUni) {
        this.interestedInUni = interestedInUni;
    }

    public Recommendation getRecommend() {
        return recommend;
    }

    public void setRecommend(Recommendation recommend) {
        this.recommend = recommend;
    }
    
    
}
