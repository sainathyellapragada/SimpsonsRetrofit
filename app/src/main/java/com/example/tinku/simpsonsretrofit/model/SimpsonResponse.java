package com.example.tinku.simpsonsretrofit.model;

import com.example.tinku.simpsonsretrofit.pojos.RelatedTopicsItem;

import java.util.ArrayList;

/**
 * Created by ryellap on 2/23/18.
 */

public class SimpsonResponse {


    ArrayList<RelatedTopicsItem> topicslist;

    public SimpsonResponse(ArrayList<RelatedTopicsItem> topicslist) {
        this.topicslist = topicslist;
    }

    public ArrayList<RelatedTopicsItem> getTopicslist() {
        return topicslist;
    }


}
