package OOP.Abstraction;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
//Notation
@Getter
@Setter
@ToString
public class Email {
    private String uuid;
    private String topic;
    private String description;
    private LocalDate sentData;

//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//
//    public String getTopic() {
//        return topic;
//    }
//
//    public void setTopic(String topic) {
//        this.topic = topic;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public LocalDate getSentData() {
//        return sentData;
//    }
//
//    public void setSentData(LocalDate sentData) {
//        this.sentData = sentData;
//    }
//
//    @Override
//    public String toString() {
//        return "Email{" +
//                "uuid='" + uuid + '\'' +
//                ", topic='" + topic + '\'' +
//                ", description='" + description + '\'' +
//                ", sentData=" + sentData +
//                '}';
//    }
}
