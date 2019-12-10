package com.ahs;

import org.apache.log4j.BasicConfigurator;
import spark.QueryParamsMap;

import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        staticFiles.location("/public");

        get("/api/sum", (req, res) -> {
            QueryParamsMap map = req.queryMap();
            try {
                Integer a = map.get("a").integerValue();
                Integer b = map.get("b").integerValue();
                return a + b;
            } catch (Exception e) {
                return "Error: " + e.getMessage();
            }
        });
    }

}
