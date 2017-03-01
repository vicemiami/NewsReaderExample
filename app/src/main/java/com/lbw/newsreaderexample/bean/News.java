package com.lbw.newsreaderexample.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hasee on 2017-03-01.
 */
@Entity
public class News {
    @Id
    Long _id;
    String imgurl,has_content,docurl,time,title,channelname;
    int id;

    public News(String imgurl, String has_content, String docurl, String time, String title, String channelname, int id) {
        this.imgurl = imgurl;
        this.has_content = has_content;
        this.docurl = docurl;
        this.time = time;
        this.title = title;
        this.channelname = channelname;
        this.id = id;
    }

    public News() {
    }

    @Generated(hash = 237096767)
    public News(Long _id, String imgurl, String has_content, String docurl, String time, String title, String channelname,
            int id) {
        this._id = _id;
        this.imgurl = imgurl;
        this.has_content = has_content;
        this.docurl = docurl;
        this.time = time;
        this.title = title;
        this.channelname = channelname;
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getHas_content() {
        return has_content;
    }

    public void setHas_content(String has_content) {
        this.has_content = has_content;
    }

    public String getDocurl() {
        return docurl;
    }

    public void setDocurl(String docurl) {
        this.docurl = docurl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }
}
