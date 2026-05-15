package org.FOMIX.API.Services;

import org.FOMIX.POJO.MemberList.DeSerialize.Items;
import org.FOMIX.POJO.MemberList.DeSerialize.MemberListDeserialize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberListService {

    private static final List<String> memberIds = new ArrayList<>();
    private static final List<String> memberNames = new ArrayList<>();
    private static final List<String> memberPhoneNumbers = new ArrayList<>();
    private static final List<String> memberCodes = new ArrayList<>();

    private static final Map<String, Items> memberMap = new HashMap<>();

    //store all the values here
    public static void store(MemberListDeserialize data) {

        memberIds.clear();
        memberNames.clear();
        memberPhoneNumbers.clear();
        memberCodes.clear();

        for (Items items : data.getItems()) {
            memberIds.add(items.getId());
            memberNames.add(items.getName());
            memberPhoneNumbers.add(items.getPhone());
            memberCodes.add(items.getMember_code());

            // Key = name, Value = whole object
            memberMap.put(items.getName().toLowerCase(), items);
        }
    }

    public static String getIdByName(String name) {
        Items obj = memberMap.get(name.toLowerCase());

        if (obj == null) {
            throw new RuntimeException("Member not found: " + name);
        }
        return obj.getId();
    }

    public static String getPhoneByName(String name) {
        Items obj = memberMap.get(name.toLowerCase());

        if (obj == null) {
            throw new RuntimeException("Member not found: " + name);
        }
        return obj.getPhone();
    }

    public static String getCodeByName(String name) {
        Items obj = memberMap.get(name.toLowerCase());

        if (obj == null) {
            throw new RuntimeException("Member not found: " + name);
        }
        return obj.getMember_code();
    }

    public static String getNameByName(String name) {
        Items obj = memberMap.get(name.toLowerCase());

        if (obj == null) {
            throw new RuntimeException("Member not found: " + name);
        }
        return obj.getName();
    }
}
