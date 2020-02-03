package com.retrofit.exapmle.network.modules;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class MyResponse {

    @SerializedName("teams")
    private Map<String, Teams> teams;

    public Map<String, Teams> getTeams() {
        return teams;
    }

    public void setTeams(Map<String, Teams> teams) {
        this.teams = teams;
    }
}
