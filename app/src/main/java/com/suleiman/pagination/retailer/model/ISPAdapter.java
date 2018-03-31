package com.suleiman.pagination.retailer.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.suleiman.pagination.retailer.model.response.Isp;

import java.io.IOException;

public class ISPAdapter extends TypeAdapter<Isp> {

    private final Gson gson;

    public ISPAdapter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public void write(JsonWriter jsonWriter, Isp guid) throws IOException {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Isp read(JsonReader jsonReader) throws IOException {
        Isp isp = new Isp();

        switch (jsonReader.peek()) {
            case STRING:
                // only a String, create the object

                //Gson gson = new Gson();
//                Type baseType = new TypeToken<Isp>() {
//                }.getType();
//                String jsonString = gson.toJson(isp, baseType);


                // return isp;
                break;

            case BEGIN_OBJECT:
                // full object, forward to Gson
                try {
                    isp = gson.fromJson(jsonReader, Isp.class);
                } catch (Exception e) {
                    e.printStackTrace();
                    isp = new Isp();
                }

                break;

            default:
                throw new RuntimeException("Expected object or string, not " + jsonReader.peek());
        }
        return isp;
    }
}