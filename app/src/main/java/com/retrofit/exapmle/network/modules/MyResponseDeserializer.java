package com.retrofit.exapmle.network.modules;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MyResponseDeserializer implements JsonDeserializer<MyResponse> {

    private static final String KEY_TEAMS = "teams";

    @Override
    public MyResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();

        // Read the dynamic parameters object.
        final Map<String, Teams> teams = readParametersMap(jsonObject);

        MyResponse result = new MyResponse();
        result.setTeams(teams);
        return result;

    }

    @Nullable
    private Map<String, Teams> readParametersMap(@NonNull final JsonObject jsonObject) {
        final JsonElement paramsElement = jsonObject.get(KEY_TEAMS);
        if (paramsElement == null) {
            // value not present at all, just return null
            return null;
        }

        Gson gson = new Gson();

//        NumberResponse response = new Gson().fromJson(json, NumberResponse.class);
//        Map<String, Number> map = new HashMap<>();
//        map = (Map<String, Number>) new Gson().fromJson(json, map.getClass());
//        response.setStringNumberMap(map);

        final JsonObject parametersObject = paramsElement.getAsJsonObject();
        final Map<String, Teams> parameters = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : parametersObject.entrySet()) {
            String key = entry.getKey();
            Teams value = gson.fromJson(entry.getValue(), Teams.class);
            //Teams value = entry.getValue();
            parameters.put(key, value);
        }
        return parameters;
    }
}
