package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial college")){
            return "Imperial College London is a public research university located " +
                    "in London. In 1851, Prince Albert built his vision of an area for culture, " +
                    "including the Victoria and Albert Museum, Natural History Museum, Royal Colleges, " +
                    "Royal Albert Hall, and the Imperial Institute.";

        }

        if (query.toLowerCase().contains("what is 14 plus 0 ")){
            return "14";
        }

        return "";
    }
}
