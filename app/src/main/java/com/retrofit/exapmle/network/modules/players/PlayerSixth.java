package com.retrofit.exapmle.network.modules.players;

import com.google.gson.annotations.SerializedName;

public class PlayerSixth {

    @SerializedName("Position")
    private String position;

    @SerializedName("Name_Full")
    private String Name_Full;

    @SerializedName("Iscaptain")
    private boolean iscaptain;

    @SerializedName("Iskeeper")
    private boolean iskeeper;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName_Full() {
        return Name_Full;
    }

    public void setName_Full(String name_Full) {
        Name_Full = name_Full;
    }

    public boolean isIscaptain() {
        return iscaptain;
    }

    public void setIscaptain(boolean iscaptain) {
        this.iscaptain = iscaptain;
    }

    public boolean isIskeeper() {
        return iskeeper;
    }

    public void setIskeeper(boolean iskeeper) {
        this.iskeeper = iskeeper;
    }
}
