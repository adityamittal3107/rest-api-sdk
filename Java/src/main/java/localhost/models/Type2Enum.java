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
 * Type2Enum to be used.
 */
public enum Type2Enum {
    ANSWER,

    LIVEBOARD,

    DATAOBJECT_ALL,

    DATAOBJECT_WORKSHEET,

    DATAOBJECT_TABLE,

    DATAOBJECT_USER_DEFINED,

    DATAOBJECT_VIEW,

    DATAOBJECT_CALENDAR_TABLE,

    COLUMN_ALL,

    COLUMN_WORKSHEET,

    COLUMN_TABLE,

    COLUMN_USER_DEFINED,

    COLUMN_VIEW,

    COLUMN_CALENDAR_TABLE,

    JOIN,

    CONNECTION,

    TAG,

    USER,

    USER_GROUP;


    private static TreeMap<String, Type2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ANSWER.value = "ANSWER";
        LIVEBOARD.value = "LIVEBOARD";
        DATAOBJECT_ALL.value = "DATAOBJECT_ALL";
        DATAOBJECT_WORKSHEET.value = "DATAOBJECT_WORKSHEET";
        DATAOBJECT_TABLE.value = "DATAOBJECT_TABLE";
        DATAOBJECT_USER_DEFINED.value = "DATAOBJECT_USER_DEFINED";
        DATAOBJECT_VIEW.value = "DATAOBJECT_VIEW";
        DATAOBJECT_CALENDAR_TABLE.value = "DATAOBJECT_CALENDAR_TABLE";
        COLUMN_ALL.value = "COLUMN_ALL";
        COLUMN_WORKSHEET.value = "COLUMN_WORKSHEET";
        COLUMN_TABLE.value = "COLUMN_TABLE";
        COLUMN_USER_DEFINED.value = "COLUMN_USER_DEFINED";
        COLUMN_VIEW.value = "COLUMN_VIEW";
        COLUMN_CALENDAR_TABLE.value = "COLUMN_CALENDAR_TABLE";
        JOIN.value = "JOIN";
        CONNECTION.value = "CONNECTION";
        TAG.value = "TAG";
        USER.value = "USER";
        USER_GROUP.value = "USER_GROUP";

        valueMap.put("ANSWER", ANSWER);
        valueMap.put("LIVEBOARD", LIVEBOARD);
        valueMap.put("DATAOBJECT_ALL", DATAOBJECT_ALL);
        valueMap.put("DATAOBJECT_WORKSHEET", DATAOBJECT_WORKSHEET);
        valueMap.put("DATAOBJECT_TABLE", DATAOBJECT_TABLE);
        valueMap.put("DATAOBJECT_USER_DEFINED", DATAOBJECT_USER_DEFINED);
        valueMap.put("DATAOBJECT_VIEW", DATAOBJECT_VIEW);
        valueMap.put("DATAOBJECT_CALENDAR_TABLE", DATAOBJECT_CALENDAR_TABLE);
        valueMap.put("COLUMN_ALL", COLUMN_ALL);
        valueMap.put("COLUMN_WORKSHEET", COLUMN_WORKSHEET);
        valueMap.put("COLUMN_TABLE", COLUMN_TABLE);
        valueMap.put("COLUMN_USER_DEFINED", COLUMN_USER_DEFINED);
        valueMap.put("COLUMN_VIEW", COLUMN_VIEW);
        valueMap.put("COLUMN_CALENDAR_TABLE", COLUMN_CALENDAR_TABLE);
        valueMap.put("JOIN", JOIN);
        valueMap.put("CONNECTION", CONNECTION);
        valueMap.put("TAG", TAG);
        valueMap.put("USER", USER);
        valueMap.put("USER_GROUP", USER_GROUP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type2Enum fromString(String toConvert) {
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
     * Convert list of Type2Enum values to list of string values.
     * @param toConvert The list of Type2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Type2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Type2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 