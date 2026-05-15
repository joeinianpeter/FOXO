package org.FOMIX.API.Payloads.MemberList;

import org.FOMIX.POJO.MemberList.Serialize.MemberListSerialize;
import org.FOMIX.POJO.MemberList.Serialize.Sort;

import java.util.Collections;

public class MemberListPayload {

    public static MemberListSerialize memberAPIPayload(){
        MemberListSerialize memberListSerialize = new MemberListSerialize();
        memberListSerialize.setPage(1);
        memberListSerialize.setSize(100);
        memberListSerialize.setTimezone("Asia/Calcutta");

        Sort sort = new Sort();
        sort.setField("name");
        sort.setDirection("asc");

        memberListSerialize.setSort(Collections.singletonList(sort));

        return memberListSerialize;
    }
}
