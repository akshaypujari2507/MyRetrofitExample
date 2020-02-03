package com.retrofit.exapmle.network.modules;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Teams {

    private Map<String, mTeamFirst> teamFirstMap;
    private Map<String, mTeamSecond> teamSecondMap;

    public Map<String, mTeamFirst> getTeamFirstMap() {
        return teamFirstMap;
    }

    public void setTeamFirstMap(Map<String, mTeamFirst> teamFirstMap) {
        this.teamFirstMap = teamFirstMap;
    }

    public Map<String, mTeamSecond> getTeamSecondMap() {
        return teamSecondMap;
    }

    public void setTeamSecondMap(Map<String, mTeamSecond> teamSecondMap) {
        this.teamSecondMap = teamSecondMap;
    }
}
