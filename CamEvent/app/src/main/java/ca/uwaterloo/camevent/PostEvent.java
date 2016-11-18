package ca.uwaterloo.camevent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mactang on 2016-11-14.
 */
public class PostEvent {
    public String uid;
    public String author;
    private String EventTitle;
    private String EventLocation;
    private String  EventDesc;
    private String capacity;
    private String  EventLink;
    private String  fromDate;
    private String fromTime;
    private String EventLatitude;
    private String EventLongitude;
    public int starCount = 0;
    public Map<String, Boolean> stars = new HashMap<>();

    public PostEvent() {

    }
    public PostEvent(String uid, String author, String EventTitle, String EventDesc,String eventLocation,String capacity,String fromDate,String fromTime, String EventLink, String eventLatitude, String eventLongitude ) {
        this.uid = uid;
        this.author = author;
        this.EventTitle = EventTitle;
        this.EventDesc = EventDesc;
        this.EventLocation=eventLocation;
        this.capacity=capacity;
        this.fromDate=fromDate;
        this.fromTime=fromTime;
        this.EventLink=EventLink;
        this.EventLatitude=EventLatitude;
        this.EventLongitude=EventLongitude;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", EventTitle);
        result.put("desc", EventDesc);
        result.put("location", EventLocation);
        result.put("capacity", capacity);
        result.put("fromDate", fromDate);
        result.put("fromTime", fromTime);
        result.put("starCount", starCount);
        result.put("stars", stars);

        return result;
    }
}


