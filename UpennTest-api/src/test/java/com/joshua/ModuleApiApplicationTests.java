package com.joshua;

import com.joshua.domain.Member;
import com.joshua.service.MemberServiceCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleApiApplicationTests {
    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    public void save() {
        Member member = new Member("joshua", "joshua@email.com");
        Long id = memberServiceCustom.signup(member);
        assertThat(id, is(1L));
    }
}