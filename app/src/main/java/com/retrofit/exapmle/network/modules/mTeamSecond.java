package com.retrofit.exapmle.network.modules;

import com.google.gson.annotations.SerializedName;

public class mTeamSecond {

    @SerializedName("Name_Full")
    private String Name_Full;

    @SerializedName("Name_Short")
    private String Name_Short;

    @SerializedName("Players")
    private Players players;

    public String getName_Full() {
        return Name_Full;
    }

    public void setName_Full(String name_Full) {
        Name_Full = name_Full;
    }

    public String getName_Short() {
        return Name_Short;
    }

    public void setName_Short(String name_Short) {
        Name_Short = name_Short;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }
}
