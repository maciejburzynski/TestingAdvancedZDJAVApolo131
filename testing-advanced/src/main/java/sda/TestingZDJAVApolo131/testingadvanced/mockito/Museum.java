package sda.TestingZDJAVApolo131.testingadvanced.mockito;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Museum {

//    Entity -> noargs constructor + getter + setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String Art;
    int price;

    public Museum() {
    }

    public Museum(String art, int price) {
        Art = art;
        this.price = price;
    }

    public Museum(Long id, String art, int price) {
        this.id = id;
        Art = art;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArt() {
        return Art;
    }

    public void setArt(String art) {
        Art = art;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
