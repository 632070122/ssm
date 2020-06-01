package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Member;

public interface MemberDao {

    Member findById(String memberId);
}
