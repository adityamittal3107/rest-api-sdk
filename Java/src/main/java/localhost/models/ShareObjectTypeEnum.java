/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * ShareObjectTypeEnum to be used.
 */
public enum ShareObjectTypeEnum {
    LIVEBOARD,

    ANSWER,

    DATAOBJECT,

    COLUMN;


    private static TreeMap<String, ShareObjectTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        LIVEBOARD.value = "LIVEBOARD";
        ANSWER.value = "ANSWER";
        DATAOBJECT.value = "DATAOBJECT";
        COLUMN.value = "COLUMN";

        valueMap.put("LIVEBOARD", LIVEBOARD);
        valueMap.put("ANSWER", ANSWER);
        valueMap.put("DATAOBJECT", DATAOBJECT);
        valueMap.put("COLUMN", COLUMN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ShareObjectTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ShareObjectTypeEnum values to list of string values.
     * @param toConvert The list of ShareObjectTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShareObjectTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShareObjectTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 